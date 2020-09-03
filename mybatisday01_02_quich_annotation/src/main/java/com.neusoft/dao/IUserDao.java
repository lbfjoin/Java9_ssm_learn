package com.neusoft.dao;

import com.neusoft.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface IUserDao {
    //查询全部
    @Select("select * from user")
    List<User> findAll();

    //插入查询
    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    void insert(User user);

    //更新数据
    @Update("update user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
    void update(User user);

    //删除数据
    @Delete("delete from user where id = #{id}")
    void delete(int id);
}
