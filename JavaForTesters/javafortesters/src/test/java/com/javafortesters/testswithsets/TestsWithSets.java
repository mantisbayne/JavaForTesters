package com.javafortesters.testswithsets;

import com.javafortesters.domainentities.User;
import com.javafortesters.domainentities.UserComparator;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TestsWithSets {
    @Test
    public void setDoesNotAllowDuplicateElements() {
        Set workdays = new HashSet<>();

        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(1, workdays.size());
    }

    @Test
    public void sortedSetCanMaintainSortOrder() {

        SortedSet<String> alphaset = new <String>TreeSet();

        alphaset.add("c");
        alphaset.add("d");
        alphaset.add("a");
        alphaset.add("b");
        alphaset.add("a");

        assertEquals(4, alphaset.size());

        String[] alphas = new String[alphaset.size()];
        alphaset.toArray(alphas);

        assertEquals("a", alphas[0]);
        assertEquals("b", alphas[1]);
    }

    @Test
    public void canRetrieveFirstAndLast() {
        SortedSet<String> alphaset = new <String>TreeSet();

        alphaset.add("c");
        assertEquals("c", alphaset.first());

        alphaset.add("a");
        assertEquals("a", alphaset.first());

        alphaset.add("d");
        assertEquals("d", alphaset.last());
    }

    @Test
    public void sortedSetcanReturnHeadSet() {
        SortedSet<String> alphaset = new <String>TreeSet();

        alphaset.add("c");
        alphaset.add("d");
        alphaset.add("b");
        alphaset.add("a");

        /*SortedSet<String> subset = alphaset.headSet("c");

        assertEquals(2, subset.size());

        String[] alphas = new String[subset.size()];
        subset.toArray(alphas);

        assertEquals("a", alphas[0]);
        assertEquals("b", alphas[1]);*/

        SortedSet<String> subset = alphaset.tailSet("c");

        assertEquals(2, subset.size());

        String[] alphas = new String[subset.size()];
        subset.toArray(alphas);

        assertEquals("c", alphas[0]);
        assertEquals("d", alphas[1]);
    }

    @Test
    public void sortedSetCanReturnSubSet() {

        SortedSet<String> alphaset = new <String>TreeSet();

        alphaset.add("c");
        alphaset.add("d");
        alphaset.add("b");
        alphaset.add("a");

        SortedSet<String> subset = alphaset.subSet("b", "d");

        assertEquals(2, subset.size());

        String[] alphas = new String[subset.size()];
        subset.toArray(alphas);

        assertEquals("b", alphas[0]);
        assertEquals("c", alphas[1]);
    }

    @Test
    public void sortedSetWithComparatorForUser() {
        User bob = new User("Bob", "password"); //11
        User tiny = new User("TinyTim", "hello"); //12
        User rich = new User("Richie", "RichieRich"); //16

        SortedSet<User> userSortedList = new TreeSet<User>(new UserComparator());

        userSortedList.add(bob);
        userSortedList.add(tiny);
        userSortedList.add(rich);

        User[] users = new User[userSortedList.size()];
        userSortedList.toArray(users);

        assertEquals(bob.getUsername(), users[0].getUsername());
        assertEquals(rich.getUsername(), users[2].getUsername());
        assertEquals(tiny.getUsername(), users[1].getUsername());

    }



}
