package Day23;
import java.util.*;
public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> ls = new LinkedList<>();
        System.out.println("enter the size : ");
        int n = sc.nextInt();
        for(int i = 0;i < n;i++)
        {
            ls.add(sc.next());
        }
        System.out.println("enter the index to remove based on 0th index:");
        int r = sc.nextInt();

        ls.remove(r);

        Iterator i = ls.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
