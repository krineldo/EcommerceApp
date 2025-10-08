package com.neldo.EcommerceApp.controller;

import com.neldo.EcommerceApp.model.Users;
import com.neldo.EcommerceApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return service.register(user);
    }

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getAllUsers(){
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }
//@PostMapping("/register")
//    public String register(@RequestBody Users user) {
//        System.out.println("Received user: " + user.getUsername());
//        return "OK";
//    }



}
