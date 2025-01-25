package Day8;
import java.util.*;

public class Tea{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int n=sc.nextInt();
        if(ch=='c'){
            if(n==1){
                System.out.println("welcome to ccd");
                System.out.println(" enjoy your Espresso coffee");
            }else if(n==2){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your cappucino coffee");
            }else if(n==3){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your Latte coffee");
            }
        }else if(ch=='t'){
            if(n==1){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your plain tea");
            }else if(n==2){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your Assam tea");
            }else if(n==3){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your ginger tea");
            }else if(n==4){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your cardomom tea");
            }else if(n==5){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your masala tea");
            }else if(n==6){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your lemon tea");
            }else if(n==7){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your green tea");
            }else if(n==8){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your darjeeling tea");
            }else{
                System.out.println("invalid output!");
            }
        }else if(ch=='s'){
            if(n==1){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your hot and sour soup");
            }else if(n==2){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your veg corn soup");
            }else if(n==3){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your tomato soup");
            }else if(n==4){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your spicy soup");
            }else{
                System.out.println("invalid output!");
            }
        }else if(ch=='b'){
            if(n==1){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your hotchocolate");
            }else if(n==2){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your badam drink");
            }else if(n==3){
                System.out.println("welcome to ccd");
                System.out.println("enjoy your badam pista drink");
            }else{
                System.out.println("invalid output!");
            }
        }else{
            System.out.println("invalid output!");
        }
    }
}