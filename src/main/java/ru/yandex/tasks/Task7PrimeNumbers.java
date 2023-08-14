package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7PrimeNumbers {
    public static int[] findPrimes (int N) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int n = N + 1;
        Integer[] numbers = new Integer[n];
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (numbers[i] == null) {
                primes.add(i);
                numbers[i] = 0;

                int current = i * i;
                while (current < n) {
                    numbers[current] = 0;
                    current += i;
                }
            }
        }

        return primes.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }
}
