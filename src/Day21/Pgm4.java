package Day21;

import java.util.Scanner;

class Birds {
    public Birds() {
        System.out.print("Birds : ");
    }
}

class Parrot extends Birds {
    public Parrot() {
        System.out.println("Grey Parrot");
    }
}

class Cocktail extends Parrot {
    public Cocktail() {
        System.out.println("Grey Cocktail");
    }
}

class Kiwi extends Cocktail {
    public Kiwi() {
        System.out.println("Grey Kiwi");
    }
}

public class Pgm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.equals("Parrot")) {
            new Parrot();
        } else if (str.equals("Cocktail")) {
            new Cocktail();
        } else if (str.equals("Kiwi")) {
            new Kiwi();
        }
    }
}
