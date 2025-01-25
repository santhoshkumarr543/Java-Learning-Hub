package Day11;

import java.util.*;

public class Pgm11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int n = str.length();
        System.out.println(find(str, n));
    }

    public static String find(String str, int n) {
        // TODO: Implement logic here
        if(str.charAt(0) == '0')
        {
            return "not a duck number";
        }
        return "duck number";
    }
}