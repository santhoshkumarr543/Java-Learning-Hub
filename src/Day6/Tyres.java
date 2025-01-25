package Day6;

import java.util.Scanner;

public class Tyres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int totalvahicle = sc.nextInt();
        int tyres = sc.nextInt();
        find(totalvahicle,tyres);
    }

    public static void find(int a,int b) {
        // TODO: Implement logic here
        for(int i = 1;i < a;i++)
        {
            if((i * 4) + ((a - i) * 2) == b)
            {
                if(i + (a - i) == a) {
                    System.out.println("FW : " + i + " " + "TW : " + (a - i));
                }
            }
        }
    }
}