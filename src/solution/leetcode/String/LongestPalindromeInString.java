package solution.leetcode.String;

public class LongestPalindromeInString {
    static String longestPalin(String S){
        int len=1,startIndex=0;
        int start,end;
        for (int i = 1; i < S.length(); i++) {

            // for even palindrome -> abba
            start= i-1;
            end = i;
            while (start >=0 && end <= S.length()-1 && S.charAt(start)==S.charAt(end)){
                int tempLen = end - start +1;
                if(tempLen > len){
                    startIndex=start;
                    len=tempLen;
                }
                start--;
                end++;
            }

            // for odd palindrome -> abcba
            start= i-1;
            end = i+1;
            while (start >=0 && end <= S.length()-1 && S.charAt(start)==S.charAt(end)){
                int tempLen = end - start +1;
                if(tempLen > len){
                    startIndex=start;
                    len=tempLen;
                }
                start--;
                end++;
            }

        }

//        System.out.println(len);
        return  S.substring(startIndex,startIndex+len);

    }
}
