package solution.leetcode.Binary_Search;

class PeakInMountainArray {
    public int peakIndexInMountainArray(int[] nums) {
//        same type of question bs_162
        //        here for this we have to find the max element. Element before max element is sorted in
//        ascending/increasing order and Element before max element is sorted in
////        descending/increasing order
//        0,10,5,2 -> m= 1 [10] ,s=0,e=3 ;  s=0,e=1,m=0; s=1,e=1
//        1,3,5,6,12,11,10,8,5,2


        int start=0, end= nums.length-1;
        if(nums.length==1) return 0;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= nums[mid+1]){
                start = mid + 1;
            }

            else if (nums[mid] > nums[mid+1]) {
                end = mid;
            }

        }
        return end;
    }
}
