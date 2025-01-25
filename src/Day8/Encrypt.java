package Day8;
import java.util.*;
public class Encrypt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int k=sc.nextInt();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.print(" ");
            }else{
                int x=(int)str.charAt(i);
                System.out.print((char)(x+k));
            }
        }
    }
}