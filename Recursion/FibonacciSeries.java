package Recursion;

public class FibonacciSeries {
    public static int fibonacci(int n){
        //formula for fibonacci series is f(n) = f(n-1) + f(n-2) and f(0) =0, f(1) = 1
        //recursion work like stack so
        //for f(0) = 0;
        if(n <= 0) return 0;
        //for f(1) = 1;
        if(n == 1) return 1;
        //for f(n) = f(n-1) + f(n-2)
        return fibonacci(n-1) + fibonacci(n-2);

    }
    public static void main(String [] args){
        System.out.println(fibonacci(4));
        //          fibonacci(4)
        //            /      \
        //     fibonacci(3) + fibonacci(2)
        //       /      \      /     \
        //fibonacci(2) + 1 +  1   +   0;
        //     /  \      |    |       |
        //    1  + 0 +   1 +  1   +   0;
    }
}
