package Day6;

import java.util.Scanner;

public class Hashtag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hashtag string");
        String str = sc.next();

        find(str);
    }

    public static void find(String str) {
        // TODO: Implement logic here
        int starcount = 0,hashtag = 0;
        for(int i = 0;i < str.length();i++)
        {
            if(str.charAt(i) == '*')
            {
                starcount++;
            }
            else {
                hashtag++;
            }
        }
        if(hashtag > starcount) System.out.println("Negative");
        else if(hashtag < starcount) System.out.println("Positive");
        else System.out.println("Zero");
    }
}