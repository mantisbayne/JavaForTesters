package com.javafortesters.domainobjects.environment;



public class TestAppEnv {

    public static final String PORT = "67";
    public static final String DOMAIN = "192.123.0.3";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }

/*    public String getDomainName {
        *//*@TODO create a method that resolves the DNS of an IP address*//*
    }

    public String addHttp(String url) {
        *//* @TODO create a method that concatenates 'http' with the url *//*
        public String url =
    }*/

    public static String domainName = "www.seleniumsimplified.com";
    public static String addHttp(String url) {
        return "http://" + url;
    }
}
