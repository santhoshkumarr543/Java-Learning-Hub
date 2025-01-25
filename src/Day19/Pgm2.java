package Day19;
import java.util.*;

public class Pgm2 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pgm2 p = new Pgm2();
        System.out.println("enter a size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter a target");
        int t = sc.nextInt();
        p.read(arr,n);
        p.find(arr,n,t);
    }
    public void read(int[] arr, int n)
    {
        System.out.println("enter a array elements");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        //return arr;
    }
    public void find(int[] arr,int n,int t)
    {
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                int sum = arr[i] + arr[j];
                if(sum == t) System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}
