package com.cydeo;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class InterviewCodingTask03 {

    public static void main(String[] args) {
        //     write a program that finds the highest number of times repeated word in a string.
        String str1 = "This is a sample string, this string contains a sample string. string";
        String[] words = str1.split(" ");
        int maxCount = 0;
        String maxWord = "";

        // Create a HashSet to store unique words and their counts
        HashSet<String> uniqueWords = new HashSet<>();
        HashSet<String> wordCounts = new HashSet<>();

        for (String word : words) {
            // Convert the word to lowercase for case-insensitive comparison
            String lowercaseWord = word.toLowerCase();

            // If the word is not already in the uniqueWords set, add it
            if (!uniqueWords.contains(lowercaseWord)) {
                uniqueWords.add(lowercaseWord);
                wordCounts.add(lowercaseWord + ":" + 1);
            } else {
                // If the word is already in the uniqueWords set, update its count
                for (String wc : wordCounts) {
                    String[] parts = wc.split(":");
                    if (parts[0].equals(lowercaseWord)) {
                        int count = Integer.parseInt(parts[1]);
                        count++;
                        wordCounts.remove(wc);
                        wordCounts.add(lowercaseWord + ":" + count);
                        break;
                    }
                }
            }
        }

        // Find the word with the maximum count
        for (String wc : wordCounts) {
            String[] parts = wc.split(":");
            int count = Integer.parseInt(parts[1]);
            if (count > maxCount) {
                maxCount = count;
                maxWord = parts[0];
            }
        }

// Check if the maxWord is "string"
        if (!maxWord.equalsIgnoreCase("string")) {
            System.out.println("Error: The word with the maximum count is not 'string'.");
        } else {
            System.out.println("The word \"" + maxWord + "\" appears " + maxCount + " times.");
        }

        System.out.println("The word \"" + maxWord + "\" appears " + maxCount + " times.");
    }

}
