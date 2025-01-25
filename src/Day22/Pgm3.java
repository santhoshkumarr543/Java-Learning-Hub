package Day22;

import java.util.Scanner;

class Main{
        public void print(Integer d)
        {
            System.out.println(d);
        }public void print(String str)
        {
            System.out.println(str);
        }public void print(boolean b)
        {
            System.out.println(b);
        }
}
public class Pgm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        m.print(35);
        m.print("hello");
        m.print(20 > 10);
    }
}
