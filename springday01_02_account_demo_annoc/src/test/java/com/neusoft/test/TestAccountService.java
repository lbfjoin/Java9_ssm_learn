package com.neusoft.test;

import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/5 11:25
 */
public class TestAccountService {
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    IAccountService as = ac.getBean("accountService", IAccountService.class);
    @Test
    public void testFindAll() {

        List<Account> allAccount = as.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountById() {
        Account ids = as.findAccountById(1);
        System.out.println(ids);
    }

    @Test
    public void testSaveAccount() {
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
        as.deleteAccount(4);
        List<Account> accounts = as.findAllAccount();
        for (Account a : accounts) {
            System.out.println(a);
        }
    }
}