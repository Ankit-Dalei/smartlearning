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
    public List<UserSignup> getAll() {
        return smlRepo.findAll();
    }

    @Override
    public UserSignup getUserByUsernameOrEmail(String username, String password) {
        Optional<UserSignup> user = smlRepo.findByUsername(username);
//        Optional<UserSignup> email = smlRepo.findByEmail(username);
        String pass= user.get().getPassword();
//        String passu= email.get().getPassword();
        if ( (Objects.equals(pass, password))){
        if (user.isPresent()){
            System.out.println(user.get());
            return  user.get();
        }
        else {
            return null;
        }}
//        else if ((Objects.equals(passu, password))) {
//            if (email.isPresent()) {
//                System.out.println(email.get());
//                return  email.get();
//            }else {
//                return null;
//            }
//        }
        else {
            return null;
        }
    }

    @Override
    public void DelById(Long uid) {
        Optional<UserSignup> emp= smlRepo.findById(uid);
        if (emp.isPresent()){
            smlRepo.deleteById(uid);
        }
        else {
        }
    }


}
