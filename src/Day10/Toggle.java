package Day10;

import java.util.*;

public class Toggle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        find(str);
    }

    public static void find(String str) {
        // TODO: Implement logic here
//        char a = 'Z';
//        System.out.println((int)a);
        StringBuilder str1  = new StringBuilder();
        for(int i = 0;i < str.length();i++)
        {
            int val = str.charAt(i);
            if(val >= 97 && val <= 122)
            {
                //char ch = (char)(val - 32);
                str1.append((char) (val - 32));
            }
            else {
                str1.append((char) (val + 32));
            }
        }
        System.out.println(str1);
    }
}