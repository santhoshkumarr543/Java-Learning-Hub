package Day4;

import java.util.Scanner;

public class Aes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start and end");
        int start = sc.nextInt();
        int end = sc.nextInt();
        find(start,end);
    }

    public static void find(int start,int end) {
        // TODO: Implement logic here
        int digits = 0;
        for(int i = start;i <= end;i++)
        {
            int ans = check(i);
            if(ans == 4) digits++;
        }
        System.out.println(digits);
    }
    public static int check(int n)
    {
        int count = 0;
        for(int i = 1;i <= n;i++)
        {
            if((n % i) == 0)
            {
                count++;
            }
        }
        return count;
    }
}