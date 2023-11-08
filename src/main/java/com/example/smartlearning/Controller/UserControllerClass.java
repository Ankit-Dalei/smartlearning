package com.example.smartlearning.Controller;

import com.example.smartlearning.Service.UserServiceInterface;
import com.example.smartlearning.UserSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RequestMapping("/api")
@RestController
@CrossOrigin
public class UserControllerClass {
    private UserServiceInterface userServiceInterface;

    @Autowired
    public UserControllerClass(UserServiceInterface userServiceInterface){
        this.userServiceInterface=userServiceInterface;
    }

    @PostMapping("/api/post")
    public ResponseEntity<UserSignup> addUserData(@RequestBody UserSignup userSignup){
        return new ResponseEntity<UserSignup>(userServiceInterface.addUser(userSignup), HttpStatus.CREATED);
    }
}