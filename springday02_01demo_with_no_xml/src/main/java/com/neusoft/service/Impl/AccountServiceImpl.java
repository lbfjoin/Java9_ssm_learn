package com.neusoft.service.Impl;

import com.neusoft.dao.IAccountDao;
import com.neusoft.dao.Impl.AccountDaoImpl;
import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/5 11:39
 */
//@Component("accountService")
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

//    public void setAccountDao(IAccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);

    }

    @Override
    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
