package com.galvanize.opentrivia.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.nio.MappedByteBuffer;
import java.sql.Timestamp;
import java.util.List;

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

    @JsonManagedReference
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Answer> answers;


}
