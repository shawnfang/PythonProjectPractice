package com.education.system.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class UserRequest {
    private final static Logger logger = LoggerFactory.getLogger(UserRequest.class);
    public static String getCurrentUser(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        logger.info("token："+token);
        String username = TokenUtil.parseToken(token);
        return username;
    }
}
