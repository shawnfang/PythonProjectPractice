package com.education.system.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SchoolInfo {
    private int id;
    private String schoolName;
    private String schoolContactor;
    private String schoolPhone;
    private boolean status;

}
