package week_10.assignments.Question_10_06;

import week_10.assignments.utils.StackOfIntegers;

import java.util.Scanner;

public class Question_10_06 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        int number = 2;
        while (number <= 120) {
            if (isPrime(number)) {
                stack.push(number);
            }
            number++;
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}

