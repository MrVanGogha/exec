package com.xmu.controller;

import com.xmu.entity.User;
import com.xmu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * 用户Controller
 *
 * @author Ove
 * @date 2023-11-28 16:52
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("save")
    public String save(@RequestBody User user){
        user.setCreateTime(LocalDateTime.now());
        user.setModifyTime(LocalDateTime.now());
        boolean save = userService.save(user);
        return  save ? "suc" : "fail";
    }

    @GetMapping("getById")
    public User getById(@RequestParam("id")Long id){
        User user = userService.getById(id);
        return user;
    }

    @PostMapping("update")
    public String update(@RequestBody User user){
        boolean b = userService.updateById(user);
        return b ? "suc" : "fail";
    }

}
