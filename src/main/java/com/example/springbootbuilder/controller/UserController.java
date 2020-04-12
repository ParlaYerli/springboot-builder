package com.example.springbootbuilder.controller;

import com.example.springbootbuilder.model.User;
import com.example.springbootbuilder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/getall")
    public List<User> getAll(){
        User user = User.builder()
                .name("parla")
                .build();
        User user1 = User.builder()
                .name("hazal")
                .build();

        userRepository.save(user);
        userRepository.save(user1);

        return userRepository.findAll();
    }
}
