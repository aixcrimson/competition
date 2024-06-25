package com.competition.education.mapper;

import java.util.List;
import com.competition.education.domain.Works;
import com.competition.education.domain.TbGroup;

/**
 * 作品Mapper接口
 * 
 * @author crimson
 * @date 2024-06-25
 */
public interface WorksMapper 
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
     * 删除作品
     * 
     * @param id 作品主键
     * @return 结果
     */
    public int deleteWorksById(Long id);

    /**
     * 批量删除作品
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWorksByIds(Long[] ids);

    /**
     * 批量删除报名组别
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbGroupByIds(Long[] ids);
    
    /**
     * 批量新增报名组别
     * 
     * @param tbGroupList 报名组别列表
     * @return 结果
     */
    public int batchTbGroup(List<TbGroup> tbGroupList);
    

    /**
     * 通过作品主键删除报名组别信息
     * 
     * @param id 作品ID
     * @return 结果
     */
    public int deleteTbGroupById(Long id);
}
