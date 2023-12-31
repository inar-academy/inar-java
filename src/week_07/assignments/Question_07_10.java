package week_07.assignments;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 Numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("The Index Of Smallest Element: " + indexOfSmallestElement(array));
    }

    public static int indexOfSmallestElement(double[] array) {
        if (array.length <= 1) {
            return 0;
        }

        double min = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;

    }
}
