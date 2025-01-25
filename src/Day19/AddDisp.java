package Day19;

import java.util.*;
class Address
{
    String Street;
    String city;
    int pincode;
    String country;
    Address(String Street,String city,int pincode, String country)
    {
        this.Street=Street;
        this.city=city;
        this.pincode=pincode;
        this.country=country;
    }
    public void display(Address obj)
    {
        System.out.println("Street: "+ obj.Street);
        System.out.println("city: "+ obj.city);
        System.out.println("pincode: "+ obj.pincode);
        System.out.println("country: "+ obj.country);
    }
}
public class AddDisp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Street=sc.nextLine();
        String city=sc.next();
        int pincode=sc.nextInt();
        String country=sc.next();
        Address obj=new Address(Street, city, pincode, country);
        obj.display(obj);
    }
}
