package Day23;
import java.util.*;
public class ArrayList3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int n =sc.nextInt();
        List<String> ls = new ArrayList<>();
        for(int i = 0;i < n;i++)
        {
            ls.add(sc.next());
        }
        System.out.println("enter the string to be searched :");
        String str = sc.next();

        int po = ls.indexOf(str);

        if(po != -1) System.out.println(str + " hall is found in the list at position " + po);
        else System.out.println(str + " hall is not found");
    }
}
