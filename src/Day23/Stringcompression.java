package Day23;

import java.util.*;

public class Stringcompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        int n = sc.nextInt();
        char[] str = new char[n];
        for(int i = 0;i < n;i++)
        {
            str[i] = sc.next().charAt(0);
        }
        find(str, n);
    }

    public static void find(char[] str, int n) {
        // TODO: Implement logic here
        int i = 0,j = 0;
        while(j < n)
        {
            char ch = str[j];
            int count = 0;
            while(j < n && str[j] == ch)
            {
                count++;
                j++;
            }
            str[i++] = ch;

            if(count > 1)
            {
                String ct = Integer.toString(count);
                for(char x : ct.toCharArray())
                {
                    str[i++] = x;
                }
            }
        }
        System.out.println(i);
    }
}