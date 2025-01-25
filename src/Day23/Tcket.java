package Day23;
import java.util.*;
public class Tcket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0;i < 5;i++)
        {
            String str = sc.nextLine();
            String[] s = str.split(",");
            List<Integer> ls1 = new ArrayList<>();

            for(String x : s)
            {
                int value = Integer.parseInt(x);
                ls1.add(100 - value);
            }
            ls.add(ls1);
        }
        System.out.println("enter the number to retrieve : ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Remaining tickets:" + ls.get(day - 1));
        } else {
            System.out.println("Invalid day input");
        }

    }
}
