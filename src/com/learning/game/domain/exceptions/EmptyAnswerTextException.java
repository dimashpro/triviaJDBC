package com.tekwill.learning.trivia.game.domain.exceptions;

public class EmptyAnswerTextException extends RuntimeException{
    public EmptyAnswerTextException(String s) {
        super(s);
    }

}
