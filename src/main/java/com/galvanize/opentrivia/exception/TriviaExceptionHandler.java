package com.galvanize.opentrivia.exception;

import com.galvanize.opentrivia.model.TriviaExceptionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TriviaExceptionHandler {

    @ExceptionHandler(TriviaException.class)
    public ResponseEntity<TriviaExceptionModel> handleTriviaException(TriviaException triviaException){
        TriviaExceptionModel tex = new TriviaExceptionModel(triviaException.getMessage());
        return new ResponseEntity<TriviaExceptionModel>( tex,HttpStatus.NOT_FOUND);
    }
}
