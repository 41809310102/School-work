package com.ruoyi.people.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.people.mapper.TeacherDbMapper;
import com.ruoyi.people.domain.TeacherDb;
import com.ruoyi.people.service.ITeacherDbService;

/**
 * teacherService业务层处理
 *
 * @author 邓周明
 * @date 2022-11-19
 */
@Service
public class TeacherDbServiceImpl implements ITeacherDbService
{
    @Autowired
    private TeacherDbMapper teacherDbMapper;

    /**
     * 查询teacher
     *
     * @param id teacher主键
     * @return teacher
     */
    @Override
    public TeacherDb selectTeacherDbById(Long id)
    {
        return teacherDbMapper.selectTeacherDbById(id);
    }

    /**
     * 查询teacher列表
     *
     * @param teacherDb teacher
     * @return teacher
     */
    @Override
    public List<TeacherDb> selectTeacherDbList(TeacherDb teacherDb)
    {
        return teacherDbMapper.selectTeacherDbList(teacherDb);
    }

    /**
     * 新增teacher
     *
     * @param teacherDb teacher
     * @return 结果
     */
    @Override
    public int insertTeacherDb(TeacherDb teacherDb)
    {
        return teacherDbMapper.insertTeacherDb(teacherDb);
    }

    /**
     * 修改teacher
     *
     * @param teacherDb teacher
     * @return 结果
     */
    @Override
    public int updateTeacherDb(TeacherDb teacherDb)
    {
        return teacherDbMapper.updateTeacherDb(teacherDb);
    }

    /**
     * 批量删除teacher
     *
     * @param ids 需要删除的teacher主键
     * @return 结果
     */
    @Override
    public int deleteTeacherDbByIds(Long[] ids)
    {
        return teacherDbMapper.deleteTeacherDbByIds(ids);
    }

    /**
     * 删除teacher信息
     *
     * @param id teacher主键
     * @return 结果
     */
    @Override
    public int deleteTeacherDbById(Long id)
    {
        return teacherDbMapper.deleteTeacherDbById(id);
    }
}
