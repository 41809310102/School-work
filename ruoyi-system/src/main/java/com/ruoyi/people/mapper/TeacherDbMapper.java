package com.ruoyi.people.mapper;

import java.util.List;
import com.ruoyi.people.domain.TeacherDb;

/**
 * teacherMapper接口
 *
 * @author 邓周明
 * @date 2022-11-19
 */
public interface TeacherDbMapper
{
    /**
     * 查询teacher
     *
     * @param id teacher主键
     * @return teacher
     */
    public TeacherDb selectTeacherDbById(Long id);

    /**
     * 查询teacher列表
     *
     * @param teacherDb teacher
     * @return teacher集合
     */
    public List<TeacherDb> selectTeacherDbList(TeacherDb teacherDb);

    /**
     * 新增teacher
     *
     * @param teacherDb teacher
     * @return 结果
     */
    public int insertTeacherDb(TeacherDb teacherDb);

    /**
     * 修改teacher
     *
     * @param teacherDb teacher
     * @return 结果
     */
    public int updateTeacherDb(TeacherDb teacherDb);

    /**
     * 删除teacher
     *
     * @param id teacher主键
     * @return 结果
     */
    public int deleteTeacherDbById(Long id);

    /**
     * 批量删除teacher
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeacherDbByIds(Long[] ids);
}
