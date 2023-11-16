package com.example.smartlearning.Service;

import com.example.smartlearning.Contents;
import com.example.smartlearning.ContentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

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
}
