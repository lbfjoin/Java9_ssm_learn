package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lbf
 * @date 2020/9/8 9:27
 */
@Controller
@RequestMapping("/anno02")
public class AnnoController02 {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name",required = false) String name,
                                   @RequestParam(name = "pass") String pass){
        System.out.println("/testRequestParam");
        System.out.println(name);
        System.out.println(pass);
        return "success";

    }
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("testRequestBody");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable("sid") String id){
        System.out.println("testPathVariable");
        System.out.println(id);
        return "success";
    }



}
