package Day22;

import java.util.Scanner;

class A{
    public void m1()
    {
        System.out.println("From parent m1");
    }
    public void m2(int n)
    {
        System.out.println(n);
    }
}
class B extends A{
    public void m1()
    {
        System.out.println("From child m1");
    }
    public void m2(int n)
    {
        System.out.println(n);
    }
}
public class Pgm5 {
    public static void main(String[] args) {
        System.out.println("enter the values: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        A x = new A();
        x.m1();
        x.m2(a);
        B y = new B();
        y.m1();
        y.m2(b);
    }
}
