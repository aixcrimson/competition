package com.competition.education.service;

import java.util.List;
import com.competition.education.domain.Works;

/**
 * 作品Service接口
 * 
 * @author crimson
 * @date 2024-06-25
 */
public interface IWorksService 
{
    /**
     * 查询作品
     * 
     * @param id 作品主键
     * @return 作品
     */
    public Works selectWorksById(Long id);

    /**
     * 查询作品列表
     * 
     * @param works 作品
     * @return 作品集合
     */
    public List<Works> selectWorksList(Works works);

    /**
     * 新增作品
     * 
     * @param works 作品
     * @return 结果
     */
    public int insertWorks(Works works);

    /**
     * 修改作品
     * 
     * @param works 作品
     * @return 结果
     */
    public int updateWorks(Works works);

    /**
     * 批量删除作品
     * 
     * @param ids 需要删除的作品主键集合
     * @return 结果
     */
    public int deleteWorksByIds(Long[] ids);

    /**
     * 删除作品信息
     * 
     * @param id 作品主键
     * @return 结果
     */
    public int deleteWorksById(Long id);
}
