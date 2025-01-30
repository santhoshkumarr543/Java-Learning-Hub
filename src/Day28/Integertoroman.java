package Day28;

import java.util.*;

public class Integertoroman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        find(n);
    }

    public static void find(int n) {
        // TODO: Implement logic here
        String[] str = {"M", "CM", "D", "CD", "C","XC","L","XL","X","IX","V","IV","I"};
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int k = 0;
        String ans = "";
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] <= n)
            {
             k = n / arr[i];
             n %= arr[i];
            }
            while(k > 0)
            {
                ans += str[i];
                k--;
            }
        }
        System.out.println(ans);
    }
}