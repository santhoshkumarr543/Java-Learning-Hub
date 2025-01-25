package Day19;
import java.util.*;
class Cricket
{
    String name;
    String Country;
    String Skill;
    Cricket(String name,String Country,String Skill)
    {
        this.name = name;
        this.Country = Country;
        this.Skill = Skill;
    }
}
public class Pgm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name :");
        String name = sc.nextLine();
        System.out.println("Enter a Country :");
        String Country = sc.nextLine();
        System.out.println("Enter a Skill :");
        String Skill = sc.nextLine();

        Cricket ct = new Cricket(name,Country,Skill);
        System.out.println("Player name :" + ct.name);
        System.out.println("Contry name :" + ct.Country);
        System.out.println("Skill :" + ct.Skill);
    }
}
