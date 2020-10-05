package com.education.system.web;


import com.education.system.dto.TeacherRolePermission;
import com.education.system.serviceimpl.TeacherRolePermissionServiceImpl;
import com.education.system.util.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

public class TeacherRolePermissionController {
    @Autowired
    private TeacherRolePermissionServiceImpl teacherRolePermissionService;
    private final static Logger logger = LoggerFactory.getLogger(TeacherRolePermissionController.class);

    @Autowired
    private HttpServletRequest request;

    @PostMapping("/permisson")
    private ApiResult<?> addPermission(@RequestBody TeacherRolePermission teacherRolePermission) {
        int id = teacherRolePermissionService.addRolePermission(teacherRolePermission);
        if( id > 0){
            return ApiResult.newSuccess(id);
        }else {
            return ApiResult.newError("添加失败");
        }
    }
}