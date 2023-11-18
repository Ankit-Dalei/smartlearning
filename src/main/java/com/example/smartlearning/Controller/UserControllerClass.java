package com.example.smartlearning.Controller;

import com.example.smartlearning.Service.UserServiceInterface;
import com.example.smartlearning.UserSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/api/getSignInUser")
    public List<UserSignup> getAll(){
        return userServiceInterface.getAll();
    }

    @GetMapping("/login/{usernameOrEmail}/{password}")
    public UserSignup getUserByUsernameOrEmail(@PathVariable String usernameOrEmail,@PathVariable String password) {
        return userServiceInterface.getUserByUsernameOrEmail(usernameOrEmail,password);
    }

    @DeleteMapping("/api/del/{id}")
    public ResponseEntity<String> delEmployeeById(@PathVariable("id") Long empid){
        userServiceInterface.DelById(empid);
        return ResponseEntity.ok("delete id:"+empid);
    }
}
