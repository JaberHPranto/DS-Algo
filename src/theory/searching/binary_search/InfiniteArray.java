package theory.searching.binary_search;

public class InfiniteArray {
//    search in infinite array

    public static void main(String[] args) {
        int[] nums = {3,5,7,10,12,15,18,21,29,30,33,37,40,45,52,78,190,212,312,445};
        System.out.println(ans(nums,21));
    }

    static int ans(int[] arr, int target){
//        first start with box of 2 as we don't know array length
        int start = 0;
        int end = 1;

//        condition for target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
//            double the chunk/box size -> end = previous end + 2 * box_size
            end = end + (end-start+1)*2;
            start = newStart;
        }

        return binary_search(arr,target,start,end);
    }

    static int binary_search(int[] arr, int target,int start,int end) {


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target)
                start = mid + 1;

            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else return mid;
        }
        return -1;
    }
}
