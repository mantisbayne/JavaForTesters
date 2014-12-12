package com.javafortesters.testswithlists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestsWithLists {

    @Test
    public void getAnElementByIndex() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));

        days.remove(1);

        assertEquals(2, days.size());
        assertEquals("Monday", days.get(0));
        assertEquals("Wednesday", days.get(1));
    }

    @Test
    public void canAddAnElementByIndex() {
        List<String> days = new ArrayList<>();
        days.add("Tuesday");
        days.add("Thursday");
        days.add("Saturday");

        days.add(0, "Monday");
        days.add(2, "Wednesday");
        days.add(4, "Friday");
        days.add(6, "Sunday");

        assertEquals(7, days.size());
    }

    @Test
    public void canAddAllElementsInACollection() {
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Friday");

        List<String> missingDays = new ArrayList<>();
        missingDays.add("Tuesday");
        missingDays.add("Wednesday");
        missingDays.add("Thursday");

        days.addAll(1, missingDays);

        assertEquals(5, days.size());
        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));
        assertEquals("Thursday", days.get(3));
        assertEquals("Friday", days.get(4));

        List<String> weekendDays = new ArrayList<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        days.addAll(days.size(), weekendDays);

        assertEquals(7, days.size());

    }

    @Test
    public void canFindIndexOfAnElement() {
        List<String> days = new ArrayList<>();

        days.add("Tuesday");
        days.add("Thursday");
        days.add("Saturday");

        assertEquals(1, days.indexOf("Thursday"));
    }

    @Test
    public void canFindTheLastIndexOfAnElement() {
        List<String> days = new ArrayList<>();

        days.add("Tuesday");
        days.add("Thursday");
        days.add("Saturday");
        days.add("Thursday");
        days.add("Thursday");
        days.add("Sunday");

        assertEquals(4, days.lastIndexOf("Thursday"));
    }

    @Test
    public void canSetTheElementAtAnIndex() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Thursday");
        days.add("Wednesday");

        days.set(1, "Tuesday");
        days.set(2, "Wednesday");

        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));

        assertEquals(3, days.size());
    }

    @Test
    public void canCreateAPortionOfTheList() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        List<String> workdays = days.subList(0, 5);

        assertEquals(5, workdays.size());

        assertEquals("Monday", workdays.get(0));

    }

    @Test
    public void canIterateUsingLoop() {
        String[] someDays = {"Tuesday","Thursday",
                "Wednesday","Monday",
                "Saturday","Sunday",
                "Friday"};

        List<String> days = Arrays.asList(someDays);

/*        int forCount=0;

        for(String day: days) {
            if(day.equals("Monday")) {
                break;
            }
            forCount++;
        }
        assertEquals("Monday is at position 3", 3, forCount);*/
/*
        int loopCount;

        for(loopCount = 0; loopCount < days.size(); loopCount++) {
            if(days.get(loopCount).equals("Monday")) {
                break;
            }
        }
        assertEquals("Monday is at position 3", 3, loopCount);*/

/*        int count = 0;
        while(!days.get(count).equals("Monday")) {
            count++;
        }
        assertEquals("Monday is at position 3", 3, count);*/

/*        int docount = -1;
        do {
            docount++;
        } while (!days.get(docount).equals("Monday"));
        assertEquals("Monday is at position 3", 3, docount);*/

        int docount;
        for(docount = 0; !days.get(docount).equals("Monday"); docount++) {
            if(days.get(docount).equals("Monday")) {
                break;
            }
        }
        assertEquals("Monday is at position 3", 3, docount);
    }

}
