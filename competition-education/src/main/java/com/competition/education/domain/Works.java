package com.competition.education.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.competition.common.annotation.Excel;
import com.competition.common.core.domain.BaseEntity;

/**
 * 作品对象 tb_works
 * 
 * @author crimson
 * @date 2024-06-25
 */
public class Works extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 作品名称 */
    private String title;

    /** 学校 */
    private String school;

    /** 参赛姓名 */
    private String contestant;

    /** 联系方式 */
    private String contactInfo;

    /** 报名组别id */
    private Long groupId;

    /** 实时平均分 */
    private BigDecimal averageScore;

    /** 提交时间 */
    private Date submitTime;

    /** 报名组别信息 */
    private List<TbGroup> tbGroupList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setSchool(String school) 
    {
        this.school = school;
    }

    public String getSchool() 
    {
        return school;
    }
    public void setContestant(String contestant) 
    {
        this.contestant = contestant;
    }

    public String getContestant() 
    {
        return contestant;
    }
    public void setContactInfo(String contactInfo) 
    {
        this.contactInfo = contactInfo;
    }

    public String getContactInfo() 
    {
        return contactInfo;
    }
    public void setGroupId(Long groupId) 
    {
        this.groupId = groupId;
    }

    public Long getGroupId() 
    {
        return groupId;
    }
    public void setAverageScore(BigDecimal averageScore) 
    {
        this.averageScore = averageScore;
    }

    public BigDecimal getAverageScore() 
    {
        return averageScore;
    }
    public void setSubmitTime(Date submitTime) 
    {
        this.submitTime = submitTime;
    }

    public Date getSubmitTime() 
    {
        return submitTime;
    }

    public List<TbGroup> getTbGroupList()
    {
        return tbGroupList;
    }

    public void setTbGroupList(List<TbGroup> tbGroupList)
    {
        this.tbGroupList = tbGroupList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("school", getSchool())
            .append("contestant", getContestant())
            .append("contactInfo", getContactInfo())
            .append("groupId", getGroupId())
            .append("averageScore", getAverageScore())
            .append("submitTime", getSubmitTime())
            .append("tbGroupList", getTbGroupList())
            .toString();
    }
}
