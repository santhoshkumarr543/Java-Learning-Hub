package Day23;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter two digits :");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(sum(a, b));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static int sum(int a,int b) throws Exception
    {
        return a/b;
    }
}
