package solution.leetcode;

public class arr_1295 {
//    format 1
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            String s= Integer.toString(n);
            if(s.length()%2==0) count++;
//            or (int)(Math.log10(a)+1) gives num of digits
        }
        return  count;
    }

//    format 2
    public int _findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            if(evenDigits(n)) count++;
        }
        return  count;

    }

    public boolean evenDigits(int n){
        int count=0;
        if(n==0) return false;
        if(n<0) n=n*-1;
        while (n>0){
            n= n/10;
            count++;
        }
        return count % 2 == 0;
    }


}
