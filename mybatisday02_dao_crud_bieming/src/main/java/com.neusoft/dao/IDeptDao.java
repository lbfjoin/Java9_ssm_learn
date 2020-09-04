package com.neusoft.dao;

import com.neusoft.domain.Dept;

import java.util.List;

public interface IDeptDao {
    List<Dept> findAll();

    Dept findByDeptno(int deptno);

    int saveDept(Dept dept);

    int updateDept(Dept dept);

    int deleteDept(int deptno);

    List<Dept> findByDname(String dname);

    int totalCount();


}
