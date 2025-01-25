package Day11;

import java.util.*;

public class Pgm14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        //String str = sc.nextLine();
        int n = sc.nextInt();
        String str = Integer.toBinaryString(n);
        System.out.println(find(str, n));
    }

    public static String find(String str, int n) {
        // TODO: Implement logic here
        int count = 0;
        for(int i = 0;i < str.length();i++)
        {
            if(str.charAt(i) == '1') count++;
        }
        if((count % 2) != 0) return "oddius number";

        return "no a oddius number";
    }
}