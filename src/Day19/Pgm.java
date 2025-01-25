package Day19;
import java.util.*;
class alpha
{
    char ch;
    alpha(char ch)
    {
        this.ch = ch;
    }
    public String vowels()
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U')
        {
            return "Vowels";
        }
        return "Consonants";
    }
}
public class Pgm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch = sc.next().charAt(0);

        alpha ap = new alpha(ch);
        System.out.println(ch + " " + ap.vowels());

    }
}
