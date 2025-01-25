package Day22;

import java.util.Scanner;

class Converter{
    void tocelcius(int a)
    {
        System.out.println((a - 32) * 5.0 / 9.0);
    }
    void tofaren(int b)
    {
        System.out.println((b * 9.0/5.0 )+ 32);
    }
}
public class pgm7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter temprature and unit:");
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        Converter co = new Converter();
        if(c == 'F' || c == 'f') co.tocelcius(a);
        else if(c == 'C' || c == 'c') co.tofaren(a);
        else System.out.println("ivalid");
    }
}
