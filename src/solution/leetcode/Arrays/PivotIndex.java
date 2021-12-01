package solution.leetcode.Arrays;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int forwardSum=0;
        int prevSum=0;

        for(int n:nums)
            forwardSum +=n;

        for (int i = 0; i < nums.length; i++) {
            forwardSum -=nums[i];
            if(forwardSum == prevSum)
                return i;
            prevSum += nums[i];
        }


        return -1;
    }
}


/*

1,7,3,6,5,6
total= 28
p=1+7=8+3=11
f=28-1=27-7=20-3=17-6=11

*/

