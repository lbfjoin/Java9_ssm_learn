package com.neusoft.dao;

import com.neusoft.domain.Emp;


import java.util.List;

/**
 * @author lbf
 * @date 2020/9/4 14:53
 */
public interface IEmpDao {
    // 查询所有
    List<Emp> findAll();
    /**
     * 根据id查询
     */
    Emp findByEmp(Integer empno);

    /*
     * 保存用户  返回插入后自增长的id值 在user里面 不是这个返回值
     * */
    int saveEmp(Emp emp);

    /*
     * 更新用户
     * */
    int updateEmp(Emp emp);

    /*
     * 删除用户
     * */
    int deleteEmp(Integer empno);

    /**
     * 根据姓名进行模糊查询
     */
    List<Emp> findByName(String ename);

    /**
     * 查询总记录数
     */
    int findTotal();



}
