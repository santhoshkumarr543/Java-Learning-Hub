package Day10;

import java.util.*;

public class Convertchararray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        for(char x : str.toCharArray())
        {
            System.out.print(x);
        }
    }
}