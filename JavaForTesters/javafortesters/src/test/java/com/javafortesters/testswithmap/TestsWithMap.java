package com.javafortesters.testswithmap;

import com.javafortesters.domainentities.User;
import com.javafortesters.domainentities.UserComparator;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestsWithMap {

    @Test
    public void canAddKeyValuePairsToAMap() {
        Map<String,String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.print(map);

        assertEquals(3, map.size());

        map.put("key1", "newvalue1");

        System.out.print(map);

        assertEquals("newvalue1", map.get("key1"));

        map.remove("key1");

        System.out.print(map);

        assertEquals(2, map.size());

        map.clear();

        System.out.print(map);

        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void canCheckContentsOfMap() {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        assertTrue(map.containsKey("key1"));
        assertFalse(map.containsKey("key23"));

        assertTrue(map.containsValue("value2"));
        assertFalse(map.containsValue("valuelnoi45"));

        System.out.print(map);
    }

    @Test
    public void canAddAMapToAMap() {

        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.print(map);

        Map<String, String> mapToAdd = new HashMap<>();

        mapToAdd.put("key1", "keyvalue1");
        mapToAdd.put("key4", "value4");

        System.out.print(mapToAdd);

        map.putAll(mapToAdd);

        System.out.print(map);

        Collection<String> values = map.values();

        System.out.print(values);

        Set<String> keys = map.keySet();

        System.out.print(keys);
    }

   @Test
    public void canAccessValuesInAMapInKeyOrder() {
       Map<String, String> map = new HashMap<>();

       map.put("key1", "value1");
       map.put("key2", "value2");
       map.put("key3", "value3");

       Set<String> keys = map.keySet();

       SortedSet<String> listOfKeys = new <String>TreeSet(keys);

       String[] arrayOfListOfKeys = new String[listOfKeys.size()];
       listOfKeys.toArray(arrayOfListOfKeys);


       for(int i = 0; i < arrayOfListOfKeys.length; i ++) {
           System.out.print(arrayOfListOfKeys[i] + ", ");
       }


   }

    @Test
    public void canIterateThroughEntriesInAMap() {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(Map.Entry<String, String> entry : entries) {
            entry.setValue("bob");
        }

        System.out.print(entries);
    }

    @Test
    public void canCreateSortedMap() {
        SortedMap<String, String> map = new TreeMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");

        assertEquals("key1", map.firstKey());
        assertEquals("key5", map.lastKey());

        SortedMap<String, String> headMap;
        headMap = map.headMap("key3");

        assertEquals(2, headMap.size());
        assertTrue(headMap.containsKey("key1"));
        assertTrue(headMap.containsKey("key2"));

        SortedMap<String, String> tailMap;
        tailMap = map.tailMap("key3");

        assertEquals(3, tailMap.size());
        assertTrue(tailMap.containsKey("key3"));
        assertTrue(tailMap.containsKey("key4"));
        assertTrue(tailMap.containsKey("key5"));

        System.out.print(tailMap);

        SortedMap<String, String> subMap;
        subMap = map.subMap("key2", "key4");

        assertEquals(2, subMap.size());
        assertTrue(subMap.containsKey("key2"));
        assertTrue(subMap.containsKey("key3"));

        System.out.print(subMap);

    }

    @Test
    public void canUseComparatorForSortedMap() {

        User bob = new User("bob", "password");
        User tim = new User("tim", "hello");
        User jessica = new User("jessica", "world");
        User anne = new User("anne", "foobar");

        SortedMap<User, String> userSortedMap = new TreeMap<User, String>(new UserComparator());

        userSortedMap.put(bob, "Bob rules");
        userSortedMap.put(tim, "Tim rules");
        userSortedMap.put(jessica, "Jessica rules");
        userSortedMap.put(anne, "Anne rules");

        User[] users = new User[userSortedMap.size()];
        userSortedMap.keySet().toArray(users);

        assertEquals(tim.getUsername(), users[0].getUsername());

    }

}
