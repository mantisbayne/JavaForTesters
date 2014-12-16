package com.javafortesters.exceptions;

import com.javafortesters.domainentities.User;
import com.javafortesters.exception.InvalidCredentials;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

public class ExceptionsExampleTest {

    @Test
    public void throwANullPointerException() {
        Integer age = null;

        String ageAsString = age.toString();

        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void canUseTryCatchToCatchAnException() {
        Integer age = null;

        String ageAsString = null;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " +
                    e.getMessage());
        }

        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);

    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected() {
        Integer age = null;
        age.toString();
    }

    @Test
    public void tryCatchFinallyANullPointerException() {
        Integer age = null;
        String ageAsString = null;
        String yourAge = "";

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        } finally {
            yourAge = "You are " + ageAsString + " years old";
        }

        assertEquals("You are 18 years old", yourAge);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exampleTryCatchFinally() {
        Integer age = null;

        try {
            System.out.println("1. generate a null pointer exception");
            System.out.println(age.toString());
        } catch (NullPointerException e) {
            System.out.println("2. handle null pointer exception");
            throw new IllegalArgumentException("Null pointer became illegal", e);
        } finally {
            System.out.println("3. run code in finally section");
        }
    }

    @Test
    public void canCreateDefaultUserWithoutHandlingException() {
        User aUser = new User();
        assertEquals("username", aUser.getUsername());
        assertEquals("password", aUser.getPassword());
    }

    @Test
    public void haveToCatchIllegalPasswordForParamConstructor() {
        try {
            User aUser = new User("me", "letmein");
        } catch (InvalidCredentials invalidCredentials) {
            throw new IllegalArgumentException("Was not expecting an invalid password exception", invalidCredentials);
        }
    }

/*    @Ignore("Because this is not finished")
    @Test
    public void canThrowExceptionForTooManyAttemptsToLogIn() {
        //@TODO create a class that will count the number of attempts
        int loginCount 0;

        for(i = 0; i <)
        //if the number is higher than 5, throw the exception
    }*/

    @Test(expected = InvalidCredentials.class)
    public void expectInvalidPasswordException() throws InvalidCredentials {
        User user = new User("username", "d<6");
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void invalidPasswordThrown() throws InvalidCredentials {
        expected.expect(InvalidCredentials.class);
        expected.expectMessage(containsString("6 characters"));
        User user = new User("username", "fd<6");
    }
}