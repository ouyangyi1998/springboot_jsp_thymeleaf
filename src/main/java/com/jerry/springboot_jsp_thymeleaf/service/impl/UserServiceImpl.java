package com.jerry.springboot_jsp_thymeleaf.service.impl;

import com.jerry.springboot_jsp_thymeleaf.dao.UserDao;
import com.jerry.springboot_jsp_thymeleaf.pojo.User;
import com.jerry.springboot_jsp_thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        try{
            userDao.save(user);
            flag=true;
        }catch(Exception e){
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try{
            userDao.save(user);
            flag=true;
        }catch(Exception e){
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(Long id) {
        boolean flag=false;
        try{
            userDao.delete(id);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findUserById(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
