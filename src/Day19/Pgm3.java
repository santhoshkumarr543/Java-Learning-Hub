package Day19;

import java.util.*;

public class Pgm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pgm3 p = new Pgm3();
        System.out.println("enter a number");
        int n = sc.nextInt();
        p.count(n);
    }
    public void count(int n)
    {
        int cnt = 0;
        while(n > 0)
        {
            cnt++;
            n /= 10;
        }
        System.out.println(cnt);
    }
}
