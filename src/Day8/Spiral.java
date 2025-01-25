package Day8;

import java.util.Scanner;

public class Spiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The spiral order of the matrix is:");
        find(arr, rows, cols);
    }


    public static void find(int[][] arr,int rows,int cols) {
        // TODO: Implement logic here
        int top = 0 , bottom = rows - 1;
        int left = 0 , right = cols - 1;

        while(top <= bottom && left <= right)
        {

            for(int i = left;i < rows;i++)
            {
                System.out.println();
            }
        }
    }
}