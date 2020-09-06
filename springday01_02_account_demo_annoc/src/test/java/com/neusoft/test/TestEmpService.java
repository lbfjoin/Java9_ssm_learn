package com.neusoft.test;

import com.neusoft.dao.IAccountDao;
import com.neusoft.dao.IEmpDao;
import com.neusoft.domain.Emp;
import com.neusoft.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author lbf
 * @date 2020/9/5 16:31
 */
public class TestEmpService  {
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    IEmpDao as = ac.getBean("empServiceImpl", IEmpDao.class);

    @Test
    public void testFindAll(){
        List<Emp> emps = as.findAllCount();
        for (Emp emp :emps){
            System.out.println(emp);
        }
    }
    @Test
    public void testfindEmpById(){
        Emp emp = as.findEmpById(7369);
        System.out.println(emp);
    }
    @Test
    public void testsaveEmp(){
        Emp emp = new Emp();
        emp.setEmpno(1111);
        emp.setEname("1111");
        emp.setJob("1111");
        emp.setMgr(1111);
        emp.setHiredate(new Date());
        emp.setComm(11111);
        emp.setSal(1111);
        emp.setDeptno(1111);
        as.saveEmp(emp);
    }
    @Test
    public void testupdateEmp(){
        Emp emp = new Emp();
        emp.setEmpno(1111);
        emp.setEname("1111");
        emp.setJob("1111");
        emp.setMgr(1111);
        emp.setHiredate(new Date());
        emp.setComm(11111);
        emp.setSal(1111);
        emp.setDeptno(1222);
        as.updateEmp(emp);
    }
    @Test
    public void testDeleteEmp(){
       as.deleteEmp(1111);

    }

}
