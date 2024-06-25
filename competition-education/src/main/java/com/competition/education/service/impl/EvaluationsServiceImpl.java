package com.competition.education.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.competition.education.mapper.EvaluationsMapper;
import com.competition.education.domain.Evaluations;
import com.competition.education.service.IEvaluationsService;

/**
 * 评价Service业务层处理
 * 
 * @author crimson
 * @date 2024-06-25
 */
@Service
public class EvaluationsServiceImpl implements IEvaluationsService 
{
    @Autowired
    private EvaluationsMapper evaluationsMapper;

    /**
     * 查询评价
     * 
     * @param id 评价主键
     * @return 评价
     */
    @Override
    public Evaluations selectEvaluationsById(Long id)
    {
        return evaluationsMapper.selectEvaluationsById(id);
    }

    /**
     * 查询评价列表
     * 
     * @param evaluations 评价
     * @return 评价
     */
    @Override
    public List<Evaluations> selectEvaluationsList(Evaluations evaluations)
    {
        return evaluationsMapper.selectEvaluationsList(evaluations);
    }

    /**
     * 新增评价
     * 
     * @param evaluations 评价
     * @return 结果
     */
    @Override
    public int insertEvaluations(Evaluations evaluations)
    {
        return evaluationsMapper.insertEvaluations(evaluations);
    }

    /**
     * 修改评价
     * 
     * @param evaluations 评价
     * @return 结果
     */
    @Override
    public int updateEvaluations(Evaluations evaluations)
    {
        return evaluationsMapper.updateEvaluations(evaluations);
    }

    /**
     * 批量删除评价
     * 
     * @param ids 需要删除的评价主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationsByIds(Long[] ids)
    {
        return evaluationsMapper.deleteEvaluationsByIds(ids);
    }

    /**
     * 删除评价信息
     * 
     * @param id 评价主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationsById(Long id)
    {
        return evaluationsMapper.deleteEvaluationsById(id);
    }
}
