package com.developerSam.Product.Controller;

import com.developerSam.Product.Entity.AirlineCustomer;
import com.developerSam.Product.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("register")
    public void saveUser(@RequestBody AirlineCustomer user){
        userRepository.save(user);
    }
}
