package Day11;

import java.util.*;

public class Pgm13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        //String str = sc.next();
        int n = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 1;i <= n;i++)
        {
            ls.add(i);
        }
        find(ls, n);
    }

    public static void find(ArrayList<Integer> ls, int n) {
        // TODO: Implement logic here
        int remove = 2;
        while(remove <= ls.size())
        {
            for (int i = remove - 1; i < ls.size(); i += remove - 1)
            {
                ls.remove(i);
            }
            remove++;
        }
        System.out.println(ls);
    }
}