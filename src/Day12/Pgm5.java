package Day12;

import java.util.*;
import java.util.regex.*;

public class Pgm5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        try {
            String str = sc.next();
            int n = str.length();
            System.out.println(find(str, n));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static String find(String str, int n) throws Exception{
        // TODO: Implement logic here
        String str1 = "";
        str1 = str.substring(str.indexOf('.') + 1,n);
        //String domain = "cominnetbiz";
        if(str.lastIndexOf('.') == n - 1 || str.indexOf('.') == -1)
        {
            throw new Exception("Dot Exception :Invalid dot usage");
        }
        if(str.indexOf('@') == -1 || str.indexOf('@') > str.indexOf('.'))
        {
            throw new Exception("AtTheRate Exception :Invalid At usage");
        }
        if(str1.equals("com") || str1.equals("in") || str1.equals("net") || str1.equals("biz"))
        {
            return "valid email addres";
        }
        else {
            throw new Exception("Domain Exception :Invalid Domain usage");
        }

        //return "valid email addres";
    }
}