package solution.leetcode.String;

import java.util.Arrays;

public class LongestCommonPrefix {

    // sorting the array in dictionary order, so first and last array will have most number of differences
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==1)return strs[0];
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length-1];

        for(int i=0;i< start.length();i++){
            if(end.length() > i && start.charAt(i)==end.charAt(i))
                ans.append(start.charAt(i));
            else return ans.toString();
        }

        return ans.toString();
    }
}
