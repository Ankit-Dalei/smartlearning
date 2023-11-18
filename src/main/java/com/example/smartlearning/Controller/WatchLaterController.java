package com.example.smartlearning.Controller;

import com.example.smartlearning.Likes;
import com.example.smartlearning.Service.WatchLaterServiceInterface;
import com.example.smartlearning.WatchLater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class WatchLaterController {
    private WatchLaterServiceInterface watchLaterServiceInterface;

    @Autowired
    public WatchLaterController(WatchLaterServiceInterface watchLaterServiceInterface){
        this.watchLaterServiceInterface=watchLaterServiceInterface;
    }

    @PostMapping("/api/WatchLater")
    public ResponseEntity<WatchLater> addWatchLaterData(@RequestBody WatchLater watchLater){
        return new ResponseEntity<WatchLater>(watchLaterServiceInterface.addWatchlater(watchLater), HttpStatus.CREATED);
    }
}
