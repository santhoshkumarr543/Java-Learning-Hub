package Day21;

import java.util.*;

class add
{
    public static int adda(int a,int b) {
        int sum = a + b;
        return sum;
    }
}
class sub extends add
{
    public static int suba(int a,int b) {
        int div = a - b;
        return div;
    }
}
public class Main extends sub{
    public static void main(String[] args) {
        sub s = new sub();
        Scanner sc = new Scanner(System.in);
        System.out.println(s.adda(sc.nextInt(),sc.nextInt()));
        System.out.println(s.suba(sc.nextInt(),sc.nextInt()));
    }
}
