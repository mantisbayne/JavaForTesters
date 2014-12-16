package com.javafortesters.domainentities;

public class AdminUser extends User {

    @Override
    public String getPermission(){
        return "Elevated";
    }

    public AdminUser(String username, String password) {
        super(username, password);
    }

    public AdminUser() {
        this("adminuser", "password");
    }
}
