package com.example.smartlearning.Service;

import com.example.smartlearning.UserLogin;
import com.example.smartlearning.UserSignup;

import java.util.List;

public interface UserLoginInterface {
    UserLogin logindetails(UserLogin userLogin);

    List<UserLogin> getAll();
}
