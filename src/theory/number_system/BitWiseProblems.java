package theory.number_system;

import org.w3c.dom.ls.LSOutput;

/* Mini Problems List
* is a number even or odd ?
* get non-duplicate where duplicate occurs even times
* set ith bit (to 1)
* get rightmost 1
* get non-duplicate where duplicate occurs defined odd times
* find magic number
* find a^b
* find number of set bits (1's)
* find number of digits
* sum of nth row in Pascal's triangle
* whether a number power of 2 or not ?
* find XOR from 0 to n
* */

public class BitWiseProblems {
    public static void main(String[] args) {
/* find a number odd or even
   whether a number is even or odd is determined by the LSB bit(last bit)
   100010 is even as LSB is 0 and 10011 is odd as LSB is 1
   it's because LSB is 2^0, so it can be odd, others 2^1+2^2+...is definitely even as all of those are power of 2
 */
        int a= 40;
        System.out.println(isEven(a)); // 0 -> even, 1 -> odd

//      find the number which appear once => think of XOR property
        int[] arr = {1,1,1,1,1,1,5,3,3,4,4,4,4,3,3,3,3,3,3}; // but it only works if duplicate number occur even times
        System.out.println(getNonDuplicate(arr));

/*  find ith bit of a number
    100110 -> get 3rd bit, that is 100110 AND 0001 (this is called mask), so to achieve this
    we can use left shift
 */
        int c=10;
//        10 = 1010 AND 0010 -> 0010 = 2
        System.out.println(getIthBit(c,1));

/*  set the ith bit to 1 => means 0->1,1->1
    10 = 1010, set 1st bit to 1 -> 1110 = 14
    so to achieve this, 1010 OR 0100 => 1110
 */
        System.out.println(setIthBitTo1(c,1));

/*  Find the position of the rightmost set bit -> first 1 occur from the right side
    1010110 -> second last
    10 = 00001010
    -10 = 00001010 -> 11110101+1 -> 11110110
    10 AND -10 -> 00001010 AND 11110110 => 00000010 -> 2
 */
        System.out.println(getRightMostOne(10));

    /* Find non-duplicate but here duplicates are occurring 3 times
    2,7,2,5,5,2,5 => so here every number that occurs 3 times , so sum of those must be divisible by 3
        010
        111
        010
        101
        101
        010
        101
        ---
        444 (%3 each digit) [444 = number of set bit (1) in each column
        ----
        111 = 7
     */

//        for simplicity lets consider 4 bit only
        int[] bitArr = {2,7,2,5,5,2,5};
        findNumAppearedOnce(bitArr);

    /* Find nth magic number
    exp => 1 = 001 = 5^3*0+5^2*0+5^1*0 = 5
    exp => 3 = 011 = 5^3*0+5^2*1+5^1*0 = 3
     */
        findNthMagicNumber(6);

    /*        Number of digits in base b of number n
          6d = 1, 6b=3
          general formula : logb(n)+1 => log(n) / log(b) +1 ;here log is basically ln
 */
        System.out.println(noOfDigits(10,2));

    /*
    from Pascal's triangle -> find the sum of nth row
    formula :
    sum of each row = nC0 + nC1 + nC2 + .... + nCn = 2^n
    n=1 1        = 1 (2^0)
    n=2 1 1      = 2 (2^1)
    n=3 1 2 1    = 4 (2^2)
    n=4 1 3 3 1  = 8 (2^3)
    sum of nth row = 2^(n-1) ;starting from index 0
    1 = 0001
    1<< 1 = 10   (2^1)
    1<< 2 = 100  (2^2)
    1<< 3 = 1000 (2^3)
    ans = 1 << (n-1) = 2^(n-1)
     */

    /*
    Find whether a number is a power if 2 or not
    hint : there will be only 1 one -> 10,100,1000,100000
    solution : 1000 = 111+1 => n = (n-1) + 1 , so 1000 & 0111 => 0000 = 0, if 0, then it is power of 2
    formula : n & (n-1)
    * */
//        System.out.println(4 & (4-1));
//
/*  Find a^b
    for exp => 3^6 = 3^110 = (3^4 * 1) * (3^2 * 1) * (3^1 * 0)
    110 -> lsb = 110 & 1 = 0
    110 >> 1 = 11 lsb >> 11 & 1
 */
        System.out.println(findAPowerB(2,8));

    /* Find number of set bits (1's)
    1001 => 2
    1011 => 3
    we know the formula for getting rightmost set bit : n & (-n)
    then just do n-[n & (-n)] while n > 0
    1001 & 0111 -> 0001 => 1001 - 0001 => 1000
    1000 & 1000 -> 1000 => 1000 - 1000 => 0
     */
        System.out.println(numberOfSetBits(45));

    /*  find XOR from 0 till a
     0=0
     0^1= 1
     0^1^2 = 3
     0^1^2^3 = 3^3=0
     0^...^4 = 0^4 = 4
     0^...^5 = 4^5 = 1
     0^...^6 = 1^6 = 7
     0^...^7 = 7^7 = 0
     0^...^8 = 0^8 = 8

     from this we can make the following observation
     if (a % 4) => 0 then ans -> a
     if (a % 4) => 1 then ans -> 1
     if (a % 4) => 2 then ans -> a+1
     if (a % 4) => 3 then ans -> 0

    * */
        System.out.println(findXOR(6));
    }



