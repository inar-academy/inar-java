package week_13.assignments.Question_13_07;

import week_13.assignments.Question_13_05.GeometricObject;

public class Question_13_07 {
    public static void main(String[] args) {
        GeometricObject[] squares = {new Square("black", true, 16),
                                     new Square("yellow", false, 20),
                                     new Square("blue", true, 10),
                                     new Square("black", false, 13),
                                     new Square("gold", true, 12)};

        for (int i = 0; i < squares.length; i++) {
            System.out.println("\nSquare " + (i + 1));
            System.out.println(squares[i]);
            ((Square) squares[i]).howToColor();
        }
    }

}
