package com.ch3;

public class Matrix {
    public static void main(String[] args) {
        double[][] m = {
                {0, 0, 0, 0},
                {0, 1, 2, 3},
                {0, 2, 2 * 2, 3 * 2},
                {0, 3, 2 * 3, 3 * 3}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
