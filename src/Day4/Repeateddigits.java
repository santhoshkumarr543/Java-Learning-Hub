package Day4;

import java.util.Scanner;

public class Repeateddigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (start end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int num = start; num <= end; num++) {
            if (hasUniqueDigits(num)) {
                System.out.print(num + " ");
            }
        }
    }
    private static boolean hasUniqueDigits(int num) {
        int temp = num;
        int digit;
        while (temp > 0) {
            digit = temp % 10;
            int check = num;
            while (check > 0) {
                if (check % 10 == digit && check / 10 != temp / 10) {
                    return false;
                }
                check /= 10;
            }

            temp /= 10;
        }
        return true;
    }
}