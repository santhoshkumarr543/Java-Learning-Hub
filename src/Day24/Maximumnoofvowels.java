package Day24;

import java.util.*;

public class Maximumnoofvowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next().toLowerCase();
        System.out.println("enter a vowel size : ");
        int k = sc.nextInt();
        int n = str.length();
        find(str, n,k);
    }

    public static void find(String str, int n,int k) {
        // TODO: Implement logic here
        int i = 0;
        int count = 0,rep;
        while(i <= n - k)
        {
            rep = 0;
            for(int j = i;j < i + k;j++)
            {
                if(isVowels(str.charAt(j)))
                {
                    rep++;
                    if(rep == k) count++;
                }
            }
            i++;
        }
        System.out.println(count);
    }
    public static boolean isVowels(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;

        return false;
    }
}