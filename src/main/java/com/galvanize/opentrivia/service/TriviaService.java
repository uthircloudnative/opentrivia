package com.galvanize.opentrivia.service;

import com.galvanize.opentrivia.entity.Question;
import com.galvanize.opentrivia.exception.TriviaException;
import com.galvanize.opentrivia.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TriviaService {

    private QuestionRepository questionRepository;

    public TriviaService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question getTriviaQuestionById(String questionId) throws TriviaException {
        Optional<Question> questionOpt = questionRepository.findById(Long.valueOf(questionId));
        if(questionOpt.isEmpty()){
            throw new TriviaException("No Such Question Found");
        }
        return questionOpt.get();
    }

    public List<Question> getTriviaQuestions() {
        return questionRepository.findAll();
    }
}
