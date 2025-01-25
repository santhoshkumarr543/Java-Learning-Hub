package Day22;

import java.util.Scanner;

class Hello
{
    String name;
    Hello()
    {
        //this.name = name;
        System.out.println("Hello");
    }
    Hello(String name)
    {
        this.name = name;
        System.out.println("Hello " + name);
    }
}
public class Pgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name :");
        String str = sc.nextLine();
        Hello h = new Hello();
        Hello h1 = new Hello(str);

    }
}
