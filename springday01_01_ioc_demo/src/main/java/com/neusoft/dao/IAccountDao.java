package com.neusoft.dao;

import com.neusoft.domain.Account;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/5 11:05
 */
public interface IAccountDao {
    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);
}
