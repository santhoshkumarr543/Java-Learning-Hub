package Day12;

import java.util.*;

public class Pgm4 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        try {
            System.out.println(find());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static int find() {
        // TODO: Implement logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
}