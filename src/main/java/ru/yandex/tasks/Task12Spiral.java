package ru.yandex.tasks;

import java.util.Arrays;

public class Task12Spiral {
    public static int[][] draw (int N) {
        /*
         * Отрисовывает "спираль" в двумерном массиве по часовой стрелке
         * -10^3 <= N <= 10^3
         * Выход: массив со спиралью
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int[][] arr = new int[N][N];
        int number = 1;
        int n = N - 1;
        for (int i = n; i > n / 2; i--) {
            int j = n - i;
            for (int k = j; k < i; k++) {
                arr[j][k] = number;
                number++;
            }
            for (int k = j; k < i; k++) {
                arr[k][i] = number;
                number++;
            }
            for (int k = i; k > j; k--) {
                arr[i][k] = number;
                number++;
            }
            for (int k = i; k > j; k--) {
                arr[k][j] = number;
                number++;
            }
        }

        if (N % 2 == 1) {
            arr[n/2][n/2] = number;
        }

        return arr;
    }

    public static void selfCheck() {
        int[][] output = {
                {1, 2, 3, 4, 5, 6, 7},
                {24, 25, 26, 27, 28, 29, 8},
                {23, 40, 41, 42, 43, 30, 9},
                {22, 39, 48, 49, 44, 31, 10},
                {21, 38, 47, 46, 45, 32, 11},
                {20, 37, 36, 35, 34, 33, 12},
                {19, 18, 17, 16, 15, 14, 13}
        };

        assert Arrays.deepEquals(output, draw(7));
    }
}
