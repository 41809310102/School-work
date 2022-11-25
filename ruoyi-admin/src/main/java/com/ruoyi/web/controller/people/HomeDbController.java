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
import com.ruoyi.people.domain.HomeDb;
import com.ruoyi.people.service.IHomeDbService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * homeController
 *
 * @author 邓周明
 * @date 2022-11-19
 */
@RestController
@RequestMapping("/people/home")
public class HomeDbController extends BaseController
{
    @Autowired
    private IHomeDbService homeDbService;

    /**
     * 查询home列表
     */
    @PreAuthorize("@ss.hasPermi('people:home:list')")
    @GetMapping("/list")
    public TableDataInfo list(HomeDb homeDb)
    {
        startPage();
        List<HomeDb> list = homeDbService.selectHomeDbList(homeDb);
        return getDataTable(list);
    }

    /**
     * 导出home列表
     */
    @PreAuthorize("@ss.hasPermi('people:home:export')")
    @Log(title = "home", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HomeDb homeDb)
    {
        List<HomeDb> list = homeDbService.selectHomeDbList(homeDb);
        ExcelUtil<HomeDb> util = new ExcelUtil<HomeDb>(HomeDb.class);
        util.exportExcel(response, list, "home数据");
    }

    /**
     * 获取home详细信息
     */
    @PreAuthorize("@ss.hasPermi('people:home:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(homeDbService.selectHomeDbById(id));
    }

    /**
     * 新增home
     */
    @PreAuthorize("@ss.hasPermi('people:home:add')")
    @Log(title = "home", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HomeDb homeDb)
    {
        return toAjax(homeDbService.insertHomeDb(homeDb));
    }

    /**
     * 修改home
     */
    @PreAuthorize("@ss.hasPermi('people:home:edit')")
    @Log(title = "home", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HomeDb homeDb)
    {
        return toAjax(homeDbService.updateHomeDb(homeDb));
    }

    /**
     * 删除home
     */
    @PreAuthorize("@ss.hasPermi('people:home:remove')")
    @Log(title = "home", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(homeDbService.deleteHomeDbByIds(ids));
    }
}
