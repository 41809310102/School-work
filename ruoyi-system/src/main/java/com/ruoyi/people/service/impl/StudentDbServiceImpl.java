package com.ruoyi.people.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.people.mapper.StudentDbMapper;
import com.ruoyi.people.domain.StudentDb;
import com.ruoyi.people.service.IStudentDbService;

/**
 * studentService业务层处理
 *
 * @author 邓周明
 * @date 2022-11-19
 */
@Service
public class StudentDbServiceImpl implements IStudentDbService
{
    @Autowired
    private StudentDbMapper studentDbMapper;

    /**
     * 查询student
     *
     * @param id student主键
     * @return student
     */
    @Override
    public StudentDb selectStudentDbById(Long id)
    {
        return studentDbMapper.selectStudentDbById(id);
    }

    /**
     * 查询student列表
     *
     * @param studentDb student
     * @return student
     */
    @Override
    public List<StudentDb> selectStudentDbList(StudentDb studentDb)
    {
        return studentDbMapper.selectStudentDbList(studentDb);
    }

    /**
     * 新增student
     *
     * @param studentDb student
     * @return 结果
     */
    @Override
    public int insertStudentDb(StudentDb studentDb)
    {
        return studentDbMapper.insertStudentDb(studentDb);
    }

    /**
     * 修改student
     *
     * @param studentDb student
     * @return 结果
     */
    @Override
    public int updateStudentDb(StudentDb studentDb)
    {
        return studentDbMapper.updateStudentDb(studentDb);
    }

    /**
     * 批量删除student
     *
     * @param ids 需要删除的student主键
     * @return 结果
     */
    @Override
    public int deleteStudentDbByIds(Long[] ids)
    {
        return studentDbMapper.deleteStudentDbByIds(ids);
    }

    /**
     * 删除student信息
     *
     * @param id student主键
     * @return 结果
     */
    @Override
    public int deleteStudentDbById(Long id)
    {
        return studentDbMapper.deleteStudentDbById(id);
    }
}
