package com.javafortesters.testswithcollections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestsWithCollections {

    @Test
    public void canAddElementsToACollection() {
        Collection workdays = new ArrayList();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        assertEquals(5, workdays.size());
    }

    @Test
    public void canAddElementsFromOneCollectionToAnother() {
        Collection workdays = new ArrayList();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        Collection daysOfWeek = new ArrayList();

        daysOfWeek.addAll(workdays);

        assertEquals(workdays.size(), daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(workdays));

        //System.out.println("Array : "+ Arrays.toString(daysOfWeek));

    }

    @Test
    public void canRemoveElements() {
        Collection weekendDays = new ArrayList();

        weekendDays.add("Saturday");
        weekendDays.add("Funday");


        weekendDays.remove("Funday");

        assertFalse(weekendDays.contains("Funday"));

        weekendDays.add("Sunday");

        assertEquals(2, weekendDays.size());
        assertTrue("Sunday in collection", weekendDays.contains("Sunday"));
    }

    @Test
    public void canIterateOverACollection() {
        ArrayList <String> daysOfWeek = new <String>ArrayList();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        for(String dayOfWeek : daysOfWeek) {
            System.out.print(dayOfWeek);
        }
    }

    @Test
    public void canClearACollection() {
        ArrayList <String> daysOfWeek = new <String>ArrayList();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        assertEquals(7, daysOfWeek.size());

        daysOfWeek.clear();

        assertEquals(0, daysOfWeek.size());
        assertTrue(daysOfWeek.isEmpty());
    }

    @Test
    public void canRemoveOneCollectionFromAnother() {
        Collection workdays = new ArrayList();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        Collection weekendDays = new ArrayList();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        Collection<String> daysOfWeek = new <String>ArrayList();
        daysOfWeek.addAll(workdays);
        daysOfWeek.addAll(weekendDays);

        assertEquals(7, daysOfWeek.size());

        daysOfWeek.removeAll(weekendDays);

        assertTrue(daysOfWeek.containsAll(workdays));
        assertEquals(5, daysOfWeek.size());
        assertFalse(daysOfWeek.containsAll(weekendDays));

    }

    @Test
    public void canConvertCollectionToArray() {
        ArrayList <String> daysOfWeek = new <String>ArrayList();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        String[] anotherArray = new String[daysOfWeek.size()];
        daysOfWeek.toArray(anotherArray);
        assertEquals("Monday".length(),
                anotherArray[0].length());
    }



}
