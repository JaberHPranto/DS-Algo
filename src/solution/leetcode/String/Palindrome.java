package solution.leetcode.String;

public class Palindrome {

// abba
// racecar
    static boolean isPalindrome(String str){
        int s = 0;
        int e= str.length()-1;

        while(s <= e){
            if(str.charAt(s)==str.charAt(e)){
                s++;
                e--;
            }
            else return false;
        }


        return true;
    }
}
