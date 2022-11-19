package com.ruoyi.web.controller.people;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.people.domain.TeacherDb;
import com.ruoyi.people.service.ITeacherDbService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * teacherController
 *
 * @author 邓周明
 * @date 2022-11-19
 */
@RestController
@RequestMapping("/people/teacher")
public class TeacherDbController extends BaseController
{
    @Autowired
    private ITeacherDbService teacherDbService;

    /**
     * 查询teacher列表
     */
    @PreAuthorize("@ss.hasPermi('people:teacher:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeacherDb teacherDb)
    {
        startPage();
        List<TeacherDb> list = teacherDbService.selectTeacherDbList(teacherDb);
        return getDataTable(list);
    }

    /**
     * 导出teacher列表
     */
    @PreAuthorize("@ss.hasPermi('people:teacher:export')")
    @Log(title = "teacher", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeacherDb teacherDb)
    {
        List<TeacherDb> list = teacherDbService.selectTeacherDbList(teacherDb);
        ExcelUtil<TeacherDb> util = new ExcelUtil<TeacherDb>(TeacherDb.class);
        util.exportExcel(response, list, "teacher数据");
    }

    /**
     * 获取teacher详细信息
     */
    @PreAuthorize("@ss.hasPermi('people:teacher:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(teacherDbService.selectTeacherDbById(id));
    }

    /**
     * 新增teacher
     */
    @PreAuthorize("@ss.hasPermi('people:teacher:add')")
    @Log(title = "teacher", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeacherDb teacherDb)
    {
        return toAjax(teacherDbService.insertTeacherDb(teacherDb));
    }

    /**
     * 修改teacher
     */
    @PreAuthorize("@ss.hasPermi('people:teacher:edit')")
    @Log(title = "teacher", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeacherDb teacherDb)
    {
        return toAjax(teacherDbService.updateTeacherDb(teacherDb));
    }

    /**
     * 删除teacher
     */
    @PreAuthorize("@ss.hasPermi('people:teacher:remove')")
    @Log(title = "teacher", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(teacherDbService.deleteTeacherDbByIds(ids));
    }
}
