package com.education.system.dto;

import com.education.system.entity.eduAccount;
import com.education.system.entity.eduSchool;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Data
public class SchoolInfoDto extends eduSchool {
    private int id;
    @NotNull
    private String schoolName;
    @NotNull
    private String schoolContactor;
    @NotNull
    private String schoolPhone;
    @NotNull
    private AccountDto accounts;

}
