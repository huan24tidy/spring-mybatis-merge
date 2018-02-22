import com.github.pagehelper.PageInfo;
import com.taidi.dao.UserDao;
import com.taidi.service.UserService;
import com.taidi.service.UserServiceImpl;
import com.taidi.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tidy on 2017/11/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TestSpringMybatis {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;
    @Test
    public void testQueryUserById() {
        System.out.println(userDao.queryUserById(1));
    }


    @Test
    public void testQueryUsers() {
        PageInfo<User> pageInfo= userService.queryUsers(1, 2);
        for(User user:pageInfo.getList()){
            System.out.println("user:"+user);
        }
    }
}
