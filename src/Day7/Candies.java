package Day7;

import java.util.Scanner;

public class Candies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        find(n);
    }

    public static void find(int n) {
        // TODO: Implement logic here
        if(n > 10 || n == 0) System.out.println("invalid");
        if((10 - n) >= 5) {
            System.out.println("number of candies available :" + (10 - n));
            System.out.println("number of candies sold :" + n);
        }
    }
}