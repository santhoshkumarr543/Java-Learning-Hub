package Day9;

import java.util.*;

public class Painting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of exterior walls");
        int e = sc.nextInt();
        System.out.println("Enter a number of interor walls");
        int i = sc.nextInt();
        System.out.println("Enter a number of exterior walls sq ft");
        double[] ext = new double[e];
        for(int j = 0;j < e;j++)
        {
            ext[j] = sc.nextDouble();
        }
        System.out.println("Enter a number of interior walls sq ft");
        double[] inte = new double[i];
        for(int j = 0;j < i;j++)
        {
            inte[j] = sc.nextDouble();
        }
        find(e,i,ext,inte);
    }

    public static void find(int e,int i,double[] ext , double[] inte) {
        // TODO: Implement logic here
        double extecost = 12;
        double exteans = 0;
        for(int j = 0;j < e;j++)
        {
            exteans += ext[j] * extecost;
        }
        double intecost = 18;
        double inteans = 0;
        for(int j = 0;j < i;j++)
        {
            inteans += inte[j] * intecost;
        }

        System.out.println("Total :" + (exteans + inteans));
    }
}