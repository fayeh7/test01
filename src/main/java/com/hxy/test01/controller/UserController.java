package com.hxy.test01.controller;

import com.hxy.test01.domain.User;
import com.hxy.test01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin//解决跨域问题
public class UserController {
    @Autowired
    private UserService userService;

    /*@GetMapping
    public String test(){
        System.out.println("test...");
        return "hello";
    }*/

    @GetMapping
    public List<User> getAll(){

        return userService.list();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id){

        return userService.getById(id);
    }







}
