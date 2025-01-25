package Day19;

import java.util.*;

class prof {
    int id;
    String name;
    String dept;
    int age;
    int salary;

    prof(int id, String name, String dept, int age, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.salary = salary;
    }
}

public class Pgm8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of employees:");
        int n = sc.nextInt();
        prof[] p = new prof[n];
        System.out.println("Enter the employee details:");

        for (int i = 0; i < n; i++) {
            p[i] = new prof(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
        }

        int big = 0;
        int id = 0, age = 0, salary = 0;
        String name = "", dept = "";

        for (int i = 0; i < n; i++) {
            if (p[i].salary > big) {
                big = p[i].salary;
                id = p[i].id;
                age = p[i].age;
                salary = p[i].salary;
                name = p[i].name;
                dept = p[i].dept;
            }
        }

        System.out.println(id);
        System.out.println(name);
        System.out.println(dept);
        System.out.println(age);
        System.out.println(salary);

        sc.close();
    }
}
