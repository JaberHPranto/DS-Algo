package solution.leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();

        for(int candy:candies){
            if((candy + extraCandies)>= max){
                list.add(true);
            } else list.add(false);
        }
        return list;
    }
}
