package Day23;
import java.util.*;
public class Setcollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size :");
        int n = sc.nextInt();

        Set<String> st = new HashSet<>();
        for(int i = 0;i < n;i++)
        {
            st.add(sc.next());
        }
        System.out.println(st.size());
    }
}
