import com.mybatis.dao.UserDao;
import com.mybatis.dao.UserDaoImpl;
import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 21:30 2018/7/10
 * @Modified By:
 **/
public class UserDaoTest {

    @Test
    public void testGetUserById(){
        UserDao userDao = new UserDaoImpl();
        User user = userDao.getUserById(10);
        System.out.println(user);
    }

    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper =  sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(10);
        System.out.println(user);
    }
}
