package Day12;

import java.util.*;

public class Pgm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        if(n > 2)
        {
            splitString(str);
        }
        else {
            splitString(null);
        }
    }
    public static void splitString(String str)
    {
        try
        {
            String[] str1 = str.split("/");
            for(int i = 0;i < str1.length;i++)
             {
                 System.out.println(str1[i] + " " + i);
             }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally
        {
            System.out.println("Inside finally block");
        }
    }
}