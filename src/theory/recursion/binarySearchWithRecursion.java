package theory.recursion;

public class binarySearchWithRecursion {
    public static void main(String[] args) {
        int[] nums = {2,6,14,21,33,36,40,48};
        int target = 41;
        System.out.println(binarySearch(nums,target,0,nums.length-1));
    }

    static int binarySearch(int[] nums, int target, int s, int e) {
        if(s > e)
            return -1;

        int m = s+(e-s)/2;
        if(nums[m]==target)
            return m;

        if(target < nums[m])
            return binarySearch(nums,target,s,m-1);

        return binarySearch(nums,target,m+1,e);
    }
}
