package Day22;

import java.util.Scanner;

class Game {
    int area;

    Game() {
    }

    void calculateArea() {
    }
}

class Carom extends Game {
    int side;

    Carom(int side) {
        this.side = side;
    }
    void calculateArea() {
        area = side * side;
    }
}

class TableTennis extends Game {
    int length;
    int breadth;

    TableTennis(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea() {
        area = length * breadth;
    }
}

public class Pgm13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of carom: ");
        int cs = sc.nextInt();

        System.out.print("Enter length of TT table: ");
        int ttLength = sc.nextInt();

        System.out.print("Enter breadth of TT table: ");
        int ttBreadth = sc.nextInt();

        Carom c = new Carom(cs);
        c.calculateArea();

        TableTennis tt = new TableTennis(ttLength, ttBreadth);
        tt.calculateArea();

        System.out.println("Area of the Carrom: " + c.area + "cm");
        System.out.println("Area of the TT: " + tt.area + "cm");
    }
}
