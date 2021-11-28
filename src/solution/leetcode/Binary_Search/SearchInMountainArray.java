package solution.leetcode.Binary_Search;

interface MountainArray {
     int get(int index);
     int length();
  }

class SearchInMountainArray {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakElement =  peakIndexInMountainArray(mountainArr);
        int leftHalf = agonsticBinarySearch(mountainArr,target,0,peakElement);
        if(leftHalf != -1){
            return leftHalf;
        } else {
            return agonsticBinarySearch(mountainArr,target,peakElement+1,mountainArr.length()-1);
        }
    }


    static int peakIndexInMountainArray(MountainArray mountainArr) {

        int start=0, end= mountainArr.length() -1;

        while (start != end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid+1)){
                start = mid + 1;
            }

            else if (mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            }

        }
        return end;
    }


    static int agonsticBinarySearch( MountainArray mountainArr, int target,int start,int end)     {

        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end){
            int mid = start + (end-start)/2;
            int arr_mid = mountainArr.get(mid);

            if(arr_mid == target) return mid;

            if(isAsc){
                if(target > arr_mid){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(target > arr_mid){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
