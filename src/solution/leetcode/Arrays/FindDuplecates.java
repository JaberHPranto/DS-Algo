package solution.leetcode.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplecates {
    //    Approach -1 : Using Hashmap
    static List<Integer> findDuplicatesWithHashMap(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else hm.put(num, 1);
        }
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue() > 1)
                list.add(entry.getKey());
        }
        return list;
    }

    //    Approach -2
    // when find a number i, flip the number at position i-1 to negative.
//     0 based index, no negative values and all in range 0 to n
    // if the number at position i-1 is already negative, 'i' is the number that occurs twice.
    /*
     [4,3,2,7,8,2,3,1] -> here both 2 will point to same location, if we find that negative at some point, then definitely
     any other 2 has occurred before
     */
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(i) - 1;
            if(nums[index] < 0)
                list.add(nums[i]);
            nums[index] = nums[index] * (-1);
        }
        return list;
    }
}
