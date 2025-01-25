package Day21;

import java.util.Scanner;

class Customer {
    String name, city, gender;
    int age;
    double billAmount;

    Customer(String name, String city, int age, String gender, double billAmount) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.gender = gender;
        this.billAmount = billAmount;
    }

    void displayDetails() {
        System.out.println(name);
        System.out.println(city);
        System.out.println(age);
        System.out.println(gender);
        System.out.println((int) billAmount);
    }

    double calculateDiscount() {
        if (billAmount >= 1000 && billAmount <= 5000) return 50;
        else if (billAmount > 5000 && billAmount <= 10000) return 100;
        else if (billAmount > 10000) return 200;
        return 0;
    }
}

class PremiumCustomer extends Customer {
    double subscriptionAmount;

    PremiumCustomer(String name, String city, int age, String gender, double billAmount, double subscriptionAmount) {
        super(name, city, age, gender, billAmount);
        this.subscriptionAmount = subscriptionAmount;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println((int) subscriptionAmount);
        System.out.println((int) calculateDiscount());
    }

    @Override
    double calculateDiscount() {
        if (billAmount >= 1000 && billAmount <= 5000) return 100;
        else if (billAmount > 5000 && billAmount <= 10000) return 200;
        else if (billAmount > 10000) return 400;
        return 0;
    }
}

public class Pgm12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String city = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String gender = sc.nextLine();
        double billAmount = sc.nextDouble();
        int type = sc.nextInt();

        if (type == 1) {
            double subscriptionAmount = sc.nextDouble();
            PremiumCustomer pc = new PremiumCustomer(name, city, age, gender, billAmount, subscriptionAmount);
            pc.displayDetails();
        } else {
            Customer bc = new Customer(name, city, age, gender, billAmount);
            bc.displayDetails();
            System.out.println((int) bc.calculateDiscount());
        }
    }
}

