import com.neusoft.dao.IUserDao;
import com.neusoft.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author lbf
 * @date 2020/9/3 10:13
 */
public class MybatisTest2 {
    @Test
    public void test() throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建工厂SqlSessionFactoryBuilder工程
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产的SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //6.释放资源
        session.close();

//        //插入数据
//        User user = new User();
//        Date date = new Date();
//        user.setUsername("lll");
//        user.setBirthday(date);
//        user.setSex("女");
//        user.setAddress("北京");
//        userDao.insert(user);
//        //更新数据
//
//        user.setUsername("lll");
//        user.setBirthday(date);
//        user.setSex("女");
//        user.setAddress("北京");
//        user.setId(59);
//        userDao.update(user);


    }
}
