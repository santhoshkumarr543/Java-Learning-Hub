package Day10;

import java.util.*;

public class Simple2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        System.out.println("Enter a String");
        String str1 = sc.next();
        find(str,str1);
    }

    public static void find(String str,String str1) {
        // TODO: Implement logic here
        System.out.println(str.length() + " " + str1.length());
        System.out.println(str.concat(str1));
        System.out.println(str.toUpperCase());
    }
}