package com.example.smartlearning.Service;

import com.example.smartlearning.Contents;
import com.example.smartlearning.ContentsRepo;
import com.example.smartlearning.UserSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class ContentServiceClass implements ContentServiceInterface{
    private ContentsRepo contentsRepo;

    @Autowired
    public ContentServiceClass(ContentsRepo contentsRepo){
        this.contentsRepo=contentsRepo;
    }

    @Override
    public Contents addContent(Contents contents) {
           return contentsRepo.save(contents);
    }

    @Override
    public List<Contents> getContent() {
        return contentsRepo.findAll();
    }

    @Override
    public void DeleteContent(Long cid) {
        Optional<Contents> emp= contentsRepo.findById(cid);
        if (emp.isPresent()){
            contentsRepo.deleteById(cid);
        }
        else {
        }
    }
}
