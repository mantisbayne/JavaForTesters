package com.javafortesters.assertstests;

import com.javafortesters.exception.InvalidValue;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AssertsTest {

    @Test
    public void canUseAssertEquals() {
        String name = "meredith";

        int count = name.length();

        assertEquals(count, 8);

    }

    @Test
    public void canUseAssertFalse() {
        ArrayList<Integer> falseArray = new ArrayList<>();

        falseArray.add(4);
        falseArray.add(8);
        falseArray.add(90);

        int sum = 0;

        for (int i : falseArray)
            sum += i;

        Integer.toString(sum);

        System.out.print(sum);

        assertFalse("sum is 78", false);

    }

    @Test
    public void canUseAssertTrue() {
        List<String> trueArray = new ArrayList<>();

        trueArray.add("hello");
        trueArray.add("hola");
        trueArray.add("kon'nichiwa");
        trueArray.add("hallo");
        trueArray.add("bonjour");

        int count = trueArray.size();

        System.out.println(count);

        int i = 0;

        while(i < trueArray.size()){
            System.out.print(trueArray.get(i));
            i++;
        }

        assertTrue(trueArray.contains("hello"));
    }

    @Test
    public void canAssertArrayEquals() {
        String[] matchingArray = {"name", "dob", "occupation", "email"};

        String[] originalArray = {"name", "dob", "occupation", "email"};

        assertArrayEquals(originalArray, matchingArray);

    }

    @Test
    public void canAssertNotNull() {
        Map<String,String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        if (map.get("key1") == null) {
            throw new InvalidValue("Expected value not null ");
        } else {
            assertNotNull("value1", map.get("key1"));
        }
    }

    @Test
    public void canAssertNotSame() {
        SortedSet<String> alphabet = new <String>TreeSet();

        alphabet.add("a");
        alphabet.add("d");
        alphabet.add("c");
        alphabet.add("b");

        System.out.println(alphabet);

        String[] duplicate = new String[alphabet.size()];
        alphabet.toArray(duplicate);

        assertNotSame(duplicate, alphabet);
    }

    @Test
    public void canAssertNull() {
        Integer[] numbers = {1, 2, 8, 93, null, 5, 3};

        assertNull(numbers[4]);
    }

    @Test
    public void canAssertSame() {
        String[] greetings = {"hello", "hola", "kon'nichiwa", "hallo", "bonjour"};

/*        int i = 0;*/

        String[] happyGreeting;
        happyGreeting = Arrays.copyOf(greetings, 5);

        assertSame(greetings.length, happyGreeting.length);
/*
        for (String greeting : greetings) {

            greeting = greetings[i] + "!";

            System.out.print(greeting);

            i++;
        }*/

    }

    @Test
    public void canAssertThat() {
        Map<String, String> map = new HashMap<>();

        map.put("key", "value");
        map.put("key2", "value2");
        map.put("key17", "value2");

        assertThat("value2", is(map.get("key2")));
    }

    @Test
    public void canAssertThatEquals() {
        String name = "meredith";

        int count = name.length();

        assertThat(count, is(8));

    }

    @Test
    public void canUseAssertThatFalse() {
        ArrayList<Integer> falseArray = new ArrayList<>();

        falseArray.add(4);
        falseArray.add(8);
        falseArray.add(90);

        int sum = 0;

        for (int i : falseArray)
            sum += i;

        Integer.toString(sum);

        System.out.print(sum);

        assertThat(sum, is(102));

    }

    @Test
    public void canAssertThatTrue() {
        List<String> trueArray = new ArrayList<>();

        trueArray.add("hello");
        trueArray.add("hola");
        trueArray.add("kon'nichiwa");
        trueArray.add("hallo");
        trueArray.add("bonjour");

        int count = trueArray.size();

        System.out.println(count);

        int i = 0;

        while(i < trueArray.size()){
            System.out.print(trueArray.get(i));
            i++;
        }

        assertThat(trueArray.get(0), containsString("hello"));
    }

    @Test
    public void canAssertThatArrayEquals() {
        String[] matchingArray = {"name", "dob", "occupation", "email"};

        String[] originalArray = {"name", "dob", "occupation", "email"};

        assertThat(originalArray, equalTo(matchingArray));

    }

    @Test
    public void canAssertThatNotNull() {
        Map<String,String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        if (map.get("key1") == null) {
            throw new InvalidValue("Expected value not null ");
        } else {
            assertThat("value1", is(map.get("key1")));
        }
    }

    @Test
    public void canAssertThatNotSame() {
        SortedSet<String> alphabet = new <String>TreeSet();

        alphabet.add("a");
        alphabet.add("d");
        alphabet.add("c");
        alphabet.add("b");

        System.out.println(alphabet);

        String[] duplicate = new String[alphabet.size()];
        alphabet.toArray(duplicate);

        System.out.println(duplicate);

        assertThat(duplicate.toString(), not(alphabet.toString()));
    }

    @Test
    public void canAssertThatNull() {
        Integer[] numbers = {1, 2, 8, 93, null, 5, 3};

        assertThat(numbers[4], equalTo(null));
    }

    @Test
    public void canAssertThatSame() {
        String[] greetings = {"hello", "hola", "kon'nichiwa", "hallo", "bonjour"};

        String[] happyGreeting;
        happyGreeting = Arrays.copyOf(greetings, 5);

        assertThat(greetings.length, equalTo(happyGreeting.length));

    }

    @Test
    public void canUseHamcrestMatchers() {
        List<String> spaceMoviesAndTv = new ArrayList<>();

        spaceMoviesAndTv.add(0, "Star Wars");
        spaceMoviesAndTv.add(1, "Star Trek");
        spaceMoviesAndTv.add(2, "Lost In Space");

        System.out.print(spaceMoviesAndTv);

        assertThat(spaceMoviesAndTv.get(0), not(equalTo(" ")));

        String str = spaceMoviesAndTv.get(0);
        assertThat(spaceMoviesAndTv.get(1), startsWith(str.substring(0, 4)));

        assertThat(spaceMoviesAndTv.size(), is(3));

        assertThat(spaceMoviesAndTv.indexOf("Star Wars"), is(0));

        assertThat(spaceMoviesAndTv.get(1), not(endsWith(str.substring(4, 7))));

        assertThat(spaceMoviesAndTv.get(0), containsString("Star"));
    }
}
