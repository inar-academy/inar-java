package week_11.assignments.Question_11_02;

import week_10.assignments.Question_10_14.MyDate;

public class Question_11_02 {
    public static void main(String[] args) {
        Person person = new Person("Gurol", "Istanbul",
                "9999999999", "gurol@inar.com");

        Student student = new Student("Nafiz", "Ankara", "333333333",
                "nafiz0@gmail.com", Student.FRESHMAN);

        Employee employee = new Employee("Recai", "İstanbul", "6666666666",
                "recai@gmail.com", 910, 60000, new MyDate());

        Faculty faculty = new Faculty("Serhat", "Texas, Dallas", "4133333333",
                "serhat@inar.com", 101, 50000, new MyDate(), "10am to 6pm", "manager");

        Staff staff = new Staff("Elon ", "California", "2030222220",
                "elon@musk.com", 12, 6005000, new MyDate(), "CEO");

        System.out.println("   _Person_ ");
        System.out.println(person);

        System.out.println("   _Student_ ");
        System.out.println(student);

        System.out.println("   _Employee_ ");
        System.out.println(employee);

        System.out.println(faculty);
        System.out.println(staff);
    }
}
