package com.example.lab20;

public class WordCounter {
    public static int getCharsCount(String phrase)
    {
        String withoutSpaces = phrase.replaceAll(" ","");
       return withoutSpaces.length();
    }
    public static int getWordsCount(String phrase) {
        // Split the input string into words using spaces, commas, and dots as delimiters
        String[] words = phrase.split("[\\s,\\.]");

        // Initialize a count for words
        int count = 0;

        // Loop through the array and count non-empty words
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}
