package com.ruoyi.people.service;

import java.util.List;
import com.ruoyi.people.domain.TeacherDb;

/**
 * teacherService接口
 *
 * @author 邓周明
 * @date 2022-11-19
 */
public interface ITeacherDbService
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
     * 批量删除teacher
     *
     * @param ids 需要删除的teacher主键集合
     * @return 结果
     */
    public int deleteTeacherDbByIds(Long[] ids);

    /**
     * 删除teacher信息
     *
     * @param id teacher主键
     * @return 结果
     */
    public int deleteTeacherDbById(Long id);
}
