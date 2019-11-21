package com.jerry.springboot_jsp_thymeleaf.service;

import com.jerry.springboot_jsp_thymeleaf.pojo.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(Long id);
    User findUserById(Long id);
    List<User> findAll();
}
