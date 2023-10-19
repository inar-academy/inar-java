package week_07.assignments;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("[" + nums[i] + "," + nums[j] + "]" + " ");
                count++;
            }
            System.out.println();

        }
        System.out.println("Total combination: " + count);
    }
}
