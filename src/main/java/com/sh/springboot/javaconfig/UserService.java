package com.sh.springboot.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired // 注入Spring容器中的bean对象
    private UserDao userDao;

    public List<User> queryUserList() {
        // 调用userDAO中的方法进行查询
        return this.userDao.queryUserList();
    }

}