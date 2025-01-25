package Day22;


import java.util.Scanner;

class Vehicle {
    void move(String str) {
        System.out.println(str);
    }
}

class Motorbike extends Vehicle {
    void move1(String str) {
        System.out.println(str);
    }
}

public class Pgm12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v = new Vehicle();
        Motorbike m = new Motorbike();

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        v.move(str2);
        m.move1(str1);
    }
}
