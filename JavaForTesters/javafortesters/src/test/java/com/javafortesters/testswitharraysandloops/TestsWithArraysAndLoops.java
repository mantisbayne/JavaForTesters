package com.javafortesters.testswitharraysandloops;

import com.javafortesters.arraysandloops.ArraysAndLoops;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class TestsWithArraysAndLoops {

    @Test
    public  void canVerifyWorkdays() {
        assertEquals("Monday", ArraysAndLoops.workdays[0]);
    }


    @Test
    public void canVerifyDaysWorked() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String days="";

        int dayindex = 0;
        for(String workday : workdays) {
        days = days + "|" + workdays;

            System.out.print("found " + workday + " at position " + dayindex + ", ");

            dayindex++;
        }
    }

    @Test
    public void canVerifyDaysWorkedWithForLoop() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String days="";

        for(int i=0; i<workdays.length; i++) {
            days = days + "|" + workdays[i];

        }

        assertEquals(5, workdays.length);

    }

    @Test
         public void canCopyAnArrayAndMakeLonger() {

        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 7);

        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";

        assertEquals("Saturday", weekDays[5]);
        assertEquals("Sunday", weekDays[6]);

        System.out.print(weekDays[5] + ": " + weekDays[6]);
    }

    @Test
    public void canCopyAnArrayAndMakeShorter() {

        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 3);

        assertEquals(3, weekDays.length);
        assertEquals("Monday, Tuesday, Wednesday", weekDays[0] + ", " + weekDays[1] + ", " + weekDays[2]);

        System.out.print(weekDays[0] + ", " + weekDays[1] + ", " + weekDays[2]);
    }

    @Test
    public void canCopySubsetOfArrayIntoNewArray() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String[] weekDays = Arrays.copyOfRange(workdays, 2, 5);

        System.out.print(weekDays[0] + ", " + weekDays[1] + ", " + weekDays[2]);

        assertEquals(3, weekDays.length);

        assertEquals(weekDays[0], workdays[2]);
        assertEquals(weekDays[1], workdays[3]);
        assertEquals(weekDays[2], workdays[4]);
    }

    @Test
    public void canAddToSubsetOfArray() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String[] weekDays = Arrays.copyOfRange(workdays, 2, 7);

        assertEquals(5, weekDays.length);
        assertEquals(null, weekDays[3]);
        assertEquals(null, weekDays[4]);

        System.out.print(weekDays[0] + ": " + weekDays[1] + ": " +  weekDays[2] + ": " +  weekDays[3] + ": " +  weekDays[4]);
    }

    @Test
    public void canFillAnArray() {
        String[] tvShows = new String[30];

        Arrays.fill(tvShows, "Star Trek");


        System.out.print(tvShows[29]);

        Arrays.fill(tvShows, 5, 10, "30 Rock");

        System.out.print(tvShows[9]);
    }

    @Test
    public void canSortAnArray() {
        int[] outOfOrder = {9, 7, 6, 5, 3, 1, 2, 4, 0};

        Arrays.sort(outOfOrder);

        assertEquals(6, outOfOrder[6]);
        assertEquals(0, outOfOrder[0]);
    }

    @Test
    public void canCreateAMultiArray() {
        int [][] multi = new int[4][4];

        assertEquals(4, multi.length);
        assertEquals(4, multi[0].length);
        System.out.print(multi.length + ": ");
        System.out.print(multi[0].length + ": ");

        multi[0][1] = 1;
        assertEquals(1, multi[0][1]);
        System.out.print(multi[0][1]);
    }

    @Test
    public void canCreateRaggedArray() {
        int[][] ragged2d = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        assertEquals(4, ragged2d[0][3]);
        assertEquals(6, ragged2d[1][1]);
        assertEquals(7, ragged2d[2][0]);

        System.out.println();

    }

/*
 @TODO Make this work
 @Test
    public void canCreate2DArray() {
        public String print2DIntArray(int [][] multi){
            for (int[] outer : multi) {
                if (outer == null) {
                    System.out.print("null");
                } else {
                    for (int inner : outer) {
                        System.out.print(inner + ",");
                    }
                }
                System.out.println("");
            }
        }
    }*/

    @Test
    public void canPrintRaggedArrayTriangle() {
        //create an empty ragged array
        int raggedTriangle[][] = {
                {0},
                {0, 1},
                {0, 1, 2},
                {0, 1, 2, 3},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5, 6},
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6, 7, 8},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}
        };
        //print to console
        for (int i = 0; i < raggedTriangle.length; i++) {
            for (int j = 0; j < raggedTriangle[i].length; j++) {
                System.out.print(raggedTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }



}
