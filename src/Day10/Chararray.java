package Day10;

import java.util.*;

public class Chararray {

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
        for(int i =0;i < n;i++)
        {
            if(str.charAt(i) != ' ') sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}