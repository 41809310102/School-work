package com.ruoyi.people.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * home对象 home_db
 *
 * @author 邓周明
 * @date 2022-11-19
 */
public class HomeDb extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 家长ID */
    @Excel(name = "家长ID")
    private String homeId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String username;

    /** 社会面貌 */
    @Excel(name = "社会面貌")
    private String shihui;

    /** 家庭住址 */
    @Excel(name = "家庭住址")
    private String address;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String sfz;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phone;

    /** 孩子ID */
    @Excel(name = "孩子ID")
    private String stuId;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;



    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setHomeId(String homeId)
    {
        this.homeId = homeId;
    }

    public String getHomeId()
    {
        return homeId;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUsername()
    {
        return username;
    }
    public void setShihui(String shihui)
    {
        this.shihui = shihui;
    }

    public String getShihui()
    {
        return shihui;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setSfz(String sfz)
    {
        this.sfz = sfz;
    }

    public String getSfz()
    {
        return sfz;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }
    public void setStuId(String stuId)
    {
        this.stuId = stuId;
    }

    public String getStuId()
    {
        return stuId;
    }
    public void setAge(String age)
    {
        this.age = age;
    }

    public String getAge()
    {
        return age;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("homeId", getHomeId())
                .append("username", getUsername())
                .append("shihui", getShihui())
                .append("address", getAddress())
                .append("sex", getSex())
                .append("sfz", getSfz())
                .append("phone", getPhone())
                .append("stuId", getStuId())
                .append("age", getAge())
                .toString();
    }
}
