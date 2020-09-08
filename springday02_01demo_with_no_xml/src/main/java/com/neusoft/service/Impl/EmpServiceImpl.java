package com.neusoft.service.Impl;

import com.neusoft.dao.IEmpDao;
import com.neusoft.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/5 16:26
 */
@Service
//@Component
public class EmpServiceImpl implements IEmpDao {
    @Autowired
    private IEmpDao empDao;

    @Override
    public List<Emp> findAllCount() {
        return empDao.findAllCount();
    }

    @Override
    public Emp findEmpById(Integer enpno) {
        return empDao.findEmpById(enpno);
    }

    @Override
    public void saveEmp(Emp emp) {
        empDao.saveEmp(emp);
    }

    @Override
    public void updateEmp(Emp emp) {
        empDao.updateEmp(emp);
    }

    @Override
    public void deleteEmp(Integer empno) {
        empDao.deleteEmp(empno);
    }
}
