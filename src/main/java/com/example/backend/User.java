package com.example.backend;

public class User {

    private String name;

    private String firstname;

    public User(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
