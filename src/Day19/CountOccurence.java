package Day19;

import java.util.*;
class Cnt
{
    String str;
    char target;
    Cnt(String str,char target)
    {
        this.str=str;
        this.target=target;
    }
    void Occurences()
    {
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==target)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char target=sc.next().charAt(0);
        Cnt obj = new Cnt(str,target);
        obj.Occurences();
    }
}
