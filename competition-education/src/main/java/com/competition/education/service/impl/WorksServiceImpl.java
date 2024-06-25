package com.competition.education.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.competition.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.competition.education.domain.TbGroup;
import com.competition.education.mapper.WorksMapper;
import com.competition.education.domain.Works;
import com.competition.education.service.IWorksService;

/**
 * 作品Service业务层处理
 * 
 * @author crimson
 * @date 2024-06-25
 */
@Service
public class WorksServiceImpl implements IWorksService 
{
    @Autowired
    private WorksMapper worksMapper;

    /**
     * 查询作品
     * 
     * @param id 作品主键
     * @return 作品
     */
    @Override
    public Works selectWorksById(Long id)
    {
        return worksMapper.selectWorksById(id);
    }

    /**
     * 查询作品列表
     * 
     * @param works 作品
     * @return 作品
     */
    @Override
    public List<Works> selectWorksList(Works works)
    {
        return worksMapper.selectWorksList(works);
    }

    /**
     * 新增作品
     * 
     * @param works 作品
     * @return 结果
     */
    @Transactional
    @Override
    public int insertWorks(Works works)
    {
        int rows = worksMapper.insertWorks(works);
        insertTbGroup(works);
        return rows;
    }

    /**
     * 修改作品
     * 
     * @param works 作品
     * @return 结果
     */
    @Transactional
    @Override
    public int updateWorks(Works works)
    {
        worksMapper.deleteTbGroupById(works.getId());
        insertTbGroup(works);
        return worksMapper.updateWorks(works);
    }

    /**
     * 批量删除作品
     * 
     * @param ids 需要删除的作品主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWorksByIds(Long[] ids)
    {
        worksMapper.deleteTbGroupByIds(ids);
        return worksMapper.deleteWorksByIds(ids);
    }

    /**
     * 删除作品信息
     * 
     * @param id 作品主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWorksById(Long id)
    {
        worksMapper.deleteTbGroupById(id);
        return worksMapper.deleteWorksById(id);
    }

    /**
     * 新增报名组别信息
     * 
     * @param works 作品对象
     */
    public void insertTbGroup(Works works)
    {
        List<TbGroup> tbGroupList = works.getTbGroupList();
        Long id = works.getId();
        if (StringUtils.isNotNull(tbGroupList))
        {
            List<TbGroup> list = new ArrayList<TbGroup>();
            for (TbGroup tbGroup : tbGroupList)
            {
                tbGroup.setId(id);
                list.add(tbGroup);
            }
            if (list.size() > 0)
            {
                worksMapper.batchTbGroup(list);
            }
        }
    }
}
