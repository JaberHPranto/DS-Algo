package solution.leetcode.Arrays;

import java.util.Arrays;

public class MoveZeroes {
    //    Approach -1
    static void moveZeroesWithTwoPointers(int[] nums) {
        int s=0,e=1;
        int len = nums.length;

        while(s<len || e<len){
            if(nums[s]==0){
                if(e<len && nums[e] !=0){
                    int temp=nums[e];
                    nums[e] = nums[s];
                    nums[s]=temp;
                    s++;
                }
                else if(e<len) {
                    e++;
                }
                else break;
            }
            else {
                s++;
                e++;
            }
        }
    }

    //    Approach -2
    static void moveZeroes(int[] nums) {
        int index=0;

//        bring all non zero element at first
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0)
                nums[index++]=nums[i];
        }

//    now add all zeros
        int numOfZeros = nums.length - index;
        while (numOfZeros>0){
            nums[index++]=0;
            numOfZeros--;
        }

        System.out.println(Arrays.toString(nums));
    }

}
