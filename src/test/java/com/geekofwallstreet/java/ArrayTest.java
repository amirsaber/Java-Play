package com.geekofwallstreet.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void isUniqueTest() {
        Boolean result = Array.isUnique("asd");
        assertEquals(true, result);

        result = Array.isUnique("aad");
        assertEquals(false, result);

        result = Array.isUnique("");
        assertEquals(true, result);

        result = Array.isUnique("ada");
        assertEquals(false, result);

        result = Array.isUnique("asds");
        assertEquals(false, result);

        result = Array.isUnique("asdfghjerwq");
        assertEquals(true, result);
    }

    @Test
    public void checkPermutationTest() {
        Boolean result = Array.checkPermutation("God", "dog");
        assertEquals(false, result);

        result = Array.checkPermutation("God", "doG");
        assertEquals(true, result);

        result = Array.checkPermutation("God   ", "doG");
        assertEquals(false, result);

        result = Array.checkPermutation("banana", "ananaB");
        assertEquals(false, result);

        result = Array.checkPermutation("banana", "ananab");
        assertEquals(true, result);

        result = Array.checkPermutation("banana", "anaban");
        assertEquals(true, result);

        result = Array.checkPermutation("Banana", "anaban");
        assertEquals(false, result);

        result = Array.checkPermutation("", "");
        assertEquals(true, result);

        result = Array.checkPermutation("", " ");
        assertEquals(false, result);

        result = Array.checkPermutation("God   ", " d o G");
        assertEquals(true, result);
    }

    @Test
    public void urlifyTest() {
        String result = Array.urlify("Hello World!");
        assertEquals("Hello%20World!", result);

        result = Array.urlify("Hello World !");
        assertEquals("Hello%20World%20!", result);

        result = Array.urlify(" Hello World !");
        assertEquals("%20Hello%20World%20!", result);

        result = Array.urlify("");
        assertEquals("", result);

        result = Array.urlify(" ");
        assertEquals("%20", result);

    }
}