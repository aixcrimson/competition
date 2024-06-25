package com.competition.education.mapper;

import java.util.List;
import com.competition.education.domain.Users;
import com.competition.education.domain.TbGroup;

/**
 * 用户Mapper接口
 * 
 * @author crimson
 * @date 2024-06-25
 */
public interface UsersMapper 
{
    /**
     * 查询用户
     * 
     * @param id 用户主键
     * @return 用户
     */
    public Users selectUsersById(Long id);

    /**
     * 查询用户列表
     * 
     * @param users 用户
     * @return 用户集合
     */
    public List<Users> selectUsersList(Users users);

    /**
     * 新增用户
     * 
     * @param users 用户
     * @return 结果
     */
    public int insertUsers(Users users);

    /**
     * 修改用户
     * 
     * @param users 用户
     * @return 结果
     */
    public int updateUsers(Users users);

    /**
     * 删除用户
     * 
     * @param id 用户主键
     * @return 结果
     */
    public int deleteUsersById(Long id);

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUsersByIds(Long[] ids);

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
     * 通过用户主键删除报名组别信息
     * 
     * @param id 用户ID
     * @return 结果
     */
    public int deleteTbGroupById(Long id);
}
