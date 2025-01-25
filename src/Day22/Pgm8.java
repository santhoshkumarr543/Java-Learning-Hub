package Day22;

import java.util.Scanner;

class gift{
    private int amt;
    gift(int amt)
    {
        this.amt = amt;
    }
}
class mobile extends gift{
    int amt;
    mobile(int amt)
    {
        super(amt);
        this.amt = amt;
    }
    int getamt()
    {
        return amt;
    }
}
class laptop extends gift{
    int amt;
    laptop(int amt)
    {
        super(amt);
        this.amt = amt;
    }
    int getamt()
    {
        return amt;
    }
}
class bike extends gift{
    int amt;
    bike(int amt)
    {
        super(amt);
        this.amt = amt;
    }
    int getamt()
    {
        return amt;
    }
}
public class Pgm8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mamt = sc.nextInt();
        int bamt = sc.nextInt();

        mobile mb = new mobile(mamt);
        laptop ip = new laptop(mamt);
        bike bp = new bike(bamt);

        int tot = mb.getamt() + ip.getamt() + bp.getamt();
        System.out.println("total amount of gifts :" + tot);
    }
}
