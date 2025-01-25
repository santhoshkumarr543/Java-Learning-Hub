package Day23;
import java.util.*;
public class Setcollection2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Set<Integer> st = new HashSet<>();
        System.out.println("enter a size :");
        int n = sc.nextInt();
        for(int i = 0;i < n;i++)
        {
            st.add(sc.nextInt());
        }
        System.out.println(st);
    }
}
