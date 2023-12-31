package week_13.assignments.Question_13_13;

public class Question_13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course c1 = new Course("Inar Academy");
        System.out.println("Course Name:\"Inar Academy\"");
        c1.addStudents("Burak");
        c1.addStudents("Emre");
        c1.addStudents("Furkan");
        c1.addStudents("Jack");

        Course c2 = c1.clone();
        c2.addStudents("Jonny");
        c2.addStudents("Tonny");

        System.out.println("\nNumber of students in course1: " + c1.getNumberOfStudents());
        String[] students = c1.getStudents();
        for (int i = 0; i < c1.getNumberOfStudents(); i++){
            System.out.print(students[i] + ", ");
        }

        System.out.println("\n--------------------------");

        System.out.println("Number of students in course2: " + c2.getNumberOfStudents());
        String[] students2 = c2.getStudents();
        for (int i = 0; i < c2.getNumberOfStudents(); i++){
            System.out.print(students2[i] + ", ");
        }
    }
}
