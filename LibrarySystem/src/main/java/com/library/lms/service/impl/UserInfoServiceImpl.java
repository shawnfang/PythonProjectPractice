package com.library.lms.service.impl;

import com.library.lms.mapper.UserInfoMapper;
import com.library.lms.pojo.UserInfo;
import com.library.lms.service.UserInfoService;
import com.library.lms.web.BookSortController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    private final static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    public boolean insertUser(UserInfo user) {
        return userInfoMapper.addUser(user);
    }

    public boolean login(UserInfo user) {
        logger.info("用户："+ user.getUser_account()+" "+"密码："+user.getUser_pw());
        return userInfoMapper.login(user);
    }

    public List<UserInfo> selectUser() {
        return userInfoMapper.selectUser();
    }

    public boolean deleteUser(int user_id) {
        return userInfoMapper.deleteUser(user_id);
    }

    public boolean updateUser(UserInfo user) {
        return userInfoMapper.updateUser(user);
    }

    public UserInfo getUserId(int user_id) {
        return userInfoMapper.getUserId(user_id);
    }

    public boolean registerUser(UserInfo user) {
        return userInfoMapper.addUser(user);
    }
}
