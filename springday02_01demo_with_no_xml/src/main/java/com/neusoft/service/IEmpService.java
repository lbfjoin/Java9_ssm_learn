package com.neusoft.service;

import com.neusoft.domain.Account;
import com.neusoft.domain.Emp;

import java.util.List;

public interface IEmpService {
    List<Emp> findAllEmp();

    Account findEmpById(Integer empno);

    void saveEmp(Emp emp);

    void updateEmp(Emp emp);

    void deleteEmp(Integer empno);
}
