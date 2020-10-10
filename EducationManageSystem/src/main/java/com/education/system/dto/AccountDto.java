package com.education.system.dto;
import com.education.system.entity.eduAccount;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Data
public class AccountDto extends eduAccount {
    @NotNull
    private String account;
    @NotNull
    private String password;
}
