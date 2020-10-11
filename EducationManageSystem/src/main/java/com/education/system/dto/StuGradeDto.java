package com.education.system.dto;

import com.education.system.entity.eduStuClass;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StuGradeDto extends eduStuClass {
    private int id;
    private String gradeName;
}
