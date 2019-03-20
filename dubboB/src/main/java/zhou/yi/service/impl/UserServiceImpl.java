package zhou.yi.service.impl;

import zhou.yi.pojo.User;
import zhou.yi.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/3/20 10:10
 */
public class UserServiceImpl implements UserService {

    public List<User> queryAll() {
        List<User> list =new ArrayList<User>();
        for(int i = 0;i < 10;i++){
            User user = new User();
            user.setAge(20+i);
            user.setId(Long.valueOf(i + 1));
            user.setPassword("123456");
            user.setUsername("username_"+i);
            list.add(user);
        }
        return list;
    }
}
