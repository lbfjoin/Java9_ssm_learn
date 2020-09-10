package com.neusoft.dao;

import com.neusoft.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    @Select("select * from user")
    public List<User> findAll();

    @Select("insert into user values(null,#{username},#{birthday},#{sex},#{address})")
    public void saveUser(User user);

    @Select("update user set username=#{username},birthday =#{birthday},sex=#{sex},address= #{address} where id=#{id}")
    public void update(User user);

    @Select("delete from user where id=#{id}")
    public void delete(Integer id);
}
