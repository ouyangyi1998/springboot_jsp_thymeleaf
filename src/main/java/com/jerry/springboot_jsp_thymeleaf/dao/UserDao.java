package com.jerry.springboot_jsp_thymeleaf.dao;

import com.jerry.springboot_jsp_thymeleaf.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface UserDao extends JpaRepository<User,Long> {
}
