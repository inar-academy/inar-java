package week_07.assignments;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        reverse(numbers);
        printReverse(numbers);
    }

    public static void reverse(int[] numbers) {
        int temp;
        for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }

    public static void printReverse(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
