package com.tms.multidimensional_arrays.additional_tasks.task_5;

import java.util.Arrays;

/**
 * Task:
 *
 * Create a two-dimensional array of integers. Sort the elements in the rows of a two-dimensional array in ascending order.
 */

public class Task5 {

    public static void main(String[] args) {
        int[][] array = {{3, 1, 7, 10}, {4, 1, 5, 73}, {6, 13, 4, 17}};

        for (int[] row : array) {
            Arrays.sort(row);
        }

        System.out.println("Array with sorted rows:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

}
