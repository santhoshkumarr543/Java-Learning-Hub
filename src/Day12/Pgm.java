package Day12;

import java.util.*;

public class Pgm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1");
        int n = sc.nextInt();
        System.out.println("Enter a number2");
        int n1 = sc.nextInt();
        find(n, n1);
    }

    public static void find(int n, int n1) {
        // TODO: Implement logic here
        try{
            if(n < 0 || n1 < 0)
            {
                throw new Exception ("n 0r p should be negative");
            }
            else if(n == 0 || n1 == 0)
            {
                throw new Exception("number shuld not be zero");
            }
            else {
                System.out.println(Math.pow(n,n1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block executed");
        }
    }
}