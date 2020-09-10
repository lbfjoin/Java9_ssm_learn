package com.neusoft.service.Impl;

import com.neusoft.dao.IAccountDao;
import com.neusoft.domain.Account;
import com.neusoft.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/8 14:43
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层添加账户");
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("业务层修改账户");
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        System.out.println("业务层删除账户");
        accountDao.deleteAccount(id);
    }
}
