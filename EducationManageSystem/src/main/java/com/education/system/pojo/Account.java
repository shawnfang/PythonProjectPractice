package com.education.system.pojo;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Account {
    private int id;
    private String account;
    private String password;
    private int identities;
    private int status;
}
