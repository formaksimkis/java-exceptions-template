package com.epam.izh.rd.online.exception;

public class UserNotFoundException extends Exception{

    public static final String USER_NOT_FOUND_MESSAGE = "Пользователь с таким логином не найден";
    public UserNotFoundException(String message) {
        super(message);
    }

}
