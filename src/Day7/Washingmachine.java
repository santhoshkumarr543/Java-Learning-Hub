package Day7;

import java.util.Scanner;

public class Washingmachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a weight");
        int n = sc.nextInt();
        find(n);
    }

    public static void find(int n) {
        // TODO: Implement logic here
        if(n <= 2000) System.out.println("Time is 25 mins");
        else if(n >= 2001 && n <= 4000) System.out.println("Time is 35 mins");
        else if(n > 4000 && n < 7000) System.out.println("Time is 45 mins");
        else if(n == 7000)System.out.println("OVERLOAD");
        else System.out.println("INVALID INPUT");
    }
}