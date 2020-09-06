package com.neusoft.dao.Impl;

import com.neusoft.dao.IEmpDao;
import com.neusoft.domain.Emp;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @author lbf
 * @date 2020/9/5 16:05
 */
@Repository
public class EmpDaoImpl implements IEmpDao {
    @Autowired
    private QueryRunner runner;
    @Override
    public List<Emp> findAllCount() {
        try {
            return runner.query("select * from emp ",new BeanListHandler<>(Emp.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Emp findEmpById(Integer enpno) {
        try {
            return runner.query("select * from emp where empno = ? ",new BeanHandler<>(Emp.class),enpno);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveEmp(Emp emp) {
        try {
            runner.update("insert into emp values(?,?,?,?,?,?,?,?)",emp.getEmpno(),
                    emp.getEname(),emp.getJob(),emp.getMgr(),emp.getHiredate(),emp.getSal()
            ,emp.getComm(),emp.getDeptno());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateEmp(Emp emp) {
        try {
            runner.update("update emp set  ename =?,job = ?,mgr =? , hiredate=?, sal =?,comm=?,deptno =? where empno =?", emp.getEname(),emp.getJob(),emp.getMgr(),emp.getHiredate(),emp.getSal()
                    ,emp.getComm(),emp.getDeptno(),emp.getEmpno());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteEmp(Integer empno) {
        try {
            runner.update("delete from emp where empno = ?",empno);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
