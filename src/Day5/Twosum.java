package day5;
import java.util.HashMap;
import java.util.Scanner;

public class Twosum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print(meth(target,nums));

    }

    public static int meth(int target,int[] nums) {
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++) {
            int req_num = target - nums[i];

            if(map.containsKey(req_num)) cnt++;
            map.put(nums[i], i);
        }
        return cnt;
    }

}