package com.ruoyi.people.mapper;

import java.util.List;
import com.ruoyi.people.domain.StudentDb;

/**
 * studentMapper接口
 *
 * @author 邓周明
 * @date 2022-11-19
 */
public interface StudentDbMapper
{
    /**
     * 查询student
     *
     * @param id student主键
     * @return student
     */
    public StudentDb selectStudentDbById(Long id);

    /**
     * 查询student列表
     *
     * @param studentDb student
     * @return student集合
     */
    public List<StudentDb> selectStudentDbList(StudentDb studentDb);

    /**
     * 新增student
     *
     * @param studentDb student
     * @return 结果
     */
    public int insertStudentDb(StudentDb studentDb);

    /**
     * 修改student
     *
     * @param studentDb student
     * @return 结果
     */
    public int updateStudentDb(StudentDb studentDb);

    /**
     * 删除student
     *
     * @param id student主键
     * @return 结果
     */
    public int deleteStudentDbById(Long id);

    /**
     * 批量删除student
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudentDbByIds(Long[] ids);
}
