package com.example.smartlearning.Service;

import com.example.smartlearning.LikeInterface;
import com.example.smartlearning.Likes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesServiceClass implements LikesServiceInterface{
    private LikeInterface likeInterface;

    @Autowired
    public LikesServiceClass(LikeInterface likeInterface){
        this.likeInterface=likeInterface;
    }
    @Override
    public Likes addLikes(Likes likes) {
        return likeInterface.save(likes);
    }
}
