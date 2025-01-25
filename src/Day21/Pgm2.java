package Day21;

import java.util.Scanner;

class vehicle
{
    protected String type;
    vehicle(String type)
    {
        this.type = type;
    }
    public void disptype()
    {
        System.out.println("type :" + type);
    }
}
class car extends vehicle{
    private String brand;
    car(String type,String brand)
    {
        super(type);
        this.brand = brand;
    }
    public void dispbrand()
    {
        System.out.println("brand :" + brand);
    }
}
public class Pgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a car type and brand");
        car c = new car(sc.next(),sc.next());
        c.disptype();
        c.dispbrand();
    }
}
