package Day23;
import java.util.*;
class Student {
    int rno;
    String name;
    String addres;
    int rank;
    Student(int rno,String name,String addres,int rank)
    {
        this.rno = rno;
        this.name = name;
        this.addres = addres;
        this.rank = rank;
    }
    public String toString()
    {
        return rno + " " + name + " " + addres + " " + rank;
    }
}
 class sortbyrollno implements Comparator<Student>
{
    public int compare(Student s1 , Student s2)
    {
        return s1.rno > s2.rno ? 1 : -1;
    }
}

 class sortbyname implements Comparator<Student>
{
    public int compare(Student s1 , Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}
class sortbyrank implements Comparator<Student>
{
    public int compare(Student s1 , Student s2)
    {
        return s1.rank > s2.rank ? 1 : -1;
    }
}
public class Comparefunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> ls = new ArrayList<>();
        boolean exit = true;
        while(exit) {
            System.out.println("Enter your choice :");
            System.out.println("1). Add User");
            System.out.println("2). Sort Student List by Roll no");
            System.out.println("3). Sort Student List by Name");
            System.out.println("4). sort Students by Rank");
            System.out.println("5). Exit from System");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter no of students first :");
                    int n = sc.nextInt();
                    System.out.println("enter student details rno,name,address,rank :");
                    for (int i = 0; i < n; i++) {
                        ls.add(new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));
                    }
                    break;

                case 2:
                    Collections.sort(ls, new sortbyrollno());
                    System.out.println("Students List sorted by rollno");
                    for (Student s : ls) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    Collections.sort(ls, new sortbyname());
                    System.out.println("Students List sorted by name");
                    for (Student s : ls) {
                        System.out.println(s);
                    }
                    break;

                case 4:
                    Collections.sort(ls, new sortbyrank());
                    System.out.println("Students List sorted by rank");
                    for (Student s : ls) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    exit = false;
                    System.out.println("exiting...");
                    break;

                default:
                    System.out.println("you entered a wrong choice..!");
                    break;
            }
        }
    }
}
