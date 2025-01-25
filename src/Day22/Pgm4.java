package Day22;
class animal{
    void disp()
    {
    }
}
class dog extends animal{
    void disp()
    {
        System.out.println("dog");
    }
}
class cat extends animal{
    void disp()
    {
        System.out.println("cat");
    }
}
public class Pgm4 {
    public static void main(String[] args) {
        cat c = new cat();
        dog d = new dog();
        c.disp();
        d.disp();
    }
}
