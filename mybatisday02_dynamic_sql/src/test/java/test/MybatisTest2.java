package test;

import com.neusoft.dao.IEmpDao;
import com.neusoft.domain.Emp;
import com.neusoft.domain.QueryVo;
import javafx.util.BuilderFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lbf
 * @date 2020/9/4 19:35
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
    public void testFindByCondition(){
        Emp emp = new Emp();
        emp.setEmp_no(1111);
//        emp.setE_name("1111");
        List<Emp> emps = empDao.findByCondition(emp);
        for (Emp e: emps){
            System.out.println(e);
        }
    }
    @Test
    public void testFindEmpByQueryVo(){
        Emp emp = new Emp();
        emp.setE_name("%S%");
        QueryVo queryVo = new QueryVo();
        queryVo.setEmp(emp);
        List<Emp> emps = empDao.findEmpByQueryVo(queryVo);
        for (Emp e: emps){
            System.out.println(e);
        }
    }
    @Test
    public void testfindEmpByEmpnos(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(7499);
        list.add(7521);
        list.add(7839);
        QueryVo queryVo = new QueryVo();
        queryVo.setEmpnos(list);
        List<Emp> empnos = empDao.findEmpByEmpnos(queryVo);
        for (Emp e:empnos){
            System.out.println(e);
        }
    }

}
