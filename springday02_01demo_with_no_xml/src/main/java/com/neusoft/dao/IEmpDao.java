package com.neusoft.dao;

import com.neusoft.domain.Account;
import com.neusoft.domain.Emp;

import java.util.List;

public interface IEmpDao {
    List<Emp> findAllCount();

    Emp findEmpById(Integer enpno);

    void saveEmp(Emp emp);

    void updateEmp(Emp emp);

    void deleteEmp(Integer empno);
}
