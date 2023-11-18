package com.example.smartlearning.Service;

import com.example.smartlearning.UserLogin;
import com.example.smartlearning.UserSignup;

import java.util.List;

public interface UserServiceInterface {
    UserSignup addUser(UserSignup userSignup);

    List<UserSignup> getAll();

    UserSignup getUserByUsernameOrEmail(String username,String password);

    void DelById(Long uid);
}
