package Day21;

import java.util.Scanner;

class Person {
    String name;
    Person(String name) { this.name = name; }
    void display() { System.out.println("Name : " + name); }
}

class Staff extends Person {
    int id;
    Staff(String name, int id) {
        super(name);
        this.id = id;
    }
    void display() {
        super.display();
        System.out.println("Staff Id : " + id);
    }
}

class TemporaryStaff extends Staff {
    int days, hours;
    TemporaryStaff(String name, int id, int days, int hours) {
        super(name, id);
        this.days = days;
        this.hours = hours;
    }
    int calculateSalary() { return days * hours * 50; }
    void display() {
        super.display();
        System.out.println("No. of Days : " + days);
        System.out.println("No. of Hours Worked : " + hours);
        System.out.println("Total Salary : " + calculateSalary());
    }
}

public class Pgm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        int days = sc.nextInt();
        int hours = sc.nextInt();
        TemporaryStaff ts = new TemporaryStaff(name, id, days, hours);
        ts.display();
    }
}
