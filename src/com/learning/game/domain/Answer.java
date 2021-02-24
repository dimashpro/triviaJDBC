package com.tekwill.learning.trivia.game.domain;


import com.tekwill.learning.trivia.game.domain.exceptions.EmptyAnswerTextException;

import java.util.Objects;

public class Answer {
    private String text;
    private boolean isCorrect;
    private String letter;
    private Question question;


    public Answer(String text, boolean isCorrect, String letter) {
        if (text.isEmpty())
            throw new EmptyAnswerTextException("Answer text should not be empty");
        this.text = text;
        this.isCorrect = isCorrect;
        this.letter = letter;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return isCorrect == answer.isCorrect &&
                Objects.equals(text, answer.text) &&
                Objects.equals(letter, answer.letter) &&
                Objects.equals(question, answer.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, isCorrect, letter, question);
    }

    @Override
    public String toString() {
        return letter + ". " + text;
    }
}
