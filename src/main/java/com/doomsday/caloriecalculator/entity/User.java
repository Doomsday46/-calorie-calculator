package com.doomsday.caloriecalculator.entity;

public class User {

    private long id;
    private String name, surname;
    private long parameter_id;

    public User(long id, String name, String surname, long parameter_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.parameter_id = parameter_id;
    }

    @Override
    public String toString() {
        return String.format(
                "user[id=%d, name='%s', surname='%s']",
                id, name, surname);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getParameter_id() {
        return parameter_id;
    }

    public void setParameter_id(long parameter_id) {
        this.parameter_id = parameter_id;
    }
}
