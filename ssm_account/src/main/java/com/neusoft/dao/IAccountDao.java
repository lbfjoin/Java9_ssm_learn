package com.neusoft.dao;

import com.neusoft.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {
    //查询所有账户信息
    @Select("select * from account")
    public List<Account> findAll();

    @Select("insert into account(name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

    @Select("update account set name= #{name},money = #{money} where id=#{id}")
    public void updateAccount(Account account);

    @Select("delete  from account where id = #{id}")
    public void deleteAccount(Integer id);

}
