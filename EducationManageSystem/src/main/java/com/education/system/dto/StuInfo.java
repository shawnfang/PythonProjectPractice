package com.education.system.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StuInfo {
    private int id;
    private int accountId;
    private String stuSex;
    private String stuTerm;
    private String stuPhone;
    private int status;
    private int schoolId;
    private int classId;
}
