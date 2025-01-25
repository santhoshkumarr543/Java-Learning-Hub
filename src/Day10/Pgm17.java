package Day10;

import java.util.*;

public class Pgm17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        StringBuilder sb = new StringBuilder();
        str.trim();
        for(int i = 0;i < n;i++)
        {
            if(str.charAt(i) == ' ')
            {
                sb.append(str.charAt(i + 1));
            }
        }
        System.out.println(sb);
    }
}