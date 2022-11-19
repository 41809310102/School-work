package com.ruoyi.people.controller;

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
import com.ruoyi.people.domain.StudentDb;
import com.ruoyi.people.service.IStudentDbService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * studentController
 *
 * @author 邓周明
 * @date 2022-11-19
 */
@RestController
@RequestMapping("/people/student")
public class StudentDbController extends BaseController
{
    @Autowired
    private IStudentDbService studentDbService;

    /**
     * 查询student列表
     */
    @PreAuthorize("@ss.hasPermi('people:student:list')")
    @GetMapping("/list")
    public TableDataInfo list(StudentDb studentDb)
    {
        startPage();
        List<StudentDb> list = studentDbService.selectStudentDbList(studentDb);
        return getDataTable(list);
    }

    /**
     * 导出student列表
     */
    @PreAuthorize("@ss.hasPermi('people:student:export')")
    @Log(title = "student", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StudentDb studentDb)
    {
        List<StudentDb> list = studentDbService.selectStudentDbList(studentDb);
        ExcelUtil<StudentDb> util = new ExcelUtil<StudentDb>(StudentDb.class);
        util.exportExcel(response, list, "student数据");
    }

    /**
     * 获取student详细信息
     */
    @PreAuthorize("@ss.hasPermi('people:student:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(studentDbService.selectStudentDbById(id));
    }

    /**
     * 新增student
     */
    @PreAuthorize("@ss.hasPermi('people:student:add')")
    @Log(title = "student", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StudentDb studentDb)
    {
        return toAjax(studentDbService.insertStudentDb(studentDb));
    }

    /**
     * 修改student
     */
    @PreAuthorize("@ss.hasPermi('people:student:edit')")
    @Log(title = "student", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StudentDb studentDb)
    {
        return toAjax(studentDbService.updateStudentDb(studentDb));
    }

    /**
     * 删除student
     */
    @PreAuthorize("@ss.hasPermi('people:student:remove')")
    @Log(title = "student", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(studentDbService.deleteStudentDbByIds(ids));
    }
}
