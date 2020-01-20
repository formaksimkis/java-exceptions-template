package com.epam.izh.rd.online.exception;

public class UserAlreadyRegisteredException extends Exception {

    public static final String USER_ALREADY_REGISTERED_MESSAGE = "Уже зарегистрирован пользователь с логином: ";
    public UserAlreadyRegisteredException(String message) {
        super(message);
    }

}
