package com.neusoft.test;

import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/5 11:25
 */
public class TestAccountService {
    @Test
    public void testFindAll() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        List<Account> allAccount = as.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountById() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account ids = as.findAccountById(1);
        System.out.println(ids);
    }

    @Test
    public void testSaveAccount() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setId(4);
        account.setName("ddd");
        account.setMoney(1000f);
        as.saveAccount(account);
        List<Account> accounts = as.findAllAccount();
        for (Account a : accounts) {
            System.out.println(a);
        }

    }

    @Test
    public void testupdateAccount() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setId(4);
        account.setName("eee");
        account.setMoney(2000f);
        as.updateAccount(account);
        List<Account> accounts = as.findAllAccount();
        for (Account a : accounts) {
            System.out.println(a);
        }
    }

    @Test
    public void testdeleteAccount() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.deleteAccount(4);
        List<Account> accounts = as.findAllAccount();
        for (Account a : accounts) {
            System.out.println(a);
        }
    }
}