package test;

import com.neusoft.dao.IEmpDao;
import com.neusoft.domain.Emp;
import com.neusoft.domain.User;
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
 * @date 2020/9/4 10:06
 */
public class MybatisTest2 {
    private InputStream in;
    private SqlSession sqlSession ;
    private IEmpDao empDao;
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
    public void testfindAll(){
        List<Emp> emps = empDao.findAll();
        for (Emp emp : emps){
            System.out.println(emp);
        }

    }
    @Test
    public void testfindById(){
        Emp byId = empDao.findById(7369);
        System.out.println(byId);

    }
    @Test
    public void testSave(){
        Emp emp = new Emp();
        emp.setEMPNO(1111);
        emp.setENAME("1111");
        emp.setJOB("111");
        emp.setCOMM(111);
        emp.setDEPTNO(10);
        emp.setHIREDATE(new Date());
        emp.setMGR(2222);
        emp.setSAL(1111);
        int i = empDao.saveEmpno(emp);
        System.out.println(emp);
    }
    @Test
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setEMPNO(1111);
        emp.setENAME("1111");
        emp.setJOB("222");
        emp.setCOMM(111);
        emp.setDEPTNO(10);
        emp.setHIREDATE(new Date());
        emp.setMGR(2222);
        emp.setSAL(1111);
        int i = empDao.updateEmpno(emp);
        System.out.println(emp);
    }
    @Test
    public void testDelete(){
        int i = empDao.deleteEmpno(1111);
        System.out.println("受影响的行数" + i);

    }
    @Test
    public void testfindByName(){
        List<Emp> byName = empDao.findByName("%S%");
        System.out.println(byName);

    }
    @Test
    public void testTotalCount(){
        int count = empDao.totalCount();
        System.out.println(count);

    }




}
