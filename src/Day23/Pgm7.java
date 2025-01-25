package Day23;
import java.util.*;

class Hall implements Comparable<Hall> {
    private String name;
    private int capacity;
    private double price;
    private String oname;

    //public Hall() {}

    public Hall(String name, int capacity, double price, String oname) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.oname = oname;
    }

    public void setname(String name) { this.name = name; }
    public String getname() { return name; }

    public void setcapacity(int capacity) { this.capacity = capacity; }
    public int getcapacity() { return capacity; }

    public void setprice(double price) { this.price = price; }
    public double getprice() { return price; }

    public void setoname(String oname) { this.oname = oname; }
    public String getoname() { return oname; }

    public int compareTo(Hall other) {
        return Double.compare(this.price, other.price);
    }

    public String toString() {
        return name + " " + capacity + " " + price + " " + oname;
    }
}

public class Pgm7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hall> ls = new ArrayList<>();

        System.out.println("Enter the number of halls:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter hall details (name, capacity, price, owner name):");
            String name = sc.nextLine();
            int capacity = Integer.parseInt(sc.nextLine());
            double price = Double.parseDouble(sc.nextLine());
            String oname = sc.nextLine();
            ls.add(new Hall(name, capacity, price, oname));
        }

        Collections.sort(ls);

        System.out.println("Sorted hall details:");
        for (Hall h : ls) {
            System.out.println(h);
        }

        sc.close();
    }
}
