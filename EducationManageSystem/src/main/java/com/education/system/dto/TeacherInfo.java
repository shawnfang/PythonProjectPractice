package com.education.system.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TeacherInfo {
    private int id;
    private String teacherName;
    private int teacherSex;
    private int teacherLevel;
    private String teacherCourse;
    private String teacherDevCourse;
    private String teacherPhone;
    private String teacherRole;
    private int accountId;
    private int status;
    private int schoolId;
    private int roleId;
}
