package Day12;

import java.util.*;

public class Pgm7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        //String str = sc.next();
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the index");
            int index = sc.nextInt();
            System.out.println(arrayindexoutofbound(arr, index));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            System.out.println("enter the two no of division");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(arithmeticexception(a,b));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            String str = null;
            System.out.println(nullpointerexception(str));

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static int arrayindexoutofbound(int[] arr, int index) {
        // TODO: Implement logic here
        return arr[index];
    }
    public static int arithmeticexception(int a, int b) {
        // TODO: Implement logic here
        return a/b;
    }
    public static int nullpointerexception(String str) {
        // TODO: Implement logic here
        return str.charAt(0);
    }
}