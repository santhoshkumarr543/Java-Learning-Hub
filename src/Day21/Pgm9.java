package Day21;

import java.util.Scanner;

class Quadrilateral {
    int x1, y1, x2, y2, x3, y3, x4, y4;

    Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;
        this.x4 = x4; this.y4 = y4;
    }
}

class Square extends Quadrilateral {
    Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    int getArea() {
        int side = x2 - x1;
        return side * side;
    }
}

class Rectangle extends Quadrilateral {
    Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    int getArea() {
        int length = x2 - x1;
        int width = y3 - y2;
        return length * width;
    }
}

class Parallelogram extends Quadrilateral {
    int height;
    Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int height) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
    }
    int getArea() {
        int base = x2 - x1;
        return base * height;
    }
}

class Trapezoid extends Quadrilateral {
    int height;
    Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int height) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
    }
    int getArea() {
        int base1 = x2 - x1;
        int base2 = x3 - x4;
        return (base1 + base2) * height / 2;
    }
}

public class Pgm9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square s = new Square(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        Parallelogram p = new Parallelogram(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        Trapezoid t = new Trapezoid(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Area of the Square is " + s.getArea());
        System.out.println("Area of the Rectangle is " + r.getArea());
        System.out.println("Area of the Parallelogram is " + p.getArea());
        System.out.println("Area of the Trapezoid is " + t.getArea());
    }
}
