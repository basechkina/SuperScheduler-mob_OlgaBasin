package com.olga.scheduler.model;

public class User {
    private String userName;
    private String password;

    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User " +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
