package com.jerry.springboot_jsp_thymeleaf.web;

import com.jerry.springboot_jsp_thymeleaf.pojo.User;
import com.jerry.springboot_jsp_thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserRestController2 {
    @Autowired
    private UserService userService;


    @RequestMapping("/index")
    public String index() {
        return "redirect:/list2";
    }


    @RequestMapping("/list2")
    public String list(Model model) {
        System.out.println("JSP查询所有");
        List<User> users=userService.findAll();
        model.addAttribute("users", users);
        return "jsp/user/list2";
    }

    @RequestMapping("/toAdd2")
    public String toAdd() {
        return "jsp/user/userAdd2";
    }

    @RequestMapping("/add2")
    public String add(User user) {
        userService.addUser(user);
        return "redirect:/list2";
    }

    @RequestMapping("/toEdit2")
    public String toEdit(Model model,Long id) {
        User user=userService.findUserById(id);
        model.addAttribute("user", user);
        return "jsp/user/userEdit2";
    }

    @RequestMapping("/edit2")
    public String edit(User user) {
        userService.updateUser(user);
        return "redirect:/list2";
    }


    @RequestMapping("/toDelete2")
    public String delete(Long id) {
        userService.deleteUser(id);
        return "redirect:/list2";
    }
}
