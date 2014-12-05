package com.javafortesters.myfirstconditional;

import com.javafortesters.domainobjects.environment.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyFirstConditional {

    @Test
    public void ifElseNestedAddHttp(){
        String url = "seleniumsimplified.com";
        if(url.startsWith("http")){
        // do nothing the url is fine
        }else{
            if(!url.startsWith("www")){
                url = "www." + url;
            }
            url = TestAppEnv.addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void switchExample() {
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("madam"));
        assertEquals("F", likelyGenderIs("lady"));
    }

    public String likelyGenderIs(String title) {
        String likelyGender;

        switch(title.toLowerCase()) {
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }



}
