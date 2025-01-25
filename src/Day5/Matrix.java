package day5;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][m];

        meth(nums);
    }

    public static void meth(int[][] nums) {
        for(int i = 0;i<nums.length;i++) {
            for(int j = 0;j<nums[i].length;j++) {
                nums[i][j] = i+j;
            }
        }

        for(int row[] : nums) {
            System.out.println(Arrays.toString(row));
        }
    }
}