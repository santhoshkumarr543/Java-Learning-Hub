package Day16;

import java.util.*;

public class Nthdigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = sc.nextInt();
        System.out.println("Enter a digit you want");
        int d = sc.nextInt();
        find(n,d);
    }

    public static void find(long n,int d) {
        // TODO: Implement logic here
        int count = 0;
        while(n > 0)
        {
            long rem = n % 10;
            count++;
            if(count == d)
            {
                System.out.println(rem);
                break;
            }
            n /= 10;
        }
    }
}