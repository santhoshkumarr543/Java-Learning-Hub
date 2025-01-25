package Day22;

import java.util.Scanner;

public class Pgm17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        System.out.print("Enter first float: ");
        float num3 = sc.nextFloat();

        System.out.print("Enter second float: ");
        float num4 = sc.nextFloat();

        System.out.println("Square of " + num1 + ": " + calculate(num1));
        System.out.println("Modulus of " + num1 + ", " + num2 + ": " + calculate(num1, num2));
        System.out.println("Quotient of " + num3 + ", " + num4 + ": " + calculate(num3, num4));
    }

    public static int calculate(int num) {
        return num * num;
    }

    public static int calculate(int num1, int num2) {
        return num1 % num2;
    }

    public static float calculate(float num1, float num2) {
        return num1 / num2;
    }
}

