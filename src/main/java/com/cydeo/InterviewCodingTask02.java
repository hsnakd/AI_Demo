package com.cydeo;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class InterviewCodingTask02 {

    public static void main(String[] args) {
        // test the custom method countDistinctSubstrings
        String str = "gfg";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (substring.length() == new HashSet<>(substring.chars().boxed().collect(Collectors.toList())).size()) {
                    count++;
                }
            }
        }

        System.out.println("Number of substrings having all distinct characters: " + count);


        //     write a program that finds the  highest number of times repeated word in a string.
        String str1 = "This is a sample string, this string contains a sample string.";
        String[] words = str1.split(" ");
        int maxCount = 0;
        String maxWord = "";

        for (String word : words) {
            int count1 = 0;
            for (String w : words) {
                if (word.equalsIgnoreCase(w)) {
                    count1++;
                }
            }
            if (count1 > maxCount) {
                maxCount = count1;
                maxWord = word;
            }
        }

        System.out.println("The word \"" + maxWord + "\" appears " + maxCount + " times.");
    }

    /**
     Create a function that can Count of substrings having all distinct characters
     Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct) that consists of distinct characters only.
     Examples:
     Input: Str = “gffg”
     Output: 6
     Explanation:
     All possible substrings from the given string are,
     ( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
     Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.

     Input: str = “gfg”
     Output: 5
     Explanation:
     All possible substrings from the given string are,
     ( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
     Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only.
     */
    public static int countDistinctSubstrings(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (substring.length() == new HashSet<>((Collection) substring.chars()).size()) {
                    count++;
                }
            }
        }

        return count;
    }


}
