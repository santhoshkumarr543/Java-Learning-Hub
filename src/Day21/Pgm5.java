package Day21;

import java.util.Scanner;

class event{
    String name;
    String detail;
    String oname;
    event(String name,String detail,String oname)
    {
        this.name = name;
        this.detail = detail;
        this.oname = oname;
    }
    public void revenue()
    {

    }
}
class exp extends event{
    int d;
    int amt = 10000;
    exp(String name, String detail, String oname, int d) {
        super(name,detail,oname);
        this.d = d;
    }
    public void revenue()
    {
        System.out.println(d * amt);
    }
}
class stage extends event{
    int d;
    int amt = 50;
    stage(String name, String detail, String oname, int d) {
        super(name,detail,oname);
        this.d = d;
    }
    public void revenue()
    {
        System.out.println(d * amt);
    }
}
public class Pgm5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        String detail = sc.nextLine();
        String oname = sc.nextLine();
        int n = sc.nextInt();
        int d = sc.nextInt();
        if(n == 1)
        {
            exp e = new exp(name,detail,oname,d);
            e.revenue();
        }
        else if(n == 2)
        {
            stage s = new stage(name,detail,oname,d);
            s.revenue();
        }
    }
}
