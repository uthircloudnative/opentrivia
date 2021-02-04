package com.galvanize.opentrivia.controller;

import com.galvanize.opentrivia.entity.Question;
import com.galvanize.opentrivia.exception.TriviaException;
import com.galvanize.opentrivia.service.TriviaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TriviaController {

    private TriviaService triviaService;

    public TriviaController(TriviaService triviaService) {
        this.triviaService = triviaService;
    }

    @GetMapping("/api/v1/trivia-questions")
    public List<Question> getTriviaQuestions(){
        return triviaService.getTriviaQuestions();
    }

    @GetMapping("/api/v1/trivia-questions/{questionid}")
    public Question getTriviaQuestionById(@PathVariable(name="questionid") String questionId) throws Exception {
        return triviaService.getTriviaQuestionById(questionId);
    }

    
}
