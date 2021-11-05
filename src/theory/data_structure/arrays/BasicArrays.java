package theory.data_structure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArrays {
    public static void main(String[] args) {
//        input
        Scanner in = new Scanner(System.in);

// Declaration of Array
        int[] roll_no1 = new int[5];
// or directly
        int[] roll_no2 = {40, 21, 48, 33};

        int[] arr; // declaration -> reference variable is getting defined in stack
        arr = new int[5]; // initialization -> allocated memory space in the heap

// In java array's memory are not continuous as there is no concept of pointer in java. It totally depends on JVM as
// heap and stack maintain by JVM in java
// by default all reference variable set to null
// each particular element in array is a reference variable

//        System.out.println(ros[1]); // -> 0 ; initialize ros array with 0 [0,.....,0]

//        for (int i = 0; i <arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
////        print
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//
//        System.out.println(Arrays.toString(arr));

        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }

        for (String s:str) {
            System.out.println("s = " + s);
        }

    }


}