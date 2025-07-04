package com.IndianBazar.controller;
import com.IndianBazar.model.User;
import com.IndianBazar.service.UserService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) 
    {
        this.userService = userService;
    }

    
    // service for signup
    @PostMapping("/signup")
    public ResponseEntity<?> register(@Valid @RequestBody User user) 
		    {
		        userService.register(user);
		        return ResponseEntity.ok("User registered successfully");
		    }


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginReq) 
    {
        try 
        {
            User user = userService.login(loginReq.getEmail(), loginReq.getPassword());
            return ResponseEntity.ok(user); // In real apps, return a JWT token
        } 
        catch (Exception e)
        {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
