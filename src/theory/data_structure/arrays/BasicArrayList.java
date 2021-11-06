package theory.data_structure.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BasicArrayList {
//    This is dynamic array. Array has fixed size but ArrayList is dynamic.
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(23);
        list1.add(82);
        list1.add(39);
        list1.add(28);
        list1.add(94);

        System.out.println(list1);
        System.out.println(list1.contains(82));

//        for (int i = 0; i < 3; i++) {
//            list2.add(in.nextInt());
//        }
//
//        System.out.println(list2);

//        multidimensional ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//        initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

//       taking input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

//        output
        System.out.println(list);
    }
}
