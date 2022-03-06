package solution.leetcode.String;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // String res = "";
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        while(i>=0 || j>=0 || carry !=0){
            int i_val = i >=0 ? num1.charAt(i) - '0' : 0;
            int j_val = j >=0 ? num2.charAt(j) - '0' : 0;

            int sum = i_val + j_val + carry;

            // res = (sum % 10) + res;
            ans.append(sum % 10);
            carry = sum/10;

            i--;
            j--;
        }

        return ans.reverse().toString();

    }
}
