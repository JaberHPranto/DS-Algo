package theory.number_system;

public class BitWiseBasics {
//    AND operator -> if we AND any number with all 1's we get the same number
//    exp => 10111011 AND 11111111 -> 10111011

//    XOR operator -> if we XOR any number with 1, we get its complement value
/*    exp => a^1 ->  a's complement, a
             a^0 -> a
             a^a -> 0
 */

/*  Left Shift operator
     10d = 1010b
     10 << 1 -> 10100 = 20d
     so if when we left shift any number, we'll get double of that number
     a<<1 = 2a
     general rule : a << b = a * 2^b
 */

/*  Right Shift operator
     001101 >> 1 -> 00110 (last bit dropped) ~= 110
     so right shift divide the number by 2
     20d =  10100b = 10100 >> 1 = 1010b = 10d

 */
}
