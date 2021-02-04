package com.galvanize.opentrivia.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "answer")
public class Answer {

    //id, question_id, choice, text, correct
    @Id
    //@GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch= FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name="question_id",nullable = false)
    private Question question;

    @Column(name = "choice")
    private String choice;
    @Column(name = "text")
    private String text;
    @Column(name = "correct")
    private Boolean correct;
}
