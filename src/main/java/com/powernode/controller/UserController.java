package com.powernode.controller;

import com.powernode.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZhangZl
 * @Date 2022/6/28 14:28
 */
@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("getOneUser")
    public User getOne(){
        return new User(1,"gray","德玛西亚");
    }
}
