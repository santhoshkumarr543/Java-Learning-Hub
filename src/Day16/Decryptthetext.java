package Day16;

import java.util.*;

public class Decryptthetext {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("Enter a Decrypt number");
        int d = sc.nextInt();
        int n = str.length();
        find(str, n, d);
    }

    public static void find(String str, int n,int d) {
        // TODO: Implement logic here
        String str1 = "";
        for(int i = 0;i < n;i++)
        {
            int spot = (i + d) % n;
            str1 += str.charAt(spot);
        }
        System.out.println(str1);
    }
}