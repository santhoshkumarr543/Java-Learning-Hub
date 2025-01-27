package Day26;

import java.util.*;

public class Zigzag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        int n = sc.nextInt();
        System.out.println(find(s, n));
    }

    public static String find(String s, int n) {
        // TODO: Implement logic here
                if (n == 1 || s.length() <= n) return s;

                int row = 0;
                boolean flag = true;
                List<List<Character>> ls = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    ls.add(new ArrayList<>());
                }

                for (int i = 0; i < s.length(); i++) {
                    ls.get(row).add(s.charAt(i));

                    if (row == 0) flag = true;
                    if (row == n - 1) flag = false;

                    if (flag) row++;
                    else row--;
                }

                StringBuilder st = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < ls.get(i).size(); j++) {
                        st.append(ls.get(i).get(j));
                    }
                }
                return st.toString();
    }
}