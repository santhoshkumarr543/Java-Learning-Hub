package Day10;

import java.util.*;

public class Pgm15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        StringBuilder sb = new StringBuilder();

        for(int i = 1;i < n;i++)
        {
            if(str.charAt(i) == str.charAt(i - 1))
            {
                sb.append(str.charAt(i));
                sb.append("*");
            }
            else {
                sb.append(str.charAt(i - 1));
            }
        }
        sb.append(str.charAt(n - 1));
        System.out.println(sb);
    }
}