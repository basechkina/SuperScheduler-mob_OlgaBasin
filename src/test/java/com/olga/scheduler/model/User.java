package com.olga.scheduler.model;

public class User {
    private String userName;
    private String password;

    public void withUserName(String userName) {
        this.userName = userName;
    }

    public void withPassword(String password) {
        this.password = password;
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
