package Day23;
import java.util.*;
class sortbystringlength implements Comparator<String>
{
    public int compare(String s1,String s2)
    {
        return s1.length() > s2.length() ? 1 : -1;
    }
}
public class Comaparatorpracticestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        ls.add("santhosh");
        ls.add("sanjay");
        ls.add("mosees");
        ls.add("naveen");
        ls.add("prasanna");

        Collections.sort(ls , new sortbystringlength());
        System.out.println(ls);
    }
}
