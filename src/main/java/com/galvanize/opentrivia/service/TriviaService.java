package com.galvanize.opentrivia.service;

import com.galvanize.opentrivia.entity.Question;
import com.galvanize.opentrivia.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TriviaService {

    private QuestionRepository questionRepository;

    public TriviaService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question getTriviaQuestionById(String questionId){
        Optional<Question> questionOpt = questionRepository.findById(Long.valueOf(questionId));
        return questionOpt.get();
    }
}
