package Day23;
import java.util.*;
class Age implements Comparable<Age>{
    String name;
    int age;
    Age(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public int compareTo(Age other)
    {
        return Integer.compare(other.age , this.age);
    }
    public String toString()
    {
        return name + " " + age;
    }
}
public class Agesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Age> ls = new ArrayList<>();
        System.out.println("enter size :");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n;i++)
        {
            String name = sc.next();
            int age = sc.nextInt();
            ls.add(new Age(name,age));
        }

        Collections.sort(ls);

        for(int i = 0;i < n;i++)
        {
            System.out.println((i + 1) + " " + ls.get(i));
        }
    }
}
