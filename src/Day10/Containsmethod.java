package Day10;

import java.util.*;

public class Containsmethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("Enter a word to find");
        String str1 = sc.next();
        int n = str.length();
        find(str, n,str1);
    }

    public static void find(String str, int n,String str1) {
        // TODO: Implement logic here
        System.out.println(str.contains(str1));
    }
}