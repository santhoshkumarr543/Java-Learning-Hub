package Day22;

import java.util.Scanner;

public class Pgm9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of numbers : ");
        int n = sc.nextInt();
        if(n == 2) System.out.println(sum(sc.nextInt() , sc.nextInt()));
        else if(n == 3) System.out.println(sum(sc.nextInt() , sc.nextInt(),sc.nextInt()));
        else System.out.println("wrong input!");
    }
    public static int sum(int a,int b)
    {
        return a + b;
    }
    public static int sum(int a,int b,int c)
    {
        return a * b * c;
    }
}
