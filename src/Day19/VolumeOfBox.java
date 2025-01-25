package Day19;

import java.util.*;
class Box
{
    double width,height,depth;
    Box(double width,double height,double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    void VolumeOfbox()
    {
        System.out.println(width*depth*height);
    }
}
public class VolumeOfBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width=sc.nextDouble();
        double height=sc.nextDouble();
        double depth=sc.nextDouble();
        Box obj = new Box(width, height, depth);
        obj.VolumeOfbox();
    }
}
