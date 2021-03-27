package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public interface IAccountDao {
    /* 功能：保存账户
   ******/
    @Insert("insert into account (name ,money) values (#{name} , #{money})")
    void saveAccount(Account account);
    /* 功能：查询所有账户
     ******/
    @Select("select * from account")
    List<Account> findAll();
}
