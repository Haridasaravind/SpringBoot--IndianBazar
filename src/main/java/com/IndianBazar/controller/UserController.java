package com.IndianBazar.controller;

import com.IndianBazar.model.User;
import com.IndianBazar.service.UserService;
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

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody User user) 
    {
        User saved = userService.register(user);
        return ResponseEntity.ok(saved);
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
