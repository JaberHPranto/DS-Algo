package solution.leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*  Approach
    first sort the array
    after sorting : [[1,3],[2,6],[8,10],[15,18]]
    take first pair : [1,3] and check whether next pair is in the interval or not
    as pairs are already sorted, so interval must be contiguous

    after finishes finding the interval, put those in a new array
*/
public class MergeIntervals {
    int[][] merge(int[][] intervals) {
//        list for storing merged intervals
        List<int[]> list = new ArrayList<>();

//        ascending sort based on first element of the pair
        Arrays.sort(intervals,(a, b)-> a[0]-b[0]);

//        first interval as default pair
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] interval:intervals){
            if(interval[0] <= end){
                end = Math.max(interval[1],end);
            }else{
                list.add(new int[]{start,end});
                start = interval[0];
                end = interval[1];
            }
        }

//        for last interval
        list.add(new int[]{start,end});

        return list.toArray(new int[list.size()][]);
    }
}
