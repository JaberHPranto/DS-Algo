package solution.leetcode.Arrays;

import java.util.Arrays;

public class Mover_all_zeros_ones_twos {
    //    Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array.
//    The functions should put all 0s first, then all 1s and all 2s in last.

    // Method -1 -> counting all 0,1 an 2's
    static void sort(int[] nums){
        int numOfZeros=0,numOfOnes=0,numOfTwos=0;
        for (int n:nums) {
            switch (n){
                case 0:
                    numOfZeros++;
                    break;
                case 1:
                    numOfOnes++;
                    break;
                case 2:
                    numOfTwos++;
                    break;
            }
        }

        int index=0;
        while (numOfZeros !=0){
            nums[index++]= 0;
            numOfZeros--;
        }
        while (numOfOnes !=0){
            nums[index++]= 1;
            numOfOnes--;
        }
        while (numOfTwos !=0){
            nums[index++]= 2;
            numOfTwos--;
        }

        System.out.println(Arrays.toString(nums));
    }

    // Method -2 -> dutch national flag algo
    /*
    we need 3 pointers -> low: start,mid, high: end
    as we need 0 at first, all numbers before low pointer must be zero, all after high pointer will be 2
    if we find 0, then swap low and mid-numbers; same with 2 but swap with high, just move for 1's
    */
    static void sort_dnf(int[] nums){
        int low=0;
        int mid=0;
        int high= nums.length-1;
        int temp;
//                       l           h
//        0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 2, 2
//                                      m
        while(mid <=high){
            if(nums[mid]==0){
                temp=nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                temp=nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
