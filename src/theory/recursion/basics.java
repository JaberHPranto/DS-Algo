package theory.recursion;

public class basics {
    public static void main(String[] args) {
//     print(1);
        System.out.println(fibonacchi(6));
    }

//  recursion function -> the function that call itself
//  time complexity of recursion is not constant because of recursive calls
    private static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }

//        if i call a func again and again, it is treated as separate function call in the stack
//        means even the function we are calling each time is same, but it will take separate memory
        System.out.println(n);
//        this is called tail recursion as this is the last function call
        print(n+1);
    }


//    fibo(n) = fibo(n-2) + fibo(n-1)  => recurrence relation
    static int fibonacchi(int n){
        if(n < 2)
            return n;
        else
            return fibonacchi(n-2)+fibonacchi(n-1);
    }

}
