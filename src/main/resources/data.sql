-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlNoDataSourceInspectionForFile

INSERT INTO question (id, quiz_id, question_number, question, created_at)
VALUES (1, 1, 1, 'What did Yankee Doodle stick in his cap?', '2018-02-02 20:04:25');

INSERT INTO answer (id, question_id, choice, text, correct)
VALUES (1, 1, 'A', 'Feather', true);

INSERT INTO answer (id, question_id, choice, text, correct)
VALUES (2, 1, 'B', 'Noodle soup', false);

INSERT INTO answer (id, question_id, choice, text, correct)
VALUES (3, 1, 'C', 'Duck', false);

INSERT INTO question (id, quiz_id, question_number, question, created_at)
VALUES (2, 1, 2, 'What word completes the phrase: “Everything but the kitchen”?', '2018-02-02 20:05:13');

INSERT INTO answer (id, question_id, choice, text, correct)
VALUES (4, 2, 'A', 'Sink', true);

INSERT INTO answer (id, question_id, choice, text, correct)
VALUES (5, 2, 'B', 'Kaleidoscope', false);

INSERT INTO answer (id, question_id, choice, text, correct)
VALUES (6, 2, 'C', 'Hogwash', false);

INSERT INTO question (id, quiz_id, question_number, question, created_at)
VALUES (3, 1, 3, 'What was the first theatrical feature film to be completely computer-animated?', '2018-02-02 20:05:48');

INSERT INTO answer (id, question_id, choice, text, correct)
VALUES (7, 3, 'A', 'Gone with the Wind', false);

INSERT INTO answer (id, question_id, choice, text, correct)
VALUES (8, 3, 'B', 'Toy Story 2', false);

INSERT INTO answer (id, question_id, choice, text, correct)
VALUES (9, 3, 'C', 'Toy Story', true);
