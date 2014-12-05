package com.javafortesters.myfirsttest;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class AddTwoNumbers {
    @Test
    public void aJavaDocComment(){
        assertFalse(7 == addTwoNumbers(8987, 67888365));
    }

    /**
     * Add two integers and return an int.
     *
     * There is a risk of overflow since two big
     * integers would max out the return int.
     *
     * @param a is the first number to add
     * @param b is the second number to add
     * @return a+b as an int
     */

    public int addTwoNumbers(int a, int b){
        return a+b;
    }

}
