package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13MergeSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой слиянием!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        if (numbers.size() == 1) {
            return numbers;
        }
        ArrayList<Integer> list1 = sort(new ArrayList<>(numbers.subList(0, numbers.size() / 2)));
        ArrayList<Integer> list2 = sort(new ArrayList<>(numbers.subList(numbers.size() / 2, numbers.size())));

        return merge(list1, list2);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                list.add(list1.get(i));
                i++;
            } else {
                list.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            list.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            list.add(list2.get(j));
            j++;
        }

        return list;
    }
    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
