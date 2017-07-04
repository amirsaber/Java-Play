package com.geekofwallstreet.java;

import java.util.Hashtable;

public class Array {
    public static Boolean isUnique(String word) {
        Hashtable<Character, Boolean> charactersHash = new Hashtable<Character, Boolean>();
        for (char character : word.toCharArray()) {
            if (charactersHash.get(character) == null) {
                charactersHash.put(character, true);
            } else {
                return false;
            }
        }
        return true;
    }

    public static Boolean checkPermutation(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        Hashtable<Character, Integer> characterCount = new Hashtable<Character, Integer>();
        for (char character : firstWord.toCharArray()) {
            Integer count = characterCount.get(character);
            if (count == null) {
                characterCount.put(character, 1);
            } else {
                characterCount.put(character, count + 1);
            }
        }
        for (char character : secondWord.toCharArray()) {
            Integer count = characterCount.get(character);
            if (count == null) {
                return false;
            } else {
                characterCount.put(character, count - 1);
            }
        }
        for (Integer count : characterCount.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static String urlify(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : address.toCharArray()) {
            if (character == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}