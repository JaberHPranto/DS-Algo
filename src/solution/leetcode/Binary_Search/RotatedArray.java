package solution.leetcode.Binary_Search;

class RotatedArray {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1) {
//            then array is not rotated, normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }

        else if (nums[pivot] == target) return pivot;

        else if (nums[0] <= target)
//            search in left of pivot
            return binarySearch(nums,target,0,pivot-1);
        else// serach in right of pivot
            return binarySearch(nums,target,pivot+1,nums.length-1);

    }


    int findPivot(int[] arr){
        int start = 0,end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            else if(mid > start && arr[mid] < arr[mid-1])
                return mid-1;

            else if (arr[mid] <= arr[start])
                end=mid-1;
            else start = mid+1;
        }
        return -1;
    }

//    A variation with duplicates  [5,5,5,5,9,2,2,2] => here s,m,e all are same element
//    so try to remove duplicates as much as u can
int findPivotWithDuplicates(int[] arr){
    int start = 0,end = arr.length-1;

    while(start <= end){
        int mid = start + (end-start)/2;

        if(mid < end && arr[mid] > arr[mid+1])
            return mid;
        else if(mid > start && arr[mid] < arr[mid-1])
            return mid-1;

//        if start,mid and end are same, ignore those
        if(arr[start]==arr[mid] && arr[mid]==arr[end]){
//            but what if this value is actually pivot
            if(arr[start]>arr[start+1]){
                return start;
            }
            else if(arr[end] < arr[end-1]){
                return end-1;
            }
        }

        else if(arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end]))
            start=mid+1;
        else end=mid-1;
    }
    return -1;
}

    int binarySearch(int[] arr, int target,int start, int end) {

        while (start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target) return mid;

            if(target > arr[mid]){
                start = mid+1;
            }

            if(target < arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }

}
