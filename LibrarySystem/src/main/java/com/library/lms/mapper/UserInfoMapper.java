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
    public boolean login(UserInfo userInfo);

    /***
     * 查询用户的信息
     * @param sql
     * @param arr
     * @return
     */
    public List<UserInfo> selectUser();

    /**
     * 根据用户id进行查询操作
     *
     * @param userId
     * @return
     */
    public UserInfo getUserId(int userId);


    public boolean addUser(UserInfo user);

    public boolean deleteUser(int id);

    public boolean updateUser(UserInfo userInfo);
}
