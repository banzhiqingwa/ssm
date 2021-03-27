package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public interface IAccountDao {
    /* 功能：保存账户
   ******/
    void saveAccount(Account account);
    /* 功能：查询所有账户
     ******/
    List<Account> findAll();
}
