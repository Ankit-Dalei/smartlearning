package com.example.smartlearning.Service;

import com.example.smartlearning.History;
import com.example.smartlearning.HistoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryServiceClass implements HistoryServiceInterface{
    private HistoryInterface historyInterface;

    @Autowired
    public HistoryServiceClass(HistoryInterface historyInterface){
        this.historyInterface=historyInterface;
    }
    @Override
    public History addHistory(History history) {
        return historyInterface.save(history);
    }
}
