package com.javafortesters.domainentities;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        setPassword(password);
        this.password = password;
    }

    public User(){
        this("mbayne", "password");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() < 7) {
            throw new IllegalArgumentException("Password must be > than 6 characters");
        }
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
