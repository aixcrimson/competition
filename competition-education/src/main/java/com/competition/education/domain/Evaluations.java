package com.competition.education.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.competition.common.annotation.Excel;
import com.competition.common.core.domain.BaseEntity;

/**
 * 评价对象 tb_evaluations
 * 
 * @author crimson
 * @date 2024-06-25
 */
public class Evaluations extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 作品 */
    @Excel(name = "作品")
    private Long workId;

    /** 评委 */
    @Excel(name = "评委")
    private Long evaluatorId;

    /** 教学实施评分 */
    @Excel(name = "教学实施评分")
    private Long teachingImplementation;

    /** 教案评分 */
    @Excel(name = "教案评分")
    private Long lessonPlan;

    /** 视频评分 */
    @Excel(name = "视频评分")
    private Long videoMaterial;

    /** 专业人才培养方案评分 */
    @Excel(name = "专业人才培养方案评分")
    private Long talentTrainingPlan;

    /** 课程标准评分 */
    @Excel(name = "课程标准评分")
    private Long courseStandard;

    /** 教材选用评分 */
    @Excel(name = "教材选用评分")
    private Long teachingMaterial;

    /** 总得分 */
    @Excel(name = "总得分")
    private BigDecimal score;

    /** 评分时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "评分时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date evaluationTime;

    /** 学校 */
    @Excel(name = "学校")
    private String school;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWorkId(Long workId) 
    {
        this.workId = workId;
    }

    public Long getWorkId() 
    {
        return workId;
    }
    public void setEvaluatorId(Long evaluatorId) 
    {
        this.evaluatorId = evaluatorId;
    }

    public Long getEvaluatorId() 
    {
        return evaluatorId;
    }
    public void setTeachingImplementation(Long teachingImplementation) 
    {
        this.teachingImplementation = teachingImplementation;
    }

    public Long getTeachingImplementation() 
    {
        return teachingImplementation;
    }
    public void setLessonPlan(Long lessonPlan) 
    {
        this.lessonPlan = lessonPlan;
    }

    public Long getLessonPlan() 
    {
        return lessonPlan;
    }
    public void setVideoMaterial(Long videoMaterial) 
    {
        this.videoMaterial = videoMaterial;
    }

    public Long getVideoMaterial() 
    {
        return videoMaterial;
    }
    public void setTalentTrainingPlan(Long talentTrainingPlan) 
    {
        this.talentTrainingPlan = talentTrainingPlan;
    }

    public Long getTalentTrainingPlan() 
    {
        return talentTrainingPlan;
    }
    public void setCourseStandard(Long courseStandard) 
    {
        this.courseStandard = courseStandard;
    }

    public Long getCourseStandard() 
    {
        return courseStandard;
    }
    public void setTeachingMaterial(Long teachingMaterial) 
    {
        this.teachingMaterial = teachingMaterial;
    }

    public Long getTeachingMaterial() 
    {
        return teachingMaterial;
    }
    public void setScore(BigDecimal score) 
    {
        this.score = score;
    }

    public BigDecimal getScore() 
    {
        return score;
    }
    public void setEvaluationTime(Date evaluationTime) 
    {
        this.evaluationTime = evaluationTime;
    }

    public Date getEvaluationTime() 
    {
        return evaluationTime;
    }
    public void setSchool(String school) 
    {
        this.school = school;
    }

    public String getSchool() 
    {
        return school;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("workId", getWorkId())
            .append("evaluatorId", getEvaluatorId())
            .append("teachingImplementation", getTeachingImplementation())
            .append("lessonPlan", getLessonPlan())
            .append("videoMaterial", getVideoMaterial())
            .append("talentTrainingPlan", getTalentTrainingPlan())
            .append("courseStandard", getCourseStandard())
            .append("teachingMaterial", getTeachingMaterial())
            .append("score", getScore())
            .append("evaluationTime", getEvaluationTime())
            .append("school", getSchool())
            .toString();
    }
}
