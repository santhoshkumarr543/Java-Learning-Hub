package Day12;

import java.util.*;
import java.util.regex.*;

public class Pgm6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a Register number");
            String str = sc.next();
            System.out.println("Enter a Phone number");
            String str1 = sc.next();
            //int n = str.length();
            System.out.println(find(str, str1));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static String find(String str, String str1)throws Exception {
        // TODO: Implement logic here
        Pattern p = Pattern.compile("[0-9]{2}[A-Z]{3}[0-9]{4}");
        Matcher m = p.matcher(str);

        Pattern p1 = Pattern.compile("[^0-9]");
        Matcher m1 = p1.matcher(str1);

        if(str.length() != 9 || str1.length() != 10) throw new Exception ("illegal argument exception");

        else if(!m.find()) throw new Exception ("no such element Exception");

        else if(m1.find()) throw new Exception ("number format Exception");

        else return "valid";
    }
}