package test;

import com.neusoft.dao.IDeptDao;
import com.neusoft.domain.Dept;
import com.neusoft.domain.QueryVo;
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
 * @date 2020/9/4 22:56
 */
public class MybatisTest3 {
    InputStream in;
    SqlSession sqlSession;
    IDeptDao deptDao;

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        sqlSession = factory.openSession();
        deptDao = sqlSession.getMapper(IDeptDao.class);
    }

    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void testFindByConditon() {
        Dept dept = new Dept();
        dept.setD_deptno(10);
        List<Dept> depts = deptDao.findByCondition(dept);
        for (Dept d:depts){
            System.out.println(d);
        }
    }

    @Test
    public void testFindDeptByQueryVo() {
        Dept dept = new Dept();
        dept.setD_dname("%S%");
        QueryVo queryVo = new QueryVo();
        queryVo.setDept(dept);
        List<Dept> depts = deptDao.findDeptByQueryVo(queryVo);
        for (Dept d:depts){
            System.out.println(d);
        }
    }

    @Test
    public void testFindByDeptnos() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        QueryVo queryVo = new QueryVo();
        queryVo.setDeptnos(list);
        List<Dept> depts = deptDao.findDeptByDeptnos(queryVo);
        for (Dept dept : depts){
            System.out.println(dept);
        }
    }
}
