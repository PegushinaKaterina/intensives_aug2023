package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой выбором!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        boolean wasChange = true;
        int i = 0;
        while (wasChange && i < numbers.size()) {
            wasChange = false;

            int min = numbers.get(i);
            int index = i;

            for (int j = i + 1; j < numbers.size(); j++) {
                int a = numbers.get(j);
                if (a < min) {
                    min = a;
                    index = j;
                    wasChange = true;
                }
            }

            int b = numbers.get(i);
            numbers.set(i, min);
            numbers.set(index, b);

            i++;
        }
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
