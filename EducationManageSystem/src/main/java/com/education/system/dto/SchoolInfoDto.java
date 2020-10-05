package com.education.system.dto;

import com.education.system.entity.eduAccount;
import com.education.system.entity.eduSchool;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SchoolInfoDto extends eduSchool {
    private String schoolName;
    private String schoolContactor;
    private String schoolPhone;
    private AccountDto accounts;

}
