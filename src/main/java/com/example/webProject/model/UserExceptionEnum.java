package com.example.webProject.model;

public enum UserExceptionEnum {

    USER_ALREADY_EXIST(1, "Пользователь с такими данными уже существует"),
    USER_HAS_NO_AUTHORIZED(2, "Чтобы продолжить нужно авторизоваться!"),
    USER_HAS_NO_REGISTERED(3, "Чтобы продолжить, нужно зарегистрироваться!"),
    USER_HAS_NO_RIGHT(4, "Пользователь не имеет прав на доступ"),
    USER_NOT_FOUND(5, "Такой пользователь не найден"),
    LOGIN_IS_ALREADY_EXIST(6, "Пользователь с таки логином уже существует"),
    LOGIN_DOES_NOT_EXIST(7, "Пользователь не существует"),
    //PASSWORD_IS_ALREADY_EXIST(8, "Пользователь с таки логином уже существует"),
    PASSWORD_DOES_NOT_EXIST(9, "Неверный пароль");

    private int id;
    private String message;

    UserExceptionEnum() {}

    UserExceptionEnum(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
