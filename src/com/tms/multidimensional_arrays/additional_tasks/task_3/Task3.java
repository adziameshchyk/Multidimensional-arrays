package com.tms.multidimensional_arrays.additional_tasks.task_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Create a two-dimensional array of integers. Output the sum of all elements of the array to the console.
 */

public class Task3 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Array created:\n" + Arrays.deepToString(array) + "\nSum of array elements: " + sum + ".");
    }

}
