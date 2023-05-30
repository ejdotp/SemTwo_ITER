package Q10.sports.Student;

import java.util.Scanner;

public class student {
    public String name;
    public String roll;

    public student(String name, String roll) {
        this.name = name;
        this.roll = roll;
    }

    public void input() {
    	 Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        this.name = sc.nextLine();
        System.out.print("Enter student roll number: ");
        this.roll = sc.nextLine();
    }

    public void output() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
    }
}












































































































































































