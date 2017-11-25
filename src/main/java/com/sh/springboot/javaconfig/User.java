package com.sh.springboot.javaconfig;

/**
 * 用户实体类
 *
 * @author lee leeshuhua@163.com
 * @create 2017-11-24 16:54
 **/

public class User {

    private String username;

    private String password;

    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
