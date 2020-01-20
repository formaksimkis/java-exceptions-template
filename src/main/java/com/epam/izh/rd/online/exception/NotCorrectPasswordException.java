package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception {

    public static final String NOT_CORRECT_PASSWORD_MESSAGE = "Пароль введен неверно";
    public NotCorrectPasswordException(String message) {
        super(message);
    }

}
