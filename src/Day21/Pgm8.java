package Day21;

import java.util.Scanner;

class player{
    private String name;
    private int age;
    private String type;
    player(String name,int age,String type)
    {
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public void getname()
    {
        System.out.println("Name : "+ name);
    }
    public void getage()
    {
        System.out.println("age : "+ age);
    }
    public void gettype()
    {
        System.out.println("Player's gametype : "+ type);
    }
}
public class Pgm8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter player details : ");
        player p =new player(sc.next(),sc.nextInt(),sc.next());
        p.getname();
        p.getage();
        p.gettype();
    }
}
