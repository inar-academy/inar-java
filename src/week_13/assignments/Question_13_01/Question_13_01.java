package week_13.assignments.Question_13_01;

import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle :");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter the color :");
        String color = input.next();
        System.out.println("Enter : isFilled ? true or false : ");
        boolean isFilled = input.nextBoolean();
        Triangle triangle = new Triangle(color , isFilled,side1, side2,side3);
        System.out.println(triangle.toString());
    }
}
