package Day22;

import java.util.Scanner;

class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double basicSalary, double bonus) {
        super(name, basicSalary);
        this.bonus = bonus;
    }

    double calculatesalary() {
        return basicSalary + bonus;
    }
}

class Engineer extends Employee {
    double overtimePay;

    Engineer(String name, double basicSalary, double overtimePay) {
        super(name, basicSalary);
        this.overtimePay = overtimePay;
    }
    double calculatesalary() {
        return basicSalary + overtimePay;
    }
}

public class Pgm16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager name: ");
        String managername = sc.nextLine();

        System.out.print("Enter Manager basic salary: ");
        double managerbs = sc.nextDouble();

        System.out.print("Enter Manager bonus: ");
        double managerbonus = sc.nextDouble();

        System.out.print("Enter Engineer name: ");
        String engineerName = sc.nextLine();

        System.out.print("Enter Engineer basic salary: ");
        double engineerbs = sc.nextDouble();

        System.out.print("Enter Engineer overtime pay: ");
        double engineerop = sc.nextDouble();

        Manager m = new Manager(managername, managerbs, managerbonus);
        Engineer e = new Engineer(engineerName, engineerbs, engineerop);

        System.out.printf("Manager Salary: %.2f\n", m.calculatesalary());
        System.out.printf("Engineer Salary: %.2f\n", e.calculatesalary());
    }
}
