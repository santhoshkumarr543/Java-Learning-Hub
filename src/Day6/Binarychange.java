package Day6;

import java.util.Scanner;

public class Binarychange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        find(Integer.toBinaryString(n));
    }

    public static void find(String str1) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '0') {
                str.append('1');
            } else if (str1.charAt(i) == '1') {
                str.append('0');
            }
        }
        System.out.println(str.toString());
        System.out.println(Integer.parseInt(str.toString(), 2));
    }
}
