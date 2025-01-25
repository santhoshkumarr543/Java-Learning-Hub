package Day19;

import java.util.*;
class employee
{
    int id;
    String name;
    double salary;
    employee(int id,String name,double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class Pgm5 {
    //Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee no of employees : ");
        int n = sc.nextInt();
        employee[] e = new employee[n];
        System.out.println("Enter employee details : ");
        for(int i = 0;i < n;i++)
        {
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();
            e[i] = new employee(id,name,salary);
        }
        System.out.println("Enter Salary : ");
        double ts = sc.nextDouble();

        for(int i = 0;i < n;i++)
        {
            if(e[i].salary < ts)
            {
                System.out.println("Id :" + e[i].id);
                System.out.println("Name :" + e[i].name);
                System.out.println("Salary :" + e[i].salary);
            }
        }
    }
}
