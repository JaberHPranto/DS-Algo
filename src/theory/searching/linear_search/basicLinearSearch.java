package theory.searching.linear_search;

import java.util.Arrays;

public class basicLinearSearch {
    public static void main(String[] args) {
        int[] arr ={12,45,40,56,68};
//        System.out.println(getElement(arr,40));
        

        int[][] arr2D={
                {44,3,4,12},
                {47,22,56},
                {67,89,94,32}
        };

        System.out.println(Arrays.toString(searchIn2D(arr2D, 89)));
    }

//    found an element in array
    static int getElement(int[] arr,int target){
        if(arr.length==0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) return i;
        }

        return -1;
    }

    static int[] searchIn2D(int[][] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
