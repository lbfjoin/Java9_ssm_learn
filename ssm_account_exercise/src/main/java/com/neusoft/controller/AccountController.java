package com.neusoft.controller;

import com.neusoft.domain.Account;
import com.neusoft.service.AccountService;
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
 * @date 2020/9/8 14:51
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有账户");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }

    @RequestMapping("/update")
    public void update(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.updateAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }

    @RequestMapping("/delete")
    public void delete(Integer id,HttpServletRequest request,HttpServletResponse response) throws IOException {
        accountService.deleteAccount(id);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }
}
