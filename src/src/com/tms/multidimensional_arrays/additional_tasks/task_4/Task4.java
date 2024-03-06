package com.tms.multidimensional_arrays.additional_tasks.task_4;

import java.util.Arrays;

/**
 * Task:
 *
 * Create a two-dimensional array. Print the diagonals of the array to the console.
 */

public class Task4 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Main diagonal:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        System.out.println("Secondary diagonal:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - 1 - i] + " ");
        }
    }

}