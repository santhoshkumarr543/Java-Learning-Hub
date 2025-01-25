import java.util.Scanner;
public class Oxygenlevel
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]p1=new int[n];
        int[]p2=new int[n];
        int[]p3=new int[n];
        for(int i=0;i<n;i++)
        {
            p1[i]=sc.nextInt();
            p2[i]=sc.nextInt();
            p3[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int sum=p1[i]+p2[i]+p3[i];
            int avg=sum/3;
            System.out.println("avg of"+(i+1)+"is"+Math.round(avg));
            if(avg>70)
            {
                System.out.println("trainee number:"+(i+1));
            }
            else
            {
                System.out.println("all players are not eligible");
            }
        }
    }
}