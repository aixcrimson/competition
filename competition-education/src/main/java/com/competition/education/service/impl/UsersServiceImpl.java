package com.competition.education.service.impl;

import java.util.List;
import com.competition.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.competition.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.competition.education.domain.TbGroup;
import com.competition.education.mapper.UsersMapper;
import com.competition.education.domain.Users;
import com.competition.education.service.IUsersService;

/**
 * 用户Service业务层处理
 * 
 * @author crimson
 * @date 2024-06-25
 */
@Service
public class UsersServiceImpl implements IUsersService 
{
    @Autowired
    private UsersMapper usersMapper;

    /**
     * 查询用户
     * 
     * @param id 用户主键
     * @return 用户
     */
    @Override
    public Users selectUsersById(Long id)
    {
        return usersMapper.selectUsersById(id);
    }

    /**
     * 查询用户列表
     * 
     * @param users 用户
     * @return 用户
     */
    @Override
    public List<Users> selectUsersList(Users users)
    {
        return usersMapper.selectUsersList(users);
    }

    /**
     * 新增用户
     * 
     * @param users 用户
     * @return 结果
     */
    @Transactional
    @Override
    public int insertUsers(Users users)
    {
        users.setCreateTime(DateUtils.getNowDate());
        int rows = usersMapper.insertUsers(users);
        insertTbGroup(users);
        return rows;
    }

    /**
     * 修改用户
     * 
     * @param users 用户
     * @return 结果
     */
    @Transactional
    @Override
    public int updateUsers(Users users)
    {
        users.setUpdateTime(DateUtils.getNowDate());
        usersMapper.deleteTbGroupById(users.getId());
        insertTbGroup(users);
        return usersMapper.updateUsers(users);
    }

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的用户主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteUsersByIds(Long[] ids)
    {
        usersMapper.deleteTbGroupByIds(ids);
        return usersMapper.deleteUsersByIds(ids);
    }

    /**
     * 删除用户信息
     * 
     * @param id 用户主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteUsersById(Long id)
    {
        usersMapper.deleteTbGroupById(id);
        return usersMapper.deleteUsersById(id);
    }

    /**
     * 新增报名组别信息
     * 
     * @param users 用户对象
     */
    public void insertTbGroup(Users users)
    {
        List<TbGroup> tbGroupList = users.getTbGroupList();
        Long id = users.getId();
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
                usersMapper.batchTbGroup(list);
            }
        }
    }
}
