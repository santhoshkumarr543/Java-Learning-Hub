package Day23;
import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size :");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> ls = new ArrayList<>();
        for(int i = 0;i < n;i++)
        {
            ls.add(sc.nextLine());
        }

        for(String s : ls)
        {
            System.out.println(s);
        }
    }
}
