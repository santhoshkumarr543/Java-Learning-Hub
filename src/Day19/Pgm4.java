package Day19;
import java.util.*;
class student{
    int rno;
    int m1;
    int m2;
    int m3;
    student(int rno,int m1,int m2,int m3) {
        this.rno = rno;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}
public class Pgm4 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pgm4 p = new Pgm4();
        System.out.println("enter the no of students");
        int n = sc.nextInt();
        student[] st = new student[n];
        System.out.println("Enter the Student details one by one");
        for (int i = 0; i < n; i++) {
            int rno = sc.nextInt();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            st[i] = new student(rno, m1, m2, m3);
        }
        for(int i = 0;i < n;i++)
        {
            System.out.print(st[i].rno + " ");
            System.out.print(st[i].m1 + " ");
            System.out.print(st[i].m2 + " ");
            System.out.print(st[i].m3 + " ");
            System.out.println();
        }
        int big = 0,rNo = 0;
        for(int i = 0;i < n;i++)
        {
            int max =(st[i].m1 + st[i].m2 + st[i].m3);
            System.out.println(max);
            if(max > big){
                big = max;
                rNo = st[i].rno;
            }
        }
        System.out.println(rNo + " " + big);
        //System.out.println(st.MaxMark());
        int mark1 = 0;
        int mark2 = 0;
        int mark3 = 0;
        int RNO1 = 0;
        int RNO2 = 0;
        int RNO3 = 0;
        for(int i = 0;i < n;i++)
        {
            if(st[i].m1 > mark1)
            {
                mark1 = st[i].m1;
                RNO1 = st[i].rno;
            }
            if(st[i].m2 > mark2)
            {
                mark2 = st[i].m2;
                RNO2 = st[i].rno;
            }
            if(st[i].m3 > mark3)
            {
                mark3 = st[i].m3;
                RNO3 = st[i].rno;
            }
        }
        System.out.println(RNO1 + " "+ mark1);
        System.out.println(RNO2 + " "+ mark2);
        System.out.println(RNO3 + " "+ mark3);
    }
}
