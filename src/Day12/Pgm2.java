package Day12;

import java.util.*;

public class Pgm2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number1");
            int n = sc.nextInt();
            System.out.println("Enter a number1");
            int n1 = sc.nextInt();
            System.out.println(find(n, n1));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static int find(int n, int n1) {
        // TODO: Implement logic here
        return n / n1;
    }
}