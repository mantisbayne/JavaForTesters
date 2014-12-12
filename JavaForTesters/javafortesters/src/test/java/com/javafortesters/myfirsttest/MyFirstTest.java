package com.javafortesters.myfirsttest;

import com.javafortesters.basicsofjavarevisited.ClassExample;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo() {

        int answer = 2+2;
        assertEquals("2+2=4", 4, answer );

    }

    @Test
    public void canMultiplyTwoTimesTwo() {

        int answer = 2*2;
        assertEquals("2*2=4", 4, answer);
    }

    @Test
    public void canDivideByTwo() {

    }

    @Test
    public void variableNaming() {
        String $aString = "bob";
        float €owed = 10F;
        int aMount = 4;
        long Amount = 5;
        String A0123456789bCd$f="ugh";

        assertEquals(4, aMount);
        assertEquals(5, Amount);
        assertEquals(10.0F, €owed, 0);
        assertEquals("bob", $aString);
        assertEquals("ugh", A0123456789bCd$f);
    }


    @Test
    public void canVerifyClassField() {
       assertEquals(ClassExample.aClassField, "a class field");

       ClassExample instance = new ClassExample();

        instance.aClassField = "changed";

    }

    @Test
    public void BooleanType() {
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(truthy);
        assertFalse(falsey);

        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;

        assertTrue(truthy);
        assertFalse(falsey);
    }

    @Test
    public void IntegerTypes() {
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;

        System.out.println(
                "* `byte` range: " +
                Byte.MIN_VALUE + " to " +
                Byte.MAX_VALUE
        );

        System.out.println(
                "* `short` range: " +
                 Short.MIN_VALUE + " to " +
                 Short.MAX_VALUE
        );

        System.out.println(
                "* `int` range: " +
                Integer.MIN_VALUE + " to " +
                Integer.MAX_VALUE
        );

        System.out.println(
                "* `long` range: " +
                Long.MIN_VALUE + " to " +
                Long.MAX_VALUE
        );

        aLongHas8Bytes = 0L; //Suffix L is for long
        assertEquals(0, aLongHas8Bytes);

        aByteHas1Byte = 0xA; //0x is for hexagonal
        assertEquals(10, aByteHas1Byte);

        anIntHas4Bytes = 010; //0 prefix for octal
        assertEquals(8, anIntHas4Bytes);

        aByteHas1Byte = 0b0010; //Binary
        assertEquals(aByteHas1Byte, 2);

        aLongHas8Bytes = 9_000_000_000L; //9 billion
        assertEquals(9000000000L, aLongHas8Bytes);

    }

    @Test
    public void FloatingPointType() {
        float singlePrecision32bit;
        double doublePrecision64bit;

        System.out.println(
                "* `float` range: " +
                Float.MIN_VALUE + " to " +
                Float.MAX_VALUE
        );

        System.out.println(
                "* `double` range: " +
                Double.MIN_VALUE + " to " +
                Double.MAX_VALUE
        );

        singlePrecision32bit = 10.0F; //Suffix F for float
        assertEquals(10F, singlePrecision32bit, 0);

        doublePrecision64bit = 20.0; //default to double
        assertEquals(20D, doublePrecision64bit, 0);
    }

    @Test
    public void CharacterType() {
        char aChar = '\u0026';

        assertEquals(aChar, '&');
    }

    @Test
    public void assignmentOperatorsExplored() {
        String ab = "ab";
        assertEquals("ab", ab);

        int num = 87;
        assertEquals(87, num);

        num += 2;
        assertEquals("-= decrements by", 89, num);

        num *=2;
        assertEquals("*= multiplies by", 178, num);

        num /= 2;
        assertEquals("/= divides by", 89, num);

        num %= 3;
        assertEquals("%= modulus of", 2, num);
    }

    @Test
    public void ternaryOperatorsExplored() {
        int x;
        x = 4 > 3 ? 2 :1;
        assertEquals(2, x);

        assertTrue(5>=4 ? true : false);
    }

    @Test
    public void someStringMethods() {
        String aString = "abcdef";

        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }

}
