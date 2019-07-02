package com.example.journalservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//service id
@FeignClient("userService")
public interface UserService {

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable("id") Long id);
}
