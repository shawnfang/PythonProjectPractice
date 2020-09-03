package com.education.system.mapper;


import com.education.system.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    public boolean addAccount(Account account);
    public boolean login(Account account);
}
