package com.neldo.EcommerceApp.service;

import com.neldo.EcommerceApp.model.Users;
import com.neldo.EcommerceApp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public Users register(Users user){

        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return user;
    }

    public List<Users> getAllUsers() {
        return repo.findAll();
    }

}
