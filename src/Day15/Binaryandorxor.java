package Day15;

import java.util.*;

public class Binaryandorxor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        int ans =Character.getNumericValue(str.charAt(0));
        for(int i = 1;i < n;i = i + 2)
        {
            if(str.charAt(i) == 'A') ans = ans & Character.getNumericValue(str.charAt(i + 1));

            else if(str.charAt(i) == 'B') ans = ans | Character.getNumericValue(str.charAt(i + 1));

            else if(str.charAt(i) == 'C') ans = ans ^ Character.getNumericValue(str.charAt(i + 1));
        }
        System.out.println(ans);
    }
}