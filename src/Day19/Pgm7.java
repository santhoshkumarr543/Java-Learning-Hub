package Day19;

import java.util.*;
class Time{
    int hour;
    int minutes;
    int seconds;
    Time(int hour,int minutes,int seconds)
    {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public static void calculate(Time t1,Time t2)
    {
        int sectemp = t1.seconds + t2.seconds;
        int mintemp = t1.minutes + t2.minutes;
        int houtemp = t1.hour + t2.hour;
        int secans = (sectemp % 60);
        int minans = (mintemp % 60) + (sectemp / 60);
        int houans = (houtemp % 12) + (mintemp / 60);
        System.out.println(houans + " " + minans + " " + secans);
    }
}
public class Pgm7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time minute seconds for 1st");
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        Time t1 = new Time(hour,minutes,seconds);
        System.out.println("Enter time minute seconds for 2nd");
        int hour2 = sc.nextInt();
        int minutes2 = sc.nextInt();
        int seconds2 = sc.nextInt();
        Time t2 = new Time(hour2,minutes2,seconds2);
        Time.calculate(t1,t2);
    }
}
