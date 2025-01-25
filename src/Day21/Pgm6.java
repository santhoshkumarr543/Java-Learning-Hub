package Day21;

import java.util.Scanner;

class account
{
    private int accno;
    private int accba;

    public account(int accno,int accba)
    {
        this.accno = accno;
        this.accba = accba;
    }
    public int getaccno(){
        return accno;
    }
    public int getaccbalance(){
        return accba;
    }
}
public class Pgm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter no of account details : ");
        int n = sc.nextInt();
        account[] ac = new account[n];

        for(int i = 0;i < n; i++){
            int accno = sc.nextInt();
            int accba = sc.nextInt();
            ac[i] = new account(accno , accba);
        }

        System.out.println("enter the target account number : ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0;i < n;i++)
        {
            if(ac[i].getaccno() == target)
            {
                System.out.println(ac[i].getaccno());
                System.out.println(ac[i].getaccbalance());
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println(target);
            System.out.println("Account dosen't exit");
        }
    }
}
