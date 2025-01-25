package Day13;

import java.util.*;

public class ISBN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ISBN number");
        try {
            String str = sc.nextLine();
            find(str);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void find(String str) throws Exception{
        // TODO: Implement logic here
        if(str.length() != 9)
        {
            throw new Exception("ISBN must be exactly 10 digits");
        }
        int num = 1;
        long x = 0;
        for(int i = 0;i < str.length();i++)
        {
            x += num * Character.getNumericValue(str.charAt(i));
            num++;
        }
        long rem = (x % 11);
        if(rem == 10)
        str += "X";
        else
            str += rem;

        System.out.println(str);
    }
}