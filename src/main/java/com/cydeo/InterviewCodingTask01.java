package com.cydeo;

public class InterviewCodingTask01 {
    public static void main(String[] args) {
        // test the custom method calculateAbsoluteDifference with an array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };

        System.out.println("The absolute difference is: " + calculateAbsoluteDifference(matrix)); // should print: 2



    }




    /**
     Given a square matrix, create a method that can calculate the absolute difference between the sums of its diagonals.

     For example, the square matrix is shown below:
     1 2 3
     4 5 6
     9 8 9

     Output:
     The absolute difference is: 2
     write all codes in the method
     */
    public static int calculateAbsoluteDifference(int[][] matrix) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[i][matrix.length - 1 - i];
        }

        return Math.abs(sum1 - sum2);
    }


}
