package Day23;
import java.util.*;
public class Linkedlist2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter e size : ");
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String> ls = new LinkedList<>();

        for(int i = 0;i < n;i++)
        {
            ls.add(sc.nextLine());
        }

        Iterator<String> i = ls.iterator();
        int index = 0;
        while(i.hasNext())
        {
            System.out.println("Element at index " + index + " " + i.next());
            index++;
        }
    }
}
