package com.ruoyi.web.controller.people;

import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson2.JSON;
import com.ruoyi.people.damain.Zhexian;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping(value = "/demo")
    public HashMap demo(@RequestParam String username,@RequestParam String sex,@RequestParam String phone,
                        @RequestParam String address,@RequestParam String sfz){
        System.out.println(username+sex+address+sfz+phone);
        HomeDb homeDb = new HomeDb();
        homeDb.setAddress(address);
        homeDb.setPhone(phone);
        homeDb.setSfz(sfz);
        homeDb.setUsername(username);


        if(sex.equals("男")){
            homeDb.setSex("0");
        }else{
            homeDb.setSex("1");
        }
        int ret = homeDbService.insertHomeDb(homeDb);
        HashMap<String,String> map = new HashMap<>();
        if(ret>0){
            map.put("code","1");
            map.put("msg","success");
        }else{
            map.put("code","0");
            map.put("msg","fail");
        }
        return map;
    }



    @GetMapping(value = "/chart/demo1")
    public AjaxResult demo1(){
        HashMap<String,Object> map = new HashMap<>();
        int[] arr = new int[7];
        String[] arr1 = new String[7];
        arr1[0] = "京东";
        arr1[1] = "阿里";
        arr1[2] = "美团";
        arr1[3] = "腾讯";
        arr1[4] = "哔哩哔哩";
        arr1[5] = "字节";
        arr1[6] = "百度";
        arr[0] = 23000;
        arr[1] = 25000;
        arr[2] = 23000;
        arr[3] = 26000;
        arr[4] = 25000;
        arr[5] = 24000;
        arr[6] = 22000;
        map.put("code","0");
        map.put("msg","ok");
        map.put("xdata",arr1);
        map.put("ydata",arr);
        return success(map);
    }

}
