package com.competition.education.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.competition.common.annotation.Excel;
import com.competition.common.core.domain.BaseEntity;

/**
 * 报名组别对象 tb_group
 * 
 * @author crimson
 * @date 2024-06-25
 */
public class TbGroup extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 组别名称 */
    @Excel(name = "组别名称")
    private String groupName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGroupName(String groupName) 
    {
        this.groupName = groupName;
    }

    public String getGroupName() 
    {
        return groupName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("groupName", getGroupName())
            .toString();
    }
}
