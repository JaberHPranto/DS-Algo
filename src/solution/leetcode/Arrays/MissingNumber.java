package solution.leetcode.Arrays;

import java.util.HashSet;

public class MissingNumber {
    // using frequency array
    static int missingNumber__sol_1(int[] nums) {
        int freq_arr[] = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            freq_arr[nums[i]] = 1;
        }

        for (int i = 0; i < freq_arr.length; i++) {
            if(freq_arr[i] != 1)
                return i;
        }

        return -1;
    }

    // using hashset
    static int missingNumber__sol_2(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int n:nums)
            set.add(n);
        for (int i = 0; i < nums.length+1; i++) {
            if(!set.contains(i))
                return i;
        }
        return -1;
    }

    // using XOR
    static int missingNumber__sol_3(int[] nums){
        // nums -> 3,0,1 for-loop -> 0,1,2,3
        int ans=0;
        for (int n:nums) {
            ans ^= n;
        }
        for (int i = 0; i < nums.length+1; i++) {
            ans ^= i;
        }
        return ans;
    }
}
