package com.example.smartlearning.Service;

import com.example.smartlearning.ULMRepo;
import com.example.smartlearning.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginClass implements UserLoginInterface {
    private ULMRepo ulmRepo;

    @Autowired
    public UserLoginClass(ULMRepo ulmRepo){
        this.ulmRepo=ulmRepo;
    }
    @Override
    public UserLogin logindetails(UserLogin userLogin) {
        return ulmRepo.save(userLogin);
    }
}
