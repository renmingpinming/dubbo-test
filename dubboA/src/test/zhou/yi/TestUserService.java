package zhou.yi;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhou.yi.pojo.User;
import zhou.yi.service.UserService;

import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/3/19 18:34
 */
public class TestUserService {
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:dubbo/dubbo-*.xml");
        userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll() {
        List<User> userList = userService.queryAll();
        for(User user : userList){
            System.out.println(user.toString());
        }
    }
}
