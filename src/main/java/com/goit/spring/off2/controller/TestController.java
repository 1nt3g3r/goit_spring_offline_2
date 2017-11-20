package com.goit.spring.off2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController{
    @RequestMapping("/hello")
    @ResponseBody
    public String printHello() {
        return "I am hello!";
    }
}
