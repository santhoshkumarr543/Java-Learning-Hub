package Day19;

import java.util.*;
class BMI
{
    private double weight;
    private double height;
    //private double bmi;
    //private String grade;
    BMI(double weight,double height)
    {
        this.weight = weight;
        this.height = height;
//      this.bmi = bmi;
//      this.grade = grade;
    }
    public void BMIcalculator()
    {
        double ans = (weight / (height * height));
        displayBMI(ans);
        //return ans;
    }
    private String calculateGrade(double ans)
    {
        if(ans < 18.5) return "U";
        else if(ans >= 18.5 && ans <= 25.0) return "N";
        else if(ans >= 25.0 && ans < 30.0) return "H";

        return "O";
    }
    public void displayBMI(double ans)
    {
        System.out.println(calculateGrade(ans));
    }
}
public class Pgm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a weight");
        double weight = sc.nextDouble();
        System.out.println("Enter a height");
        double height = sc.nextDouble();
        BMI b = new BMI(weight,height);
        b.BMIcalculator();
    }
}
