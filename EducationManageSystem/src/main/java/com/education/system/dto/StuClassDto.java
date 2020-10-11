package com.education.system.dto;

import com.education.system.entity.eduStuClass;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StuClassDto extends eduStuClass {
    private int id;
    private String className;
    private int status;
    private int parentId;
}
