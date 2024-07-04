package com.cydeo;

public class AI_CodeGeneration {
    public static void main(String[] args) {
        // create an array of string named students with 10 random student names in it
        String[] students = {"John", "Jane", "Mike", "Sarah", "Emily", "Michael", "David", "Olivia", "Daniel", "Sophia"};

        // Iterate the array with for each loop and access each element of the array
        for (String student : students) {
            System.out.println(student);
        }

        // Reverse each student name and print it
        for (String student : students) {
            String reversedStudentName = reverseString(student);
            System.out.println(reversedStudentName);
        }
        
    }

    // Create a function that can reverse as String by using for loops and return it 
    public static String reverseString(String str) {
        String reversedString = "";
        for (int i = 0; i < str.length(); i++) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }
    
}
