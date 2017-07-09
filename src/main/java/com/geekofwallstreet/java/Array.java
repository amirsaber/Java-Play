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

    public static Boolean palindromePermutation(String charactersString) {
        Hashtable<Character, Integer> characterHash = new Hashtable<Character, Integer>();
        char[] characters = charactersString.toCharArray();
        Integer length = characters.length;
        Boolean isPalindrome = true;
        Integer oddCount = 0;

        for (char c : characters) {
            Integer count = characterHash.get(c);
            if (count == null) {
                characterHash.put(c, 1);
                oddCount++;
            } else {
                count++;
                characterHash.put(c, count);
                if (count % 2 == 0) {
                    oddCount--;
                } else {
                    oddCount++;
                }
            }
            if (length % 2 == 0 && oddCount == 0) {
                isPalindrome = true;
            } else if (oddCount == 1) {
                isPalindrome = true;
            } else{
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}