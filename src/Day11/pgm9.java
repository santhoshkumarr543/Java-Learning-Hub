package Day11;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pgm9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String str1 = sc.nextLine();

        System.out.println(find(str, str1));
    }

    public static String find(String str, String str1) {
        // TODO: Implement logic here
        Pattern p = Pattern.compile(str1);
        Matcher m = p.matcher(str);

        while(m.find())
        {
            if(m.start() == 0) return "matched";
        }
        return "not matched";
    }
}