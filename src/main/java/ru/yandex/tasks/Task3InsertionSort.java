package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3InsertionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой вставками!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        ArrayList<Integer> sortedNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            boolean wasAdded = false;
            int a = number;
            int j = 0;
            while (!wasAdded && j < sortedNumbers.size()) {
                if (a < sortedNumbers.get(j)) {
                    sortedNumbers.add(j, a);
                    wasAdded = true;
                }
                j++;
            }

            if (!wasAdded) {
                sortedNumbers.add(a);
            }

        }
        return sortedNumbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
