package com.javafortesters.stringtests;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StringTests {

    @Test
    public void canUseAStringLiteral() {
        String aString = "abcdef";

        assertThat(aString.length(), is(6));

        String bString = "abcdefghi";

        assertEquals(bString, aString + bString.substring(6, 9));
    }

    @Test
    public void canUseSpecialCharacterEncoding() {
        System.out.println("email \t address");
        System.out.println("email \b address");
        System.out.println("email \n address");
        System.out.println("email \r address");
        System.out.println("email \'address\'");
        System.out.println("email \"address\"");
        System.out.println("email \\ address");
    }

    @Test
    public void canConcatenateAString() {
        String str1 = "konichiwa";
        String str2 = ", watashi wa Meredith des";
        String str3 = ", hajimimashte";

        String japaneseGreeting = str1.concat(str2.concat(str3));

        System.out.print(japaneseGreeting.toUpperCase());
    }

    @Test
    public void canConvertToFromString() {
        String intConcat = "" + 55763;
        assertThat(intConcat, is("55763"));

        String integerString = Integer.toString(7777);
        assertThat(integerString, is("7777"));

        String valueOfString = String.valueOf(6777);
        assertThat(valueOfString, is("6777"));
        assertThat(Integer.valueOf("6777"), is(6777));

        char[] cArray = {'2', '3'};
        assertThat("23".toCharArray(), is(cArray));

        byte[] bArray = "hello world".getBytes();
        assertThat(bArray.length, is(11));
    }

    @Test
    public void canConstructAString() {
        String stringConstructor = new String("hello");
        assertThat(stringConstructor.substring(1, 2), is("e"));

        char[] charArray = {'a', 'b', '\\'};

        assertThat(new String(charArray), is("ab\\"));

        String str = "hello";

        byte[] byteArray = str.getBytes();

        System.out.print(byteArray[0]);

        assertThat(new String(byteArray), is("hello"));

    }

    @Test
    public void canCompareTo() {
        String str = "foo";
        String str1 = "bar";

        assertThat(str.compareTo("foo"), is(0));

        assertThat(str.compareTo("foo") == 0, is(true));

        assertThat((str + str1).compareTo("Foo") > 0, is(true));

        assertThat((str + str1.substring(0, 1)).compareTo("foob") == 0, is(true));

        assertThat(str.compareToIgnoreCase("FOo"), is(0));

        assertThat(str.contains("F"), is(false));

        assertThat(str.contains("z"), is(false));
    }

    @Test
    public void canUseEquals() {
        String helloWorld = new String("hello world");

        assertThat(helloWorld.contentEquals("hello world"), is(true));
        assertThat(helloWorld.contentEquals("Z"), is(false));

        String newString = helloWorld.concat(" it's Me!");

        assertThat(newString.equalsIgnoreCase("hello world it's me!"), is(true));

    }

    @Test
    public void canUseEndsAndStartsWith() {
        String hello = "hello";

        assertThat(hello.endsWith("lo"), is(true));
        assertThat(hello.startsWith("hello"), is(true));
        assertThat(hello.endsWith(""), is(true));

        String empty = "";

        assertThat(empty.isEmpty(), is(true));
    }

    @Test
    public void canUseRegionMatches() {
        String greeting = "hello fella";

        greeting.regionMatches(true, 3, "fez", 0, 2);
    }

    @Test
    public void canUseIndexOf() {
        String hello = "hello fella";

        assertThat(hello.indexOf("l"), is(2));
        assertThat(hello.lastIndexOf("l"), is(9));
    }

/*  @TODO make this work

 @Test
    public void canReturnListFromAString() {
        private List<Integer> findAllOccurances(String string, String substring) {

        }
    }*/

    @Test
    public void canUseRegularExpressions() {
        String mustHaveADigit = ".*[0123456789]+.*";
        assertThat("you1123".matches(mustHaveADigit), is(true));
        assertThat("invalid".matches(mustHaveADigit), is(false));

        String mustIncludeUpperCase = ".*[A-Z]+.*";
        assertThat("Missy".matches(mustIncludeUpperCase), is(true));
        assertThat("12huN".matches(mustIncludeUpperCase), is(true));
    }

    @Test
    public void canReplaceStrings() {
        String hello = "hello!!";
        assertThat(hello.replace("!!", "!!!!!"), is("hello!!!!!"));

        assertThat(hello.replaceFirst("!", "?"), is("hello?!"));
    }

    @Test
    public void canTrimStrings() {
        String padded = "   b      ";
        assertThat(padded.length(), is(10));

        String trim = padded.trim();

        assertThat(trim.length(), is(1));
        assertThat(trim, is("b"));
    }

    @Test
    public void canUseFormat() {
        String str = "Please enter your %s";
        String value = "name, email, and DOB";

        String formatted = String.format(str, value);

        assertThat(formatted, is("Please enter your name, email, and DOB"));
    }

    @Test
    public void canUseStringBuilder() {
        StringBuilder str = new StringBuilder();

        str.append("Hello").replace(0,1, "h").delete(3,4);

        assertThat(str.toString(), is("helo"));

        StringBuilder builder = new StringBuilder(677);
        assertThat(builder.capacity(), is(677));
        assertThat(builder.toString().length(), is(0));

        builder.ensureCapacity(600);

        builder.append("hello");

        builder.trimToSize();

        System.out.println(builder.capacity());

        char[] charArray = {'a', 'b', '!', '\\'};

        builder.append(charArray);

        assertThat(builder.toString().length() ,is(9));

        StringBuilder insert = new StringBuilder("123890");
        insert.insert(3, "4567");
        assertThat(insert.toString(), is("1234567890"));

    }


}
