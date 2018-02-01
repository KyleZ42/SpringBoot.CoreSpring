package com.corespring.exercice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Value("${mycolors.second}")
    private String myColor;

    public MessageService() {

    }

    public String getUserColor(){
        return this.myColor;
    }

    @Override
    public String toString() {
        return "MessageService{" +
                "myColor='" + myColor + '\'' +
                '}';
    }
}
