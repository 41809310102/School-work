package com.ruoyi.people.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * student对象 student_db
 *
 * @author 邓周明
 * @date 2022-11-19
 */
public class StudentDb extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 学生ID */
    @Excel(name = "学生ID")
    private String stuId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String stuName;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String sfzId;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

    /** 民族 */
    @Excel(name = "民族")
    private String mz;

    /** 社会面貌 */
    @Excel(name = "社会面貌")
    private String zhuzi;

    /** 家庭住址 */
    @Excel(name = "家庭住址")
    private String address;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phone;

    /** 爱好 */
    @Excel(name = "爱好")
    private String hobby;

    /** 班级 */
    @Excel(name = "班级")
    private String stuClass;

    /** 年级 */
    @Excel(name = "年级")
    private String stuNianji;

    /** 班主任 */
    @Excel(name = "班主任")
    private String stuBzr;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setStuId(String stuId)
    {
        this.stuId = stuId;
    }

    public String getStuId()
    {
        return stuId;
    }
    public void setStuName(String stuName)
    {
        this.stuName = stuName;
    }

    public String getStuName()
    {
        return stuName;
    }
    public void setSfzId(String sfzId)
    {
        this.sfzId = sfzId;
    }

    public String getSfzId()
    {
        return sfzId;
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
    public void setMz(String mz)
    {
        this.mz = mz;
    }

    public String getMz()
    {
        return mz;
    }
    public void setZhuzi(String zhuzi)
    {
        this.zhuzi = zhuzi;
    }

    public String getZhuzi()
    {
        return zhuzi;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }
    public void setHobby(String hobby)
    {
        this.hobby = hobby;
    }

    public String getHobby()
    {
        return hobby;
    }
    public void setStuClass(String stuClass)
    {
        this.stuClass = stuClass;
    }

    public String getStuClass()
    {
        return stuClass;
    }
    public void setStuNianji(String stuNianji)
    {
        this.stuNianji = stuNianji;
    }

    public String getStuNianji()
    {
        return stuNianji;
    }
    public void setStuBzr(String stuBzr)
    {
        this.stuBzr = stuBzr;
    }

    public String getStuBzr()
    {
        return stuBzr;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("stuId", getStuId())
                .append("stuName", getStuName())
                .append("sfzId", getSfzId())
                .append("sex", getSex())
                .append("age", getAge())
                .append("mz", getMz())
                .append("zhuzi", getZhuzi())
                .append("address", getAddress())
                .append("phone", getPhone())
                .append("hobby", getHobby())
                .append("stuClass", getStuClass())
                .append("stuNianji", getStuNianji())
                .append("stuBzr", getStuBzr())
                .toString();
    }
}
