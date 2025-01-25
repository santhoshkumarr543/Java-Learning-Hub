package Day21;

import java.util.Scanner;

class Stall {
    private String name;
    private int cost;
    private String owner;
    private int rent;

    public Stall() {}

    public Stall(String name, int cost, String owner, int rent) {
        this.name = name;
        this.cost = cost;
        this.owner = owner;
        this.rent = rent;
    }

    public String getName() { return name; }
    public int getCost() { return cost; }
    public String getOwner() { return owner; }
    public int getRent() { return rent; }

    public void setName(String name) { this.name = name; }
    public void setCost(int cost) { this.cost = cost; }
    public void setOwner(String owner) { this.owner = owner; }
    public void setRent(int rent) { this.rent = rent; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Stall stall = (Stall) obj;
        return cost == stall.cost && rent == stall.rent &&
                name.equals(stall.name) && owner.equals(stall.owner);
    }
}

public class Pgm11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stall s1 = new Stall(sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt());
        sc.nextLine();
        Stall s2 = new Stall(sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt());

        if (s1.equals(s2)) {
            System.out.println("Stalls are same");
        } else {
            System.out.println("Stalls are different");
        }
    }
}
