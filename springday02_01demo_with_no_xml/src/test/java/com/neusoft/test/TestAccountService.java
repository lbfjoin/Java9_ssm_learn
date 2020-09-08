package com.neusoft.test;

import com.neusoft.config.SpringConfiguration;
import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/5 11:25
 */
//使用注解的方式加载junit单元测试
//spring整理junit配置

@RunWith(SpringJUnit4ClassRunner.class)  //接收字节码文件
//    @ContextConfiguration(locations = "bean.xml")
@ContextConfiguration(classes = SpringConfiguration.class)

public class TestAccountService {
    @Autowired
    private IAccountService as = null;

    @Test
    public void testFindAll() {

        List<Account> allAccount = as.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }
    }

//    @Test
//    public void testFindAccountById() {
//        Account ids = as.findAccountById(1);
//        System.out.println(ids);
//    }
//
//    @Test
//    public void testSaveAccount() {
//        Account account = new Account();
//        account.setId(4);
//        account.setName("ddd");
//        account.setMoney(1000f);
//        as.saveAccount(account);
//        List<Account> accounts = as.findAllAccount();
//        for (Account a : accounts) {
//            System.out.println(a);
//        }
//
//    }
//
//    @Test
//    public void testupdateAccount() {
//        Account account = new Account();
//        account.setId(4);
//        account.setName("eee");
//        account.setMoney(2000f);
//        as.updateAccount(account);
//        List<Account> accounts = as.findAllAccount();
//        for (Account a : accounts) {
//            System.out.println(a);
//        }
//    }
//
//    @Test
//    public void testdeleteAccount() {
//        as.deleteAccount(4);
//        List<Account> accounts = as.findAllAccount();
//        for (Account a : accounts) {
//            System.out.println(a);
//        }
//    }
}