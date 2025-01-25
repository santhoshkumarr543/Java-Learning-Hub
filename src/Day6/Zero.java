package Day6;

import java.util.Scanner;

public class Zero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        //find(Binaryconverter(n));
        find(Integer.toBinaryString(n));
    }

    public static void find(String str) {
        // TODO: Implement logic here
        int count = 0,max =0;
        for(int i = 0;i < str.length();i++)
        {
            if(str.charAt(i) == '0')
            {
                count++;
                max = Math.max(max,count);
            }
            else {
                count = 0;
            }
        }
        System.out.println(max);
    }

}