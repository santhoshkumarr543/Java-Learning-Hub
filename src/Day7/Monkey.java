package Day7;

import java.util.Scanner;

public class Monkey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a total no of monkeys");
        int m = sc.nextInt();
        System.out.println("Enter a total no of banana eatable by monkey");
        int b = sc.nextInt();
        System.out.println("Enter a total no of peanuts eatable by monkey");
        int p = sc.nextInt();
        System.out.println("Enter a total no of banana ");
        int banana = sc.nextInt();
        System.out.println("Enter a total no of peanuts ");
        int peanuts = sc.nextInt();
        find(m,b,p,banana,peanuts);
    }

    public static void find(int m,int b,int p,int banana,int peanuts ) {
        // TODO: Implement logic here
        int ban = banana / b;
        int pea = peanuts / p;
        System.out.println(m - (ban + pea));
    }
}