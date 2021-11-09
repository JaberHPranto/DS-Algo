package theory.searching.binary_search;

public class basicBinarySearch {

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 9, 11, 12, 14, 19, 21, 40};
        System.out.println(binary_search(nums, 40));

        int[] desc_nums = {67,50,45,39,32,25,23,12,6};
//        System.out.println(agonsticBinarySearch(nums,67));
    }

    static int binary_search(int[] arr, int target) {
        if (arr.length == 0) return -1;

//        setting start and end point
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
//            int mid = (start+end)/2; but start+end might exceed the range of int in java
            int mid = start + (end - start) / 2;

//            mid < target -> go to right, change start,unchanged end
            if (arr[mid] < target) {
                start = mid + 1;
//                for desc array -> end = mid-1
            }

//            mid > target -> go to left, unchanged start,change end
            else if (arr[mid] > target) {
                end = mid - 1;
//                for desc array -> start = mid+1
            }
//            mid == target -> got the element
            else return mid;
        }
        return -1;
    }


/*  Order agnostic binary search -> I've given a sorted array but don't know whether is sorted in ascending or
descending order.
best way to check this compare first and last element as if we take any two element they might be equal. If first and
 last element is same, then the array is just consist of same number
 if start el > ene el => descending
 if start el < ene el => ascending
* */

    static int agonsticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target) return mid;

            if(isAsc){
                if(target > arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }


    static int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
}