package com.library.lms.web;


import com.alibaba.fastjson.JSON;
import com.library.lms.pojo.BookSort;
import com.library.lms.pojo.UserInfo;
import com.library.lms.service.BookSortService;
import com.library.lms.service.UserInfoService;
import com.library.lms.util.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    private final static Logger logger = LoggerFactory.getLogger(BookSortController.class);
    @PostMapping("/login")
    private String login(@RequestBody Map params){
        Map<String,Object> map = new HashMap<>();
        UserInfo userInfo = new UserInfo();
        userInfo.setUser_account((String) params.get("account"));
        userInfo.setUser_pw((String)params.get("password"));
        if(userInfoService.login(userInfo)){
            String token = TokenUtil.sign(userInfo);
            if(token != null){
                map.put("code", "10000");
                map.put("message", "认证成功");
                map.put("token", token);
                String jsonObj = JSON.toJSONString(map);
                return jsonObj;
            }
        }
        return null;
    }
}
