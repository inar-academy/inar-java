package week_08.assignments;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numOfPoints = input.nextInt();


        double[][] points = new double[numOfPoints][2];
        System.out.print("Enter " + numOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1],
                                           points[p2][0], points[p2][1]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                                           points[j][0], points[j][1]);

                if (distance < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance; //  I updated shortestDistance
                }
            }
        }
        displayTheClosestPoints(points, shortestDistance);
    }


    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static void displayTheClosestPoints(double[][] points, double shortestDistance) {
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (distance(points[i][0], points[i][1], points[j][0], points[j][1]) == shortestDistance) {

                    System.out.println("The closest two points are " +
                            "(" + points[i][0] + ", " + points[i][1] + ") and (" +
                                  points[j][0] + ", " + points[j][1] + ")");
                }
            }
        }
        System.out.println("Their distance is " + shortestDistance);
    }
}
