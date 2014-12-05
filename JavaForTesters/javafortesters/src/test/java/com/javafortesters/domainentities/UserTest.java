package com.javafortesters.domainentities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void userHasDefaultUsernameAndPassword() {
        User user = new User();

        assertEquals("default username expected",
                "mbayne",
                user.getUsername());

        assertEquals("default password expected",
                "password",
                user.getPassword());

    }

    @Test
    public void canConstructANewUser() {
        User user = new User();
    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin", "pA55w0rD");
        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "pA55w0rD",
                user.getPassword());
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

}
