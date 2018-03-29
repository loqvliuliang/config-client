package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 刘亮 on 2018/3/29.
 */
@RestController
@RequestMapping("/api/test")
public class MyTestController {

    @Value("${crawler}")
    public String crawler;

    @RequestMapping(value = "/crawler",method = RequestMethod.GET)
    public String toConfigServer(){
        return this.crawler;
    }


    @GetMapping("/aaa")
    public String aaa(){
        return "aaa";
    }


}
