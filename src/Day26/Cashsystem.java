package Day26;
import java.util.*;
interface paymentmethod{
    void method(double d);
}
class Creditcard implements paymentmethod{
    public void method(double d)
    {
        System.out.println("this is credit card method " + d);
    }
}
class Debitcard implements paymentmethod{
    public void method(double d)
    {
        System.out.println("this is debit card method " + d);
    }
}
class Banking implements paymentmethod{
    public void method(double d)
    {
        System.out.println("this is banking method " + d);
    }
}
class Paymentgateway{
    public static void makepayment(paymentmethod p , double d)
    {
        p.method(d);
    }
}
public class Cashsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        paymentmethod pm = new Creditcard();
        paymentmethod pm1 = new Debitcard();
        paymentmethod pm2 = new Banking();

        Paymentgateway.makepayment(pm,d);
        Paymentgateway.makepayment(pm1,d);
        Paymentgateway.makepayment(pm2,d);
    }
}
