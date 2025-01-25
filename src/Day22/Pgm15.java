package Day22;

import java.util.Scanner;

class PoolTable {
    public double length;
    public double width;
    public double pocketSize;

    PoolTable(double length, double width, double pocketSize) {
        this.length = length;
        this.width = width;
        this.pocketSize = pocketSize;
    }

    double caltable() {
        return 2 * (length + width);
    }

    double calpocket() {
        return 3.14 * pocketSize;
    }
}

public class Pgm15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of pool table: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of pool table: ");
        double width = sc.nextDouble();

        System.out.print("Enter diameter of pocket: ");
        double pocketsize = sc.nextDouble();

        PoolTable pt = new PoolTable(length, width, pocketsize);

        System.out.printf("Perimeter of Pool Table : %.1f\n", pt.caltable());
        System.out.printf("Perimeter of Pocket : %.1f\n", pt.calpocket());
    }
}

