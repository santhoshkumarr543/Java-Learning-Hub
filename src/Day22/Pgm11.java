package Day22;

import java.util.Scanner;

class Shape {
    double area;

    Shape() {
    }

    void calculateArea() {
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }
    void calculateArea() {
        area = 3.14 * radius * radius;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    void calculateArea() {
        area = 0.5 * base * height;
    }
}

class Rectanlee extends Shape {
    int length;
    int breadth;

    Rectanlee(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea() {
        area = length * breadth;
    }
}

public class Pgm11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();

        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        Circle c = new Circle(radius);
        c.calculateArea();

        Triangle t = new Triangle(base, height);
        t.calculateArea();

        Rectanlee r = new Rectanlee(length, breadth);
        r.calculateArea();

        System.out.println("Circle area = " + c.area);
        System.out.println("Triangle area = " + t.area);
        System.out.println("Rectangle area = " + r.area);
    }
}

