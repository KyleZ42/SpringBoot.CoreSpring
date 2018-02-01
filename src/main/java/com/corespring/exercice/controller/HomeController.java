package com.corespring.exercice.controller;

import com.corespring.exercice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${page.color.default}")
    private String defaultColor;

    private String userColor;

    @Autowired
    public HomeController(MessageService messageService) {
        this.userColor = messageService.getUserColor();
    }

    @RequestMapping("/")
    public String home(){
        //return "La couleur par défaut est: " + this.defaultColor;
        return "la couleur de l'utilisateur est: "+ this.userColor;
    }
}
