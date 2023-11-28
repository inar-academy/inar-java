package week_11.assignments.Question_11_02;

import week_10.assignments.Question_10_14.MyDate;

public class Staff extends Employee {
    private String title;


    public Staff(String name, String address, String phoneNumber, String emailAddress, int office, double salary, MyDate hiredDate, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, hiredDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "   _Staff_  \n" + super.toString() +
                "\ntitle: '" + title + '\'';
    }
}
