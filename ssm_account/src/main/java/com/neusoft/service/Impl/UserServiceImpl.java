package com.neusoft.service.Impl;

import com.neusoft.dao.IUserDao;
import com.neusoft.domain.Account;
import com.neusoft.domain.User;
import com.neusoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/8 19:28
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("findAll。。。。");
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user) {
        System.out.println("saveUser.....");
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("updateUser....");
        userDao.update(user);
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("deleteUser....");
        userDao.delete(id);
    }


}
