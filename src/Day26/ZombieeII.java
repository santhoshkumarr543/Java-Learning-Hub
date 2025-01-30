package Day26;

import java.util.*;

public class ZombieeII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a our energy : ");
        int energy = sc.nextInt();
        System.out.println("Enter a our no of zoombies : ");
        int z = sc.nextInt();
        int[] arr = new int[z];
        for (int i = 0; i < z; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(find(energy, z, arr));
    }

    public static String find(int energy, int z, int[] arr) {
        // TODO: Implement logic here
        for(int i = 0;i < z;i++)
        {
            int cal = arr[i] % 2 + arr[i] / 2;
            if(cal > energy) return "No";
            else energy -= cal;
        }
        return "Yes";
    }
}