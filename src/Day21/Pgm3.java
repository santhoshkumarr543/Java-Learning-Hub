package Day21;
import java.util.*;
class Employee
{
    int empid;
    float salary;
    Employee(int empid,float salary)
    {
        this.empid = empid;
        this.salary = salary;
    }
}
class Emplevel extends Employee{
    Emplevel(int empid,float salary)
    {
        super(empid,salary);
    }
    public void disp()
    {
        if(salary < 100.0)
        {
            System.out.println("id :"+ empid);
            System.out.println("salary : "+ salary);
            System.out.println("level 2");
        }
        else {
            System.out.println("id :"+ empid);
            System.out.println("salary : "+ salary);
            System.out.println("level 1");
        }
    }
}
public class Pgm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee id and salary in dollar");
        Emplevel el = new Emplevel(sc.nextInt(), sc.nextFloat());
        el.disp();
    }
}
