package com.tekwill.learning.trivia.game.repository;

import com.tekwill.learning.trivia.game.domain.Question;

import java.util.List;

public interface QuestionRepository {
    List<Question> findQuestionsByLevel(int level);

    boolean save(Question question);

    boolean delete(Question question);

    List<Question> findAll();
}
