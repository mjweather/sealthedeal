package com.bechalor.sealthedeal.Controller;

import com.bechalor.sealthedeal.Service.UserService;
import com.bechalor.sealthedeal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;


    @PostMapping("/")
    public User createUser(@RequestBody User user){



        User user1 = userService.createUser(user);


        return user1;
    }



}
