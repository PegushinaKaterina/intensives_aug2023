package ru.yandex.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
        char[] sequenceCharArray = sequence.toCharArray();

        for (char current : sequenceCharArray) {
            if (!map.containsKey(current)) {
                stack.push(current);
            } else if (stack.empty() || stack.pop() != map.get(current)) {
                return false;
            }
        }

        return stack.empty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
