package com.example.smartlearning.Controller;

import com.example.smartlearning.History;
import com.example.smartlearning.Likes;
import com.example.smartlearning.Service.HistoryServiceInterface;
import com.example.smartlearning.Service.LikesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LikesController {
    private LikesServiceInterface likesServiceInterface;

    @Autowired
    public LikesController(LikesServiceInterface likesServiceInterface){
        this.likesServiceInterface=likesServiceInterface;
    }

    @PostMapping("/api/Likes")
    public ResponseEntity<Likes> addLikesData(@RequestBody Likes likes){
        return new ResponseEntity<Likes>(likesServiceInterface.addLikes(likes), HttpStatus.CREATED);
    }
}
