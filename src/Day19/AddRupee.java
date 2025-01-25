package Day19;

import java.util.*;
class Amount
{
    double rup1;
    double paise1;
    double rup2;
    double paise2;
    void setPrice(double rup1,double paise1,double rup2,double paise2)
    {
        this.rup1=rup1;
        this.paise1=paise1;
        this.rup2=rup2;
        this.paise2=paise2;
    }
    void getRupee()
    {
        double tot=rup1+rup2;
        tot+=(int)(paise1+paise2)/100;
        tot+=((paise1+paise2)%100)/100;
        System.out.println(tot);
    }
}
public class AddRupee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rup1=sc.nextDouble();
        double paise1=sc.nextDouble();
        double rup2=sc.nextDouble();
        double paise2=sc.nextDouble();
        Amount obj=new Amount();
        obj.setPrice(rup1,paise1,rup2,paise2);
        obj.getRupee();
    }
}
