package com.example.webProject.model;

import java.util.Objects;
import java.util.Set;

public class User {

    private Long id;
    private Set<String> role;

    private String name;
    private String surname;
    private String birthDate;
    private String login;
    private String password;

    private Set<String> buy;
    private int bonus;
    private Set<String> product;

    private Set<String> order;

    public User() {}
    public User(Set<String> role, String name, String surname, String birthDate, String login, String password, Set<String> buy, int bonus, Set<String> product, Set<String> order) {
        this.role = role;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.login = login;
        this.password = password;
        this.buy = buy;
        this.bonus = bonus;
        this.product = product;
        this.order = order;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getBuy() {
        return buy;
    }

    public void setBuy(Set<String> buy) {
        this.buy = buy;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Set<String> getProduct() {
        return product;
    }

    public void setProduct(Set<String> product) {
        this.product = product;
    }

    public Set<String> getOrder() {
        return order;
    }

    public void setOrder(Set<String> order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getBonus() == user.getBonus() &&
                id.equals(user.id) &&
                Objects.equals(getRole(), user.getRole()) &&
                getName().equals(user.getName()) &&
                getSurname().equals(user.getSurname()) &&
                Objects.equals(getBirthDate(), user.getBirthDate()) &&
                getLogin().equals(user.getLogin()) &&
                getPassword().equals(user.getPassword()) &&
                Objects.equals(getBuy(), user.getBuy()) &&
                Objects.equals(getProduct(), user.getProduct()) &&
                Objects.equals(getOrder(), user.getOrder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getRole(), getName(), getSurname(), getBirthDate(), getLogin(), getPassword(), getBuy(), getBonus(), getProduct(), getOrder());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", role=" + role +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", buy=" + buy +
                ", bonus=" + bonus +
                ", product=" + product +
                ", order=" + order +
                '}';
    }
}
