package com.education.system.dto;
import com.education.system.entity.eduAccount;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AccountDto extends eduAccount {
    private String account;
    private String password;
}
