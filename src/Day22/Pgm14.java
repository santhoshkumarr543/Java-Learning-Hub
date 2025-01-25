package Day22;


public class Pgm14 {
    public static void main(String[] args) {
        System.out.println("Hi");
        main("Hello World");
        main("Tom", "Jerry");
    }

    public static void main(String arg) {
        System.out.println("Overloaded: " + arg);
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Overloaded: " + arg1 + " & " + arg2);
    }
}
