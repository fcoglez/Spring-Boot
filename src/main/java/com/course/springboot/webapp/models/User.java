package com.course.springboot.webapp.models;

public class User {

    private String name;
    private String surname;
    private String email;

    public User() {
    }

    public User(String name, String surname) {
        this.surname = surname;
        this.name = name;
    }

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
