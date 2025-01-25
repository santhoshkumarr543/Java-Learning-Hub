package Day15;

import java.util.*;

import static Day11.pgm9.find;

public class Mobilenumbrexception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a Mobile Number");
            String mn = sc.nextLine();
            System.out.println("Enter a Alternate Mobile Number");
            String amn = sc.nextLine();
            System.out.println("Enter a Landline");
            String ll = sc.nextLine();
            System.out.println("Enter a Email");
            String em = sc.nextLine();
            //int n = str.length();
            find(mn, amn);
            System.out.println("Mobile number :" + mn);
            System.out.println("alternate mobile no :" + amn);
            System.out.println("landline :" + ll);
            System.out.println("Email id :" + em);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String find(String str, String str1) throws Exception {
        // TODO: Implement logic here
        if (str.equals(str1)) {
            throw new Exception("mobile number and alternate number are same");
        }
        return null;
    }
}