package com.neusoft.service;

import com.neusoft.domain.Account;
import com.neusoft.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(Integer id);

}
