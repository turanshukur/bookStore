package com.turanshukur.bookstore.controller;

import com.turanshukur.bookstore.model.User;
import com.turanshukur.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userService.createUser(user);
    }

    @GetMapping("/get")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
