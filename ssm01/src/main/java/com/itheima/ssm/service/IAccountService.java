package com.itheima.ssm.service;

import com.itheima.ssm.domain.Account;

import java.util.List;

public interface IAccountService {
    /* 功能：保存账户
     ******/
    void saveAccount(Account account);
    /* 功能：查询所有账户
     ******/
    List<Account> findAll();


}
