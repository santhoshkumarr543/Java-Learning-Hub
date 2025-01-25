package Day12;

import java.util.*;
class ItemType
{
    String name;
    Double deposit;
    Double cpd;
    ItemType(String name,Double deposit,Double cpd)
    {
        this.name = name;
        this.deposit = deposit;
        this.cpd = cpd;
    }
    public String getname()
    {
        return name;
    }
    public double getdeposit()
    {
        return deposit;
    }
    public double getcpd()
    {
        return cpd;
    }
}
public class Pgm8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.next();
        System.out.println("Enter a deposit");
        String deposit = sc.next();
        System.out.println("Enter a costperday");
        String cpd = sc.next();
        double dep = 0;
        double cost = 0;
        try {
            dep = Double.parseDouble(deposit);
            cost = Double.parseDouble(cpd);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        ItemType it = new ItemType(name,dep,cost);
        System.out.println(it.getname());
        System.out.println(it.getdeposit());
        System.out.println(it.getcpd());
    }
}