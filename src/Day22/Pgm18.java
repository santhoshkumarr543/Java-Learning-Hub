package Day22;

import java.util.Scanner;

class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void action() {
        System.out.println("The " + name + " is performing an action.");
    }
}

class Lion extends Animal {
    Lion(String name, int age) {
        super(name, age);
    }
    void action() {
        System.out.println("The " + getName() + " is roaring.");
    }
}

class Tiger extends Animal {
    Tiger(String name, int age) {
        super(name, age);
    }
    void action() {
        System.out.println("The " + getName() + " is swimming.");
    }
}

class Bear extends Animal {
    Bear(String name, int age) {
        super(name, age);
    }
    void action() {
        System.out.println("The " + getName() + " is climbing a tree.");
    }
}

public class Pgm18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of Lion: ");
        String lionname = sc.nextLine();

        System.out.print("Enter age of Lion: ");
        int lionage = sc.nextInt();

        System.out.print("Enter name of Tiger: ");
        String tigername = sc.nextLine();

        System.out.print("Enter age of Tiger: ");
        int tigerage = sc.nextInt();

        System.out.print("Enter name of Bear: ");
        String bearname = sc.nextLine();

        System.out.print("Enter age of Bear: ");
        int bearage = sc.nextInt();

        Animal lion = new Lion(lionname, lionage);
        Animal tiger = new Tiger(tigername, tigerage);
        Animal bear = new Bear(bearname, bearage);

        lion.action();
        tiger.action();
        bear.action();

        System.out.println("Program finished.");
    }
}

