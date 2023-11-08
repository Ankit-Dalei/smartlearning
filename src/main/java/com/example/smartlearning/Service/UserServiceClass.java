package com.example.smartlearning.Service;

import com.example.smartlearning.SmlRepo;
import com.example.smartlearning.UserSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceClass implements UserServiceInterface {
    private SmlRepo smlRepo;

    @Autowired
    public UserServiceClass(SmlRepo smlRepo){
        this.smlRepo=smlRepo;
    }

    @Override
    public UserSignup addUser(UserSignup userSignup){
        return smlRepo.save(userSignup);
    }
}
