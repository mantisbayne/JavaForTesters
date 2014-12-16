package com.javafortesters.domainentities;

import com.javafortesters.exception.InvalidCredentials;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        setPassword(password);
        this.password = password;
    }

    public User(){
        this("username1", "password1", false);
    }


    private User(String username, String password, boolean b){
        //We don't want to throw an exception
        this.username = username;


        try{
            //function(1)
            setPassword(password);
        }catch (InvalidCredentials e){
            throw new IllegalArgumentException("Default password incorrect ", e);
        }

/*        try{
            setUsername(username);
        }catch(InvalidUsername e){
            throw new IllegalArgumentException("This username is not registered", e);
        }*/
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() < 7) {
            throw new InvalidCredentials("Password must be > than 6 characters");
        }

        String mustIncludeANumber = ".*[0123456789]+.*";

        if(password.matches(mustIncludeANumber)) {
            System.out.println(password);
        }else{
            throw new InvalidCredentials("Password must include a number");
        }


        this.password = password;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPermission() {
        return "Normal";
    }

}
