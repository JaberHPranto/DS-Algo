package solution.leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <=i ; j++) {
//                first and last element is always one
                if(j==0 || j==i)
                    list.add(1);

                else{
//                    middle element is sum of j-1 and j element of previous row
                    int firstNum = pascal.get(i-1).get(j-1);
                    int secondNum = pascal.get(i-1).get(j);

                    list.add(firstNum+secondNum);
                }

            }
            pascal.add(list);
        }

        return pascal;
    }
}
