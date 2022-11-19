package com.ruoyi.people.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * teacher对象 teacher_db
 *
 * @author 邓周明
 * @date 2022-11-19
 */
public class TeacherDb extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 教师ID */
    @Excel(name = "教师ID")
    private String teacherId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String username;

    /** 工号 */
    @Excel(name = "工号")
    private String teaGh;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phone;

    /** 民族 */
    @Excel(name = "民族")
    private String mingzhu;

    /** 爱好 */
    @Excel(name = "爱好")
    private String hobby;

    /** 任课类型 */
    @Excel(name = "任课类型")
    private String type;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setTeacherId(String teacherId)
    {
        this.teacherId = teacherId;
    }

    public String getTeacherId()
    {
        return teacherId;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUsername()
    {
        return username;
    }
    public void setTeaGh(String teaGh)
    {
        this.teaGh = teaGh;
    }

    public String getTeaGh()
    {
        return teaGh;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setAge(String age)
    {
        this.age = age;
    }

    public String getAge()
    {
        return age;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }
    public void setMingzhu(String mingzhu)
    {
        this.mingzhu = mingzhu;
    }

    public String getMingzhu()
    {
        return mingzhu;
    }
    public void setHobby(String hobby)
    {
        this.hobby = hobby;
    }

    public String getHobby()
    {
        return hobby;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("teacherId", getTeacherId())
                .append("username", getUsername())
                .append("teaGh", getTeaGh())
                .append("sex", getSex())
                .append("age", getAge())
                .append("phone", getPhone())
                .append("mingzhu", getMingzhu())
                .append("hobby", getHobby())
                .append("type", getType())
                .toString();
    }
}
