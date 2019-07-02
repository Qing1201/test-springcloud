package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Environment env=null;

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") Long id){
        return "userId: "+id;
    }

    @RequestMapping("/getUser")
    public String test(){
        return "userController:" + env.getProperty("server.port")+" : " + env.getProperty("local.server.port");
    }
}

