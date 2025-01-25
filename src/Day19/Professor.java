package Day19;

import java.util.*;
class Prof
{
    int id;
    String name;
    String dept;
    int age;
    int salary;
    public Prof(int id,String name,String dept,int age,int salary)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.age=age;
        this.salary=salary;
    }
}
public class Professor {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        n = sc.nextInt();
        Prof arr[] = new Prof[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            String dept = sc.next();
            int age = sc.nextInt();
            int salary = sc.nextInt();
            Prof obj = new Prof(id, name, dept, age, salary);
            arr[j++] = obj;
        }
        Prof obj = arr[0];
        int maxi = arr[0].salary;
        for (int i = 0; i < n; i++) {
            if (arr[i].salary > maxi) {
                obj = arr[i];
            }
        }
        System.out.println(obj.id + " " + obj.name + " " + obj.dept + " " + obj.age + " " + obj.salary);
    }
}