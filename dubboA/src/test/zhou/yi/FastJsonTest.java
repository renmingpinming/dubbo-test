package zhou.yi;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import zhou.yi.pojo.User;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/3 18:36
 */
public class FastJsonTest {

    @Test
    public void test(){
        User u = new User();
        u.setUsername("x");
        u.setPassword("123");
        u.setId(1l);
        u.setAge(18);
        String json = JSON.toJSONString(u);
        System.out.println(json);

        User u2 = JSON.parseObject(json,User.class);
        System.out.println(u2);
    }
}
