package com.galvanize.opentrivia.controller;

import com.galvanize.opentrivia.entity.Question;
import com.galvanize.opentrivia.service.TriviaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TriviaController {

    private TriviaService triviaService;

    public TriviaController(TriviaService triviaService) {
        this.triviaService = triviaService;
    }

    @GetMapping("/api/v1/triviaqustions")
    public void getTriviaQuestions(){

    }

    @GetMapping("/api/v1/triviaqustions/{questionid}")
    public Question getTriviaQuestionById(@PathVariable(name="questionid") String questionId) {
        return triviaService.getTriviaQuestionById(questionId);
    }

    
}
