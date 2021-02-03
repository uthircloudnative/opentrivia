package com.galvanize.opentrivia.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TriviaController {
    
    @GetMapping("/api/v1/triviaqustions")
    public void getTriviaQuestions(){

    }

    
}
