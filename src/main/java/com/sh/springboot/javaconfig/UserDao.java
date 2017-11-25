package com.sh.springboot.javaconfig;

import java.util.ArrayList;
import java.util.List;
/**
 * 用于模拟与数据库的交互
 *
 * @author lee leeshuhua@163.com
 * @create 2017-11-24 16:55
 **/

public class UserDao {
    public List<User> queryUserList(){
        List<User> result = new ArrayList<User>();
        // 模拟数据库的查询
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("username_" + i);
            user.setPassword("password_" + i);
            user.setAge(i + 1);
            result.add(user);
        }
        return result;
    }

}
