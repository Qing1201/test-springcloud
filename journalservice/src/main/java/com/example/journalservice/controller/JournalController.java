package com.example.journalservice.controller;

import com.example.journalservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalController {
    @Autowired
    private Environment env=null;
    @Autowired
    private UserService userService=null;

    @RequestMapping("/getJournal")
    public String test(){
        String a="journalController:" + env.getProperty("server.port")+" : " + env.getProperty("local.server.port");
        return a+"\n"+userService.getUser(10086L);
    }
}
