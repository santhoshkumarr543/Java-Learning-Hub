package day5;
import java.util.Scanner;

public class Carparking {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] nums = new int[r][c];
        for(int i = 0;i<nums.length;i++) {
            for(int j = 0;j<nums[i].length;j++){
                nums[i][j] = sc.nextInt();
            }
        }System.out.println(meth(nums));
    }

    public static int meth(int[][] nums) {
        int cnt = 0;
        int max = 0;
        int res = 0;
        for(int i = 0;i<nums.length;i++) {
            for(int j = 0;j<nums[i].length;j++){
                if(nums[i][j] == 1) cnt++;
            }if(max < cnt) {
                max = cnt;
                res = i;
            }
        }
        return res+1;
    }
}