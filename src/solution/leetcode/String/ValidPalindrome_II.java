package solution.leetcode.String;

public class ValidPalindrome_II {

    // if start and end character doesn't match, check rest characters after start and before end palindrome or not
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() -1;
        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                return checkPalindrome(s,start,end-1) || checkPalindrome(s,start+1,end);
            }
            start++;
            end--;
        }

        return true;
    }

    static boolean checkPalindrome(String s,int start,int end){
        while (start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
