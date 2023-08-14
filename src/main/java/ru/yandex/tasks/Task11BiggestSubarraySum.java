package ru.yandex.tasks;

public class Task11BiggestSubarraySum {

    public static Subarray find(int[] numbers) {
        /*
         * Находит подмассив (подряд идущие элементы массива) с наибольшей суммой элементов
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: Subarray
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        int sum = 0, maxSum = numbers[0], l = 0, r;
        Subarray subarray = new Subarray();
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum >= maxSum) {
                r = i;
                maxSum = sum;
                subarray.left = l;
                subarray.right = r + 1;
            }

            if (sum < 0) {
                l = i + 1;
                sum = 0;
            }
        }

        return subarray;
    }

    public static void selfCheck() {
        int[] output = {1, 2, -5, 7, -1, 6};
        Subarray ans = find(output);

        assert ans != null;
        assert (ans.left == 3 && ans.right == 6);
    }
}
