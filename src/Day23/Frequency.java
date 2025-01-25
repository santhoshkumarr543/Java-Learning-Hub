package Day23;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> ls = new ArrayList<>();
        System.out.println("enter size :");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n;i++)
        {
            ls.add(sc.nextLine());
        }
        System.out.println("enter the name to be searched :");
        String target = sc.nextLine();
        Iterator i = ls.iterator();
        int count = 0;
        while(i.hasNext())
        {
            if(i.next().equals(target)) count++;
        }
        System.out.println(target);
        System.out.println(count);
    }
}
