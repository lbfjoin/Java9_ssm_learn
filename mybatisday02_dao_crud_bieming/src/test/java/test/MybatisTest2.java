package test;

import com.neusoft.dao.IEmpDao;
import com.neusoft.domain.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author lbf
 * @date 2020/9/4 15:03
 */
public class MybatisTest2 {
    InputStream in;
    SqlSession sqlSession;
    IEmpDao empDao;
    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        sqlSession = factory.openSession();
        empDao = sqlSession.getMapper(IEmpDao.class);

    }
    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
    @Test
    public void testFindAll(){
        List<Emp> emps = empDao.findAll();
        for (Emp emp:emps){
            System.out.println(emp);
        }
    }
    @Test
    public void testFindByEmp(){
        Emp emp = empDao.findByEmp(7369);
        System.out.println(emp);
    }
    @Test
    public void testSaveEmp(){
        Emp emp = new Emp();
        emp.setEmp_no(1111);
        emp.setE_name("1111");
        emp.setComm(1111);
        emp.setDept_no(10);
        emp.setE_job("1111");
        emp.setHirdate(new Date());
        emp.setMgr(1111);
        emp.setSal(1111);
        int i = empDao.saveEmp(emp);
        System.out.println("受影响的行数" + i);
    }
    @Test
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setEmp_no(1111);
        emp.setDept_no(10);
        emp.setE_name("1111");
        emp.setComm(1111);
        emp.setE_job("1111");
        emp.setHirdate(new Date());
        emp.setMgr(2222);
        emp.setSal(2222);
        int i = empDao.updateEmp(emp);
        System.out.println("受影响的行数" + i);

    }
    @Test
    public void testDeleteEmp(){
        int i = empDao.deleteEmp(1111);
        System.out.println("受影响的行数" + i);
    }
    @Test
    public void testfindByName(){
        List<Emp> byName = empDao.findByName("%S%");
        for (Emp emp:byName){
            System.out.println(emp);
        }
    }

    @Test
    public void testfindTotal(){
        int total = empDao.findTotal();
        System.out.println(total);
    }

}
