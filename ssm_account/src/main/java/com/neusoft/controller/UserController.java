package com.neusoft.controller;

import com.neusoft.domain.User;
import com.neusoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author lbf
 * @date 2020/9/8 19:38
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层查询所有用户");
        List<User> list = userService.findAll();
        model.addAttribute("list02", list);
        return "list02";
    }

    @RequestMapping("/saveUser")
    public void saveUser(User user, HttpServletRequest request,HttpServletResponse response) throws IOException {
        userService.saveUser(user);
        response.sendRedirect(request.getContextPath()+ "/user/findAll");
    }

    @RequestMapping("/updateUser")
    public void updateUser(User user, HttpServletRequest request,HttpServletResponse response) throws IOException {
        userService.updateUser(user);
        response.sendRedirect(request.getContextPath()+ "/user/findAll");
    }

    @RequestMapping("/deleteUser")
    public void updateUser(Integer id, HttpServletRequest request,HttpServletResponse response) throws IOException {
        userService.deleteUser(id);
        response.sendRedirect(request.getContextPath()+ "/user/findAll");
    }
}
