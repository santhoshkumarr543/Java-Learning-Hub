import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three words
        System.out.println("Enter word1:");
        String str1 = sc.next();
        System.out.println("Enter word2:");
        String str2 = sc.next();
        System.out.println("Enter word3:");
        String str3 = sc.next();

        String result1 = replaceVowels(str1);
        String result2 = replaceConsonants(str2);
        String result3 = str3.toUpperCase();

        System.out.println(result1 + result2 + result3);
    }

    public static String replaceVowels(String word) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                str.append('%');
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }

    public static String replaceConsonants(String word) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!isVowel(ch)) {
                str1.append('#');
            } else {
                str1.append(ch);
            }
        }
        return str1.toString();
    }

    public static boolean isVowel(char ch) {
        char x = Character.toLowerCase(ch);
        return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');
    }
}
