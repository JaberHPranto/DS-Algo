package theory.data_structure.arrays;

import java.util.Arrays;

public class PassingFunction {
    // typically, in java we pass we have "pass by reference". That means, we sent object reference to the function as
    // parameter.
    public static void main(String[] args) {
        int[] nums={1,12,34,45};
        System.out.println(Arrays.toString(nums));
//      output ->  [1, 12, 34, 45]
        mutate(nums);  // passing the reference
        System.out.println(Arrays.toString(nums));
//      output ->  [40, 12, 34, 45]
    }
    static void mutate(int[] arr){
//        here arr and nums points to same memory location
        arr[0]=40;
    }
}
