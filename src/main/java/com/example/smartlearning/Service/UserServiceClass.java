package com.example.smartlearning.Service;

import com.example.smartlearning.SmlRepo;
import com.example.smartlearning.ULMRepo;
import com.example.smartlearning.UserLogin;
import com.example.smartlearning.UserSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    @Override
    public UserSignup getUserByUsernameOrEmail(String username, String password) {
        Optional<UserSignup> user = smlRepo.findByUsername(username);
        Optional<UserSignup> uemail = smlRepo.findByEmail(username);
        String pass= user.get().getPassword();
        if (Objects.equals(pass, password)){
        if (user.isPresent()){
            return  user.get();
        } else if (uemail.isPresent()) {
            return  uemail.get();
        }
        else {
            return user.get();
        }}
        else {
            return null;
        }
    }


}
