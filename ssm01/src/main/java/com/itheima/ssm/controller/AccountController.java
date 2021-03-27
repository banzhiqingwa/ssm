package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Account;
import com.itheima.ssm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("accountList",accountList);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(){
        Account account = new Account();
        account.setMoney(3000f);
        account.setName("test3");
        accountService.saveAccount(account);
        return "redirect:findAll";
    }
}
