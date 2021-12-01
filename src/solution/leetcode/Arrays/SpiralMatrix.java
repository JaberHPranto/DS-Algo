package solution.leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
//       row-pointers
        int t = 0, b = m - 1;
//       column pointers
        int l = 0, r = n - 1;

//         direction; dir=0 -> top ; dir=1 -> right ; dir=2 -> bottom ; dir=3 -> left
        int dir = 0;
        int i;

        while (t <= b && l <= r) {
            if (dir == 0) {
                for (i = t; i <= r; i++) {
                    list.add(matrix[t][i]);
                }
                t++;
                dir = 1;
            } else if (dir == 1) {
                for (i = t; i <= b; i++) {
                    list.add(matrix[i][r]);
                }
                r--;
                dir = 2;

            } else if (dir == 2) {
                for (i = r; i >= l; i--) {
                    list.add(matrix[b][i]);
                }
                b--;
                dir = 3;
            } else {
                for (i = b; i >= t; i--) {
                    list.add(matrix[i][l]);
                }
                l++;
                dir = 0;
            }

        }

        return list;
    }
}
