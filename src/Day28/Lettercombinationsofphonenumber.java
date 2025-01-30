package Day28;

import java.util.*;

public class Lettercombinationsofphonenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String digit = sc.next();
        StringBuilder str = new StringBuilder();
        String[] arr = {"abc" ,"def" ,"ghi" ,"jkl" ,"mno" ,"pqrs" ,"tuv" ,"wxyz"};
        List<String> ls = new ArrayList<>();
        find(0,arr,digit,ls,str);
        System.out.println(ls);
    }

    public static void find(int idx , String[] arr, String digit,List<String> ls,StringBuilder str) {
        // TODO: Implement logic here
        if(idx == digit.length())
        {
            ls.add(str.toString());
            return;
        }
        String str1 = arr[digit.charAt(idx) - '2'];
        for(int i = 0;i < str1.length();i++)
        {
            str.append(str1.charAt(i));
            find(idx + 1,arr,digit,ls,str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}