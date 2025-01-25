package Day23;
import java.util.*;
public class MapCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String , Integer> mp = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0;i < n;i++)
        {
            mp.put(sc.next(),sc.nextInt());
        }
        int target = sc.nextInt();
        boolean flag = false;
        for(String key : mp.keySet())
        {
            int amt = mp.get(key);
            if(amt < target)
            {
                flag = true;
                System.out.println(key + " " + amt);
            }
        }
        if(!flag) System.out.println("No results are found!");
    }
}
