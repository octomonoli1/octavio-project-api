package com.personal.octavio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WellcomeController {

    @GetMapping("")
    public void great(){
        System.out.println("Bienvendios al sistema");
    }
}
