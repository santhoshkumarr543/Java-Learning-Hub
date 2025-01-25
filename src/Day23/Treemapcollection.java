package Day23;
import java.util.*;
public class Treemapcollection {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<Integer , Integer> mp = new TreeMap<>();
        System.out.println("enter size :");
        int n = sc.nextInt();
        for(int i = 0;i < n;i++)
        {
            int price = sc.nextInt();
            int seats = sc.nextInt();
            mp.put(price , mp.getOrDefault(price, 0) + seats);
        }
        System.out.println(mp);
    }
}
