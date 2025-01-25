package Day22;

import java.util.Scanner;

class Rectangle{
    void caculatearea(double b,double l)
    {
        System.out.println(b * l);
    }
}
public class Pgm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter breadth and lenght");
        double b = sc.nextDouble();
        double l = sc.nextDouble();
        Rectangle r = new Rectangle();
        r.caculatearea(b , l);
    }
}
