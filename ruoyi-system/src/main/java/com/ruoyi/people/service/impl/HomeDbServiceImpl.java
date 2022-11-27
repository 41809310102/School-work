package com.ruoyi.people.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.people.mapper.HomeDbMapper;
import com.ruoyi.people.domain.HomeDb;
import com.ruoyi.people.service.IHomeDbService;

/**
 * homeService业务层处理
 *
 * @author 邓周明
 * @date 2022-11-19
 */
@Service
public class HomeDbServiceImpl implements IHomeDbService
{
    @Autowired
    private HomeDbMapper homeDbMapper;

    /**
     * 查询home
     *
     * @param id home主键
     * @return home
     */
    @Override
    public HomeDb selectHomeDbById(Long id)
    {
        return homeDbMapper.selectHomeDbById(id);
    }

    /**
     * 查询home列表
     *
     * @param homeDb home
     * @return home
     */
    @Override
    public List<HomeDb> selectHomeDbList(HomeDb homeDb)
    {
        return homeDbMapper.selectHomeDbList(homeDb);
    }

    /**
     * 新增home
     *
     * @param homeDb home
     * @return 结果
     */
    @Override
    public int insertHomeDb(HomeDb homeDb)
    {
        homeDb.setHomeId("sjdkdkmkm");

        return homeDbMapper.insertHomeDb(homeDb);
    }

    /**
     * 修改home
     *
     * @param homeDb home
     * @return 结果
     */
    @Override
    public int updateHomeDb(HomeDb homeDb)
    {
        return homeDbMapper.updateHomeDb(homeDb);
    }

    /**
     * 批量删除home
     *
     * @param ids 需要删除的home主键
     * @return 结果
     */
    @Override
    public int deleteHomeDbByIds(Long[] ids)
    {
        return homeDbMapper.deleteHomeDbByIds(ids);
    }

    /**
     * 删除home信息
     *
     * @param id home主键
     * @return 结果
     */
    @Override
    public int deleteHomeDbById(Long id)
    {
        return homeDbMapper.deleteHomeDbById(id);
    }
}
