package com.tekwill.learning.trivia.game.repository;

import com.tekwill.learning.trivia.game.domain.Answer;
import com.tekwill.learning.trivia.game.domain.Question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionRepositoryImpl implements QuestionRepository {
    public List<Question> questions = new ArrayList<>(Arrays.asList(
            new Question(100, 1, "Which of these cities is the capital of the Republic of Moldova?",
                    Arrays.asList(new Answer("Rome", false, "A"), new Answer("Vienna", false, "B"),
                            new Answer("Chisinau", true, "C"), new Answer("Monaco", false, "D"))),

            new Question(100, 1, "Who composed the masterpiece \"Luceafarul\"?",
                    Arrays.asList(new Answer("Shakespeare", false, "A"), new Answer("Eminescu", true, "B"),
                            new Answer("Pushkin", false, "C"), new Answer("Alighieri", false, "D"))),

            new Question(100, 1, "What is the most dangerous breed of dog?",
                    Arrays.asList(new Answer("chi hua hua", false, "A"), new Answer("doberman", false, "B"),
                            new Answer("pit bull", true, "C"), new Answer("vasea bolea", false, "D"))),

            new Question(250, 2, "What is the most useful platform to study the Java programming language?",
                    Arrays.asList(new Answer("Facebook", false, "A"), new Answer("Instagram", false, "B"),
                            new Answer("Tik Tok", false, "C"), new Answer("docs.oracle.com/en/java/", true, "D"))),

            new Question(250, 2, "Which of these is NOT an non-access modifier?",
                    Arrays.asList(new Answer("abstract", false, "A"), new Answer("private", true, "B"),
                            new Answer("static", false, "C"), new Answer("final", false, "D"))),

            new Question(250, 2, "Which of these is NOT a feature and component of Java?",
                    Arrays.asList(new Answer("encapsulation", false, "A"), new Answer("platform independence", false, "B"),
                            new Answer("drinking beer", true, "C"), new Answer("object orientation", false, "D"))),

            new Question(350, 3, "Where are stored object reference variables?",
                    Arrays.asList(new Answer("In Stack memory", false, "A"), new Answer("In brain", false, "B"),
                            new Answer("In Heap memory", true, "C"), new Answer("On the roof", false, "D"))),

            new Question(350, 3, "Who is awesome??? :)",
                    Arrays.asList(new Answer("Java", true, "A"), new Answer("Python", false, "B"),
                            new Answer("C#", false, "C"), new Answer("JavaScript", false, "D"))),

            new Question(350, 3, "Which of these data types have smallest size?",
                    Arrays.asList(new Answer("byte", true, "A"), new Answer("short", false, "B"),
                            new Answer("int", false, "C"), new Answer("long", false, "D")))));


    @Override
    public List<Question> findQuestionsByLevel(int level) {
        List<Question> result = new ArrayList<>();
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getLevel() == level)
                result.add(questions.get(i));
        }
        return result;

//        try (Connection connection = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5432/trivia-db?user=postgres&password=123456")) {
//            System.out.println("Using long url obtained " + connection.getClientInfo());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return result;
    }

    @Override
    public boolean save(Question question) {
        return questions.add(question);
    }

    @Override
    public boolean delete(Question question) {
        return questions.remove(question);
    }

    @Override
    public List<Question> findAll() {
        return questions;
    }
}
