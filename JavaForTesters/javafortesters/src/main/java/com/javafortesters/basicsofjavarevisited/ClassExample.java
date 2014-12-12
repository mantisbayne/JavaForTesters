package com.javafortesters.basicsofjavarevisited;

public class ClassExample {
    public static final String CONSTANT = "a constant string";
    public static String aClassField = "a class field";
    protected static String proField = "a class field";
    public String pubField = "a public field";
    public String privField = "a private field";
    private String name;

    ClassExample instance = new ClassExample("bob");

    public ClassExample(String name) {
        this.name = name;
    }

    public ClassExample() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

