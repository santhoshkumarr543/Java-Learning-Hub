package Day10;

import java.util.*;

public class Juicecookie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        boolean flag = true;
        String[] arr = str.split(" ");
        for(int i = 0;i < arr.length - 1;i++)
        {
            if(arr[i].equals("cookie") )
            {
                //i += 2;
                if(arr[i + 1].equals("cookie"))
                {
                    flag = false;
                    break;
                }
            }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}