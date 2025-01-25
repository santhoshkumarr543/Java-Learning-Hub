package Day13;

import java.util.*;
import java.util.regex.*;

class User {
    String name;
    String pn;
    String un;

    //String pass;
    User(String name, String pn, String un) {
        this.name = name;
        this.pn = pn;
        this.un = un;
    }

    public String getname() {
        return name;
    }

    public String getpn() {
        return pn;
    }

    public String getun() {
        return un;
    }
}

public class Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.nextLine();
        System.out.println("Enter a phone number");
        String pn = sc.nextLine();
        System.out.println("Enter a username");
        String un = sc.nextLine();
        User us = new User(name, pn, un);
        try {
            System.out.println("Enter a password");
            String pass = sc.nextLine();
            System.out.println(passwordchecker(pass));
        } catch (Exception e) {
            System.out.println(us.getname());
            System.out.println(us.getpn());
            System.out.println(us.getun());
            System.out.println(e);
        }
    }

    public static String passwordchecker(String pass) throws Exception {
        // TODO: Implement logic here
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(pass);
        Pattern p1 = Pattern.compile("[!@#$%^&*]+");
        Matcher m1 = p1.matcher(pass);
        if (pass.length() > 20 || pass.length() < 10) {
            throw new Exception("Pasword should be minimum of 10 characters and maximum of 20 characters");
        } else if (!m.find()) {
            throw new Exception("Pasword should contains atleast 1 digit");
        } else if (!m1.find()) {
            throw new Exception("Pasword should contains atleast 1 special character");
        }

        return "Valid Password";
    }
}