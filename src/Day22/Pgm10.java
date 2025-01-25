package Day22;

import java.util.Scanner;

public class Pgm10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the 5 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        sum(a , b);
        sum(c,d,e);
    }
    static void sum(int a, int b)
    {
        System.out.println(a * b);
    }
    static void sum(int c, int d,int e)
    {
        System.out.println(e * c * d);
    }
}
