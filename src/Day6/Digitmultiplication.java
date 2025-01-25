package Day6;

import java.util.Scanner;

public class Digitmultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        find(n);
    }

    public static void find(int n) {
        // TODO: Implement logic here
        int temp = n;
        int ans = 1;
        while(temp > 0)
        {
            int digit = temp % 10;
            ans *= digit;
            temp = temp / 10;
        }
        System.out.println(ans);
    }
}