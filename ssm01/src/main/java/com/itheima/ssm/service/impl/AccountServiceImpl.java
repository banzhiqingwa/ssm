package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.IAccountDao;
import com.itheima.ssm.domain.Account;
import com.itheima.ssm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    /* 功能：保存账户
     ******/
    @Override
    public void saveAccount(Account account) {
        System.out.println("保存了账户");
    }
    /* 功能：查询所有账户
     ******/
    @Override
    public List<Account> findAll() {
        System.out.println("查询到了账户");
        return null;
    }
}
