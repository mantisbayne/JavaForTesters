package com.javafortesters.domainentities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void userHasDefaultUsernameAndPassword() {
        User user = new User();

        assertEquals("default username expected",
                "username1",
                user.getUsername());

        assertEquals("default password expected",
                "password1",
                user.getPassword());

    }

    @Test
    public void canConstructANewUser() {
        User user = new User();
    }



    @Test
    public void canSetUsernameAndPasswordAfterConstructed() {
        User user = new User();
        user.setPassword("PaZZwor6");
        user.setUsername("teaser");

        assertEquals("setter password expected",
                "PaZZwor6",
                user.getPassword());

        assertEquals("setter username expected",
                "teaser",
                user.getUsername());
    }

    @Test
    public void aUserHasNormalPermissions() {
        User aUser = new User();
        assertEquals("Normal", aUser.getPermission());
    }
}
