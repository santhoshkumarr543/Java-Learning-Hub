package Day23;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i < 5;i++)
        {
            q.add(sc.nextInt());
        }

        q.remove(q.size());

        Iterator<Integer> i = q.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
