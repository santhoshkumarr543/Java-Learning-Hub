package Day19;

import java.util.*;
class TelephoneIndex
{
    String name;
    String number;
    TelephoneIndex(String name,String mobile)
    {
        this.name=name;
        this.number=mobile;
    }
}
public class SearchName{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
        TelephoneIndex arr[]=new TelephoneIndex[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            String name=sc.next();
            String mobile=sc.next();
            TelephoneIndex obj=new TelephoneIndex(name,mobile);
            arr[j++]=obj;
        }
        System.out.println("enter Search");
        String search=sc.next();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].name.contains(search))
            {
                System.out.println("name:"+ " "+ arr[i].name);
                System.out.println("mobile: " + arr[i].number);
            }
        }
    }
}
