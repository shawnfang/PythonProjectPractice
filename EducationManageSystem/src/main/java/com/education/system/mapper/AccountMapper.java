package com.education.system.mapper;


import com.education.system.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    /**
     * 添加账号
     * @param account
     * @return
     */
    public int addAccount(Account account);

    /**
     * 登录
     * @param account
     * @return
     */
    public boolean login(Account account);

    /**
     * 查询账号
     * @return
     */
    public List<Account> selectAccount();
}
