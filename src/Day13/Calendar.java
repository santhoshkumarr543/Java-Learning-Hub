package Day13;

import java.util.*;

public class Calendar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day");
        String str = sc.next();
        System.out.println("Enter a days of starting of month");
        int n = sc.nextInt();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        Map<String, Integer> mp = new HashMap<>();
        mp.put("mon", 1);
        mp.put("tue", 2);
        mp.put("wed", 3);
        mp.put("thu", 4);
        mp.put("fri", 5);
        mp.put("sat", 6);
        mp.put("sun", 7);

        System.out.println((mp.get(str) + n / 7));
    }
}