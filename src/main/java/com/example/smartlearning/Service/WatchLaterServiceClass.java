package com.example.smartlearning.Service;

import com.example.smartlearning.WatchLater;
import com.example.smartlearning.WatchLaterInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchLaterServiceClass implements WatchLaterServiceInterface{
    private WatchLaterInterface watchLaterInterface;
    @Autowired
    public WatchLaterServiceClass(WatchLaterInterface watchLaterInterface){
        this.watchLaterInterface=watchLaterInterface;
    }
    @Override
    public WatchLater addWatchlater(WatchLater watchLater) {
        return watchLaterInterface.save(watchLater);
    }
}
