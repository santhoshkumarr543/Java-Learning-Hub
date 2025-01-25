package Day21;

import java.util.Scanner;

class book
{
    String title;
    String author;
    public book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public void disp() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class mybook extends book
{
    int price;
    public mybook(String title, String author,int price)
    {
        super(title,author);
        this.price = price;
    }
    public void disp() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("price: " + price);
    }
}
public class Pgm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter book details " );
        String title = sc.next();
        String author = sc.next();
        int price = sc.nextInt();
        mybook mb = new mybook(title,author,price);

        mb.disp();
    }
}
