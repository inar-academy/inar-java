package week_07.assignments;

import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int first = input.nextInt();

        int[] numbers = new int[first];

        for (int i = 0; i < first; i++) {
            numbers[i] = input.nextInt();
        }
        if (isSorted(numbers)) {
            System.out.println("The list is already sorted");

        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        int[] array = new int[list.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = list[i];
        }
        int temp;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] != array[i]) {
                return false;
            }
        }
        return true;
    }
}
