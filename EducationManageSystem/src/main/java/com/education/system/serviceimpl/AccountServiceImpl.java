package com.education.system.serviceimpl;

import com.education.system.dto.AccountDto;
import com.education.system.entity.eduAccount;
import com.education.system.mapper.eduAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl {
    @Autowired
    private eduAccountMapper accountMapper;

    public boolean addAccount(eduAccount account){
        return false;
    }

    public boolean login(eduAccount account){
        return false;
    }
}
