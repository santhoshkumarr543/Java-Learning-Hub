package Day25;

import java.util.*;

public class Decodestring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        System.out.println(find(str));
    }

    public static String find(String str) {
        Stack<Integer> nst = new Stack<>();
        Stack<String> sst = new Stack<>();
        int k = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
                continue;
            }
            if (ch == '[') {
                nst.push(k);
                k = 0;
                sst.push("[");
                continue;
            }
            if (ch == ']') {
                StringBuilder temp = new StringBuilder();
                while (!sst.peek().equals("[")) {
                    temp.insert(0, sst.pop());
                }
                sst.pop();

                int num = nst.pop();
                StringBuilder csr = new StringBuilder();
                for (int i = 0; i < num; i++) {
                    csr.append(temp);
                }

                sst.push(csr.toString());
                continue;
            }

            sst.push(String.valueOf(ch));
        }

        StringBuilder result = new StringBuilder();
        while (!sst.empty()) {
            result.insert(0, sst.pop());
        }

        return result.toString();
    }
}
