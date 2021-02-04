package com.galvanize.opentrivia.it.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class TriviaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getTriviaQuestions_returnsEmptyQuestions200() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/triviaqustions"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)));

    }

    @Test
    void getTriviaQuestionById_returnQuestion200() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/triviaqustions/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.quizId").value(1))
                .andExpect(jsonPath("$.questionNumber").value(1))
                .andExpect(jsonPath("$.question").value("What did Yankee Doodle stick in his cap?"));

    }
}
