package com.tms.multidimensional_arrays.mandatory_tasks.task_1;

/**
 * Chessboard
 * Task:
 *
 * Write a program to tell a chessboard using a loop.
 * Create a two-dimensional array of 8x8 Strings.
 * With the help of cycles, set the values of B(Black) or W(White) to the elements of the cycle.
 * The result of the program:
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 */

public class Task1 {

    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}