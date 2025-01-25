package Day23;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> ls = new ArrayList<>();
        System.out.println("enter size :");
        int n = sc.nextInt();

        for(int i = 0;i < n;i++)
        {
            ls.add(sc.next());
        }

        int length = ls.size();

        String[] str = ls.toArray(new String[0]);

        for(String s : str)
        {
            System.out.println(s);
        }
    }
}
