package com.doomsday.caloriecalculator.entity;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private Double weight;
    @Column
    private Double height;
    @Column
    private Integer age;
    @Column
    private Double activity;

    public User(){

    }

    public User(long id, String name, String surname, Double weight, Double height, Integer age, Double activity) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.activity = activity;
    }

    public User(String name, String surname, Double weight, Double height, Integer age, Double activity) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.activity = activity;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getActivity() {
        return activity;
    }

    public void setActivity(Double activity) {
        this.activity = activity;
    }
}
