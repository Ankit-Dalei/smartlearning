package com.example.smartlearning.Controller;

import com.example.smartlearning.Service.UserLoginInterface;
import com.example.smartlearning.UserLogin;
import com.example.smartlearning.UserSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserLoginControllerClass {
    private UserLoginInterface userLoginInterface;
    @Autowired
    public UserLoginControllerClass(UserLoginInterface userLoginInterface){
        this.userLoginInterface=userLoginInterface;
    }

    @PostMapping("/api/login/post")
    public ResponseEntity<UserLogin> adduserlog(@RequestBody UserLogin userLogin){
        return new ResponseEntity<UserLogin>(userLoginInterface.logindetails(userLogin), HttpStatus.CREATED);
    }
}
