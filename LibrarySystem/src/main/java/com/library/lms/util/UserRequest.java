package com.library.lms.util;

import com.library.lms.web.BookInfoController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
