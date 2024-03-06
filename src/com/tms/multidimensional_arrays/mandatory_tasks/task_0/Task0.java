package com.tms.multidimensional_arrays.mandatory_tasks.task_0;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Create a 3D array of integers.
 * With the help of loops "pass" through the entire array and increase each element by a given number.
 * Let the number by which each element will be incremented be specified from the console.
 */

public class Task0 {

    public static void main(String[] args) {
        int[][][] array = {{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
                           {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
                           {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number by which you want to increment each element of the array: ");
        int num = sc.nextInt();
        sc.close();

        for (int[][] array2D : array)
            for (int[] array1D : array2D)
                for (int i = 0; i < array1D.length; ++i)
                    array1D[i] += num;

        System.out.println("Final array:\n" + Arrays.deepToString(array));
    }

}