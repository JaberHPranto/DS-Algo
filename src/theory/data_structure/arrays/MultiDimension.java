package theory.data_structure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
*   1 2 3
*   4 5 6
*   7 8 9
*/
        int[][] arr1 = new int[3][];
        int[][] arr ={
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

//        System.out.println(arr.length); // num of the rows
//        System.out.println(arr[2].length); // size of each row

//        for(int row=0;row<arr.length;row++) {
//            for (int col=0;col<arr[row].length;col++) {
////                arr[row][col]=in.nextInt();
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        int[][] foo=new int[3][3];
        for(int row=0;row<foo.length;row++) {
            for (int col=0;col<foo[row].length;col++) {
                foo[row][col]=in.nextInt();
            }
        }
        for (int[] row : foo) {
            System.out.println(Arrays.toString(row));
        }
    }
}
