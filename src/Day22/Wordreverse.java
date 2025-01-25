package Day22;

import java.util.*;

public class Wordreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine().trim().replaceAll("\\s+"," ");;
        String[] ans = str.split("\\s");

        String rev = "";

        for(int i = ans.length - 1;i >= 0;i--)
        {
            rev += ans[i];
            rev += " ";
        }
        System.out.println(rev.trim());
    }
}
