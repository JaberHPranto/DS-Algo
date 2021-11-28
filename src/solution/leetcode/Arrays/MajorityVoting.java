package solution.leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityVoting {
    static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int n= nums.length;
        for (int key : nums) {
            if (hm.containsKey(key)) {
                int val = hm.get(key);
                hm.put(key, val + 1);
            } else hm.put(key, 1);
        }

        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue() > (n/2))
                return e.getKey();
        }
        return -1;
    }

    static int mooreMajorityVoteAlgorithm(int[] nums){
        int major=nums[0];
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }
            else if(nums[i]==major){
                count++;
            }
            else {
                count--;
            }
        }

        return major;
    }
}
