package com.ruoyi.people.mapper;

import java.util.List;
import com.ruoyi.people.domain.HomeDb;

/**
 * homeMapper接口
 *
 * @author 邓周明
 * @date 2022-11-19
 */
public interface HomeDbMapper
{
    /**
     * 查询home
     *
     * @param id home主键
     * @return home
     */
    public HomeDb selectHomeDbById(Long id);

    /**
     * 查询home列表
     *
     * @param homeDb home
     * @return home集合
     */
    public List<HomeDb> selectHomeDbList(HomeDb homeDb);

    /**
     * 新增home
     *
     * @param homeDb home
     * @return 结果
     */
    public int insertHomeDb(HomeDb homeDb);

    /**
     * 修改home
     *
     * @param homeDb home
     * @return 结果
     */
    public int updateHomeDb(HomeDb homeDb);

    /**
     * 删除home
     *
     * @param id home主键
     * @return 结果
     */
    public int deleteHomeDbById(Long id);

    /**
     * 批量删除home
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHomeDbByIds(Long[] ids);
}
