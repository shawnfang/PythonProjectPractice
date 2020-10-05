package com.education.system.dto;

import com.education.system.entity.eduSchool;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SchoolSearchDto extends eduSchool {
    private String schoolName;
    private String schoolContactor;
}
