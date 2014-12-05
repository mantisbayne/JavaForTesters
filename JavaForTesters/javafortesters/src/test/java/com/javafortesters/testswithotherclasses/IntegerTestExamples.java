package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerTestExamples {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns 4", 4, four.intValue());
    }

    @Test
    public void integerStringExploration() {
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 4, five.intValue());
    }

    @Test
    public void integerHexExploration() {

        String value = Integer.toHexString(11);

        assertEquals("int becomes hex", "b", value);
    }

    @Test
    public void integerMaxMinExploration() {
        int max = 214743647;
        int min = -2147483648;
        assertEquals("MAX", Integer.MAX_VALUE, max);
        assertEquals("MIN", Integer.MIN_VALUE, min);
    }
}
