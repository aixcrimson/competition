package com.competition.education.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.competition.common.annotation.Excel;
import com.competition.common.core.domain.BaseEntity;

/**
 * 用户对象 tb_users
 * 
 * @author crimson
 * @date 2024-06-25
 */
public class Users extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 学校 */
    @Excel(name = "学校")
    private String school;

    /** 身份 */
    @Excel(name = "身份")
    private Long role;

    /** 评选范围(仅评委有) */
    @Excel(name = "评选范围(仅评委有)")
    private String evaluationScope;

    /** 账号名 */
    @Excel(name = "账号名")
    private String username;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 报名组别 */
    @Excel(name = "报名组别")
    private Long groupId;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSchool(String school) 
    {
        this.school = school;
    }

    public String getSchool() 
    {
        return school;
    }
    public void setRole(Long role) 
    {
        this.role = role;
    }

    public Long getRole() 
    {
        return role;
    }
    public void setEvaluationScope(String evaluationScope) 
    {
        this.evaluationScope = evaluationScope;
    }

    public String getEvaluationScope() 
    {
        return evaluationScope;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setGroupId(Long groupId) 
    {
        this.groupId = groupId;
    }

    public Long getGroupId() 
    {
        return groupId;
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
            .append("name", getName())
            .append("school", getSchool())
            .append("role", getRole())
            .append("evaluationScope", getEvaluationScope())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("groupId", getGroupId())
            .append("tbGroupList", getTbGroupList())
            .toString();
    }
}
