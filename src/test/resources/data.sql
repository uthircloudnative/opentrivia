-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlNoDataSourceInspectionForFile

INSERT INTO question (id, quiz_id, question_number, question, created_at)
VALUES (1, 1, 1, 'What did Yankee Doodle stick in his cap?', '2018-02-02 20:04:25');

INSERT INTO answer (id, quiz_id, choice, text, correct)
VALUES (1, 1, 'A', 'Feather', true);

INSERT INTO answer (id, quiz_id, choice, text, correct)
VALUES (2, 1, 'B', 'Noodle soup', false);

INSERT INTO answer (id, quiz_id, choice, text, correct)
VALUES (3, 1, 'C', 'Duck', false);
