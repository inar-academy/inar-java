package week_10.assignments.Question_10_09;

public class Question_10_09 {
    public static void main(String[] args) {
        Course inar = new Course("Java-Inar Academy");
        inar.addStudent("Özgür Kartal");
        inar.addStudent("Bilal Topal");
        inar.addStudent("Ada Kaya");
        inar.addStudent("Besim Karabıyık");
        inar.addStudent("Emir Uyanık");
        displayStudents(inar.getStudents(), inar.getNumberOfStudents());

        inar.dropStudent("Bilal Topal");
        inar.dropStudent("Emir Uyanık");

        displayStudents(inar.getStudents(), inar.getNumberOfStudents());
    }

    public static void displayStudents(String[] students, int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
        System.out.println("--------------------");
        System.out.println();
    }
}
