package com.competition.education.mapper;

import java.util.List;
import com.competition.education.domain.Evaluations;

/**
 * 评价Mapper接口
 * 
 * @author crimson
 * @date 2024-06-25
 */
public interface EvaluationsMapper 
{
    /**
     * 查询评价
     * 
     * @param id 评价主键
     * @return 评价
     */
    public Evaluations selectEvaluationsById(Long id);

    /**
     * 查询评价列表
     * 
     * @param evaluations 评价
     * @return 评价集合
     */
    public List<Evaluations> selectEvaluationsList(Evaluations evaluations);

    /**
     * 新增评价
     * 
     * @param evaluations 评价
     * @return 结果
     */
    public int insertEvaluations(Evaluations evaluations);

    /**
     * 修改评价
     * 
     * @param evaluations 评价
     * @return 结果
     */
    public int updateEvaluations(Evaluations evaluations);

    /**
     * 删除评价
     * 
     * @param id 评价主键
     * @return 结果
     */
    public int deleteEvaluationsById(Long id);

    /**
     * 批量删除评价
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEvaluationsByIds(Long[] ids);
}