    private static boolean isEven(int a) {
        return (a &1) == 0;
    }

    private static int getNonDuplicate(int[] arr) {
        int res=0;
        for (int j : arr) {
            res ^= j;
        }
        return res;
    }

    private static int getIthBit(int n,int i) {
        return  n & (1<<i);
    }

    private static int setIthBitTo1(int n,int i) {
        return  n | (1<<i+1);
    }

    private static int getRightMostOne(int n) {
        return  n & -n;
    }

    private static void findNumAppearedOnce(int[] bitArr) {
//        as we're considering only 4 bits
        int[] res = new int[4];

        for (int k : bitArr) {
//            have to store all 1's in bits array
            int mask = 1; // 0001
            for (int j = 3; j >= 0; j--) {
                int bit = k & mask;
                /*
                  for 5,
                  0101 & 0001 => 0001 -> bit[3] = 1
                  0101 & 0010 => 0000 -> bit[2] = 0
                  0101 & 0100 => 0100 -> bit[1] = 1
                  0101 & 1000 => 0000 -> bit[0] = 0
                  this should be done for every number
                 */
                if (bit != 0) {
                    res[j] += 1;
                }

                mask = mask << 1;
            }
        }

        int ans=0;
        /*
        0,4,4,4
        1
        10 +1
        110 +1
        111
        */
        for (int r : res) {
            ans = ans<< 1;
            ans += r % 3;
        }

        System.out.println(ans);

    }

    private static void findNthMagicNumber(int n) {
        /*
        6 -> 110
        110 & 001 -> lsb = 0 ; 0110 >> 1 = 11
        11 & 01 -> lsb = 1 ; 011 >> 1 = 1
        1 & 1 -> lsb =1 ; 01 >> 0
         */
        int ans=0;
        int base=5;
       while (n > 0){
           int lsb = n & 1;
           ans += base * lsb;
           n = n>>1;
           base = base*5;
       }

        System.out.println(ans);
    }

    private static int noOfDigits(int num, int base) {
        return (int) (Math.log(num)/Math.log(base) + 1);
    }

    private static int findAPowerB(int a, int b) {
        int base = a;
        int power =b;
        int ans=1;
//        3^6 => base=3,b=6
        while(power > 0){
            int lsb = power & 1;
            if(lsb ==1 )
            ans *= base ;
            power = power >> 1;
            base *=base;

        }

        return ans;
    }

    private  static  int numberOfSetBits(int n){
//        System.out.println(Integer.toBinaryString(n));

        int count =0;
        while (n > 0){
             n= n & (n-1);
//            or n = n - (n & -n);
            count++;
        }
        return count;

    }

    private static int findXOR(int a) {
        int res = a%4;
        if(res == 0)
            return a;
        else if(res == 1)
            return 1;
        else if(res == 2)
            return a+1;
        else return 0;

    }

}
