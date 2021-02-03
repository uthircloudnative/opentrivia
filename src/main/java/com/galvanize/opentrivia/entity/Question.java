package com.galvanize.opentrivia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question")
public class Question {

    @Id
    //@GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "quiz_id")
    private Integer quizId;
    @Column(name = "question_number")
    private Integer questionNumber;

    @Column(name = "question")
    private String question;

    @Column(name = "created_at")
    private Timestamp created_at;


}
