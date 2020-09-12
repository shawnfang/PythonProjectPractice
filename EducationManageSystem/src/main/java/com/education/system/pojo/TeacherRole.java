package com.education.system.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class TeacherRole {
    private int id;
    private String roleName;
    private String roleDesc;
    private String rolePermission;
    private Date createtime;
    private int status;
    private int rolePermissionId;
}
