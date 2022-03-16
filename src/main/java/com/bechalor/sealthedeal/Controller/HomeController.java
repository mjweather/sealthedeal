package com.bechalor.sealthedeal.Controller;

import com.bechalor.sealthedeal.Reprository.UserReprositor;
import com.bechalor.sealthedeal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private UserReprositor userReprositor;

    @PostMapping("/")
    public User createuser(@RequestBody User user) {
        System.out.println(user.getEmail());
        User user1 = this.userReprositor.findByEmail(user.getEmail());
        if (user1 == null) {
            this.userReprositor.save(user);
            System.out.println("User registered");

        } else {
            System.out.println("User Already exists");

        }
        return user;
    }

}
