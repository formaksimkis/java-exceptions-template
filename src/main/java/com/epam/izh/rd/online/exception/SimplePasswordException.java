package com.epam.izh.rd.online.exception;

public class SimplePasswordException extends Exception {

    public static final String SIMPLE_PASSWORD_MESSAGE = "Пароль не соответствует требованиям безопасности";
    public SimplePasswordException(String message) {
        super(message);
    }

}
