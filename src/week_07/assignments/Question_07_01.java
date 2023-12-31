package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.print("Enter 4 scores:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();

        }
        int best = getBest(n, array);
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + i + " score is " + array[i] + " and grade is " + grade(array[i], best));
        }
    }

    public static int getBest(int n, int[] array) {
        int best = array[0];
        for (int i = 1; i < n; i++) {

            if (array[i] > best) {
                best = array[i];
            }
        }
        return best;
    }

    public static String grade(int array, int best) {

        if (array >= best - 10) {
            return "A";
        } else if (array >= best - 20) {
            return "B";
        } else if (array >= best - 30) {
            return "C";
        } else if (array >= best - 40) {
            return "D";
        } else {
            return "F";
        }

    }
}