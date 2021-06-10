package com.example.webProject.model;

public enum UserRoleEnum {

    CLIENT(1, "green", "user"),
    ADMIN(2, "black", "admin");

    private int num;
    private String color;
    private String name;

    UserRoleEnum() {}

    UserRoleEnum(int num, String color, String name) {
        this.num = num;
        this.color = color;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
