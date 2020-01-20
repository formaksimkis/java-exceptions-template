package com.epam.izh.rd.online.exception;

public class NotAccessException extends Exception {

    public static final String NOT_ACCESS_MESSAGE = "Недостаточно прав для выполнения операции";
    public NotAccessException(String message) {
        super(message);
    }

}
