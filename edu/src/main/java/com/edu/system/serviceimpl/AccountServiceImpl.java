package com.edu.system.serviceimpl;

import com.education.system.mapper.AccountMapper;
import com.education.system.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl {
    @Autowired
    private AccountMapper accountMapper;

    public boolean addAccount(Account account){
        return false;
    }

    public boolean login(Account account){
        return false;
    }
}
