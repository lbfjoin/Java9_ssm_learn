package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lbf
 * @date 2020/9/8 8:45
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name",required =false) String username,
                                   @RequestParam("pass") String password){
        //作用，把请求中的指定名称的惨呼传递给控制器中的形参赋值
        System.out.println("testRequestParam");
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        //用于获取请求体的内容（注意：get方法不可以）
        System.out.println("testRequestBody...");
        System.out.println(body);   //username=bigbaby&age=222
        return "success";
    }


    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        //作用：用于绑定url中的占位符的，例如：url中有/delete/{id}.  {id}就是占位符
        //.value：指定url中的占位符名称
        //
        System.out.println("testPathVariable");
        System.out.println(id);

        return "success";
    }
}
