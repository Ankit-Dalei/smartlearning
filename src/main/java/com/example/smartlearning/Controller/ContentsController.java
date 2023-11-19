package com.example.smartlearning.Controller;

import com.example.smartlearning.Contents;
import com.example.smartlearning.Service.ContentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

@RestController
@CrossOrigin
public class ContentsController {
    private ContentServiceInterface contentServiceInterface;

    @Autowired
    public ContentsController(ContentServiceInterface contentServiceInterface){
        this.contentServiceInterface=contentServiceInterface;
    }

    @PostMapping("/api/uplode")
    public ResponseEntity<Contents> addProducts(@RequestParam("file") MultipartFile file,
                                                @RequestParam("contentlink") String contentlink,
                                                @RequestParam("name") String name,
                                                @RequestParam("description") String description,
                                                @RequestParam("likes") Long likes,
                                                @RequestParam("catagory") String catagory){
        Contents contents=new Contents();
        contents.setContentlink(contentlink);
        contents.setName(name);
        contents.setDescription(description);
        contents.setLike(likes);
        contents.setCatagory(catagory);

        try{
            contents.setThumbnail(file.getBytes());
        }catch (IOException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(contentServiceInterface.addContent(contents),HttpStatus.CREATED);
    }

    @GetMapping("/api/Content")
    public List<Contents> getAllContents(){
        return contentServiceInterface.getContent();
    }

    @DeleteMapping("/api/deleteContent/{id}")
    public ResponseEntity<String> delEmployeeById(@PathVariable("id") Long cid){
        contentServiceInterface.DeleteContent(cid);
        return ResponseEntity.ok("delete id:"+cid);
    }

    @GetMapping("/api/content/{catagory}")
    public List<Contents> getSelectContect(@PathVariable("catagory") String catagory){
        return contentServiceInterface.getCatagoricalContent(catagory);
    }
}
