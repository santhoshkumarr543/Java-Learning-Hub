package Day22;

import java.util.*;
class icecream{
    public static void quantity(int r)
    {
        System.out.println((4.0/3) * 3.14 * (r * r * r));
    }
    public static void quantity(int r1,int h)
    {
        System.out.println((1.0/3) * 3.14 * r1 * r1 * h);
    }
}
public class Pgm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter for circle :");
        int r = sc.nextInt();
        icecream i = new icecream();
        i.quantity(r);
        System.out.println("enter for traingle :");
        int r1 = sc.nextInt();
        int h = sc.nextInt();
        i.quantity(r1,h);

    }

 }
