package com.tms.multidimensional_arrays.additional_tasks.task_2;

import java.util.Arrays;

/**
 * Task:
 *
 * Matrix multiplication: Create two integer arrays of size 3x3 (two matrices).
 * Write a program to multiply these two matrices.
 * First array: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Second array: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Expected output:
 * 1 2 3
 * 1 1 1
 * 0 0 0
 */

public class Task2 {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] sumArr = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; ++i) {
            for (int j = 0; j < arr2[0].length; ++j) {
                for (int k = 0; k < arr1[0].length; ++k) {
                    sumArr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Multiplied array:\n" + Arrays.deepToString(sumArr));
    }

}
