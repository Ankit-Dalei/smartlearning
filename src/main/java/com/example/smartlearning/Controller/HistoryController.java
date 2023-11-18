package com.example.smartlearning.Controller;

import com.example.smartlearning.History;
import com.example.smartlearning.Service.HistoryServiceInterface;
import com.example.smartlearning.UserSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HistoryController {
    private HistoryServiceInterface historyServiceInterface;

    @Autowired
    public HistoryController(HistoryServiceInterface historyServiceInterface){
        this.historyServiceInterface=historyServiceInterface;
    }

    @PostMapping("/api/History")
    public ResponseEntity<History> addHistoryData(@RequestBody History history){
        return new ResponseEntity<History>(historyServiceInterface.addHistory(history), HttpStatus.CREATED);
    }
}
