package com.library.lms.mapper;

import com.library.lms.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserInfoMapper {
    /***
     * 用户登录的方法
     * @param user
     * @return
     */
    public UserInfo login(UserInfo user);

    /***
     * 查询用户的信息
     * @param sql
     * @param arr
     * @return
     */
    public List<UserInfo> selectUser(UserInfo user);

    /**
     * 根据用户id进行查询操作
     *
     * @param userId
     * @return
     */
    public UserInfo getUserId(Integer userId);


    public boolean addUser(UserInfo user);

    public boolean deleteUser(UserInfo userInfo);

    public boolean updateUser(UserInfo userInfo);
}
