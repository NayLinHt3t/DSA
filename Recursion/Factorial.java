package Recursion;

public class Factorial {
    public static int factorial(int n){
        //base case, when n=1,recursion will stop
        if(n == 1) return 1;
        else{
            //recursion will keep happening(factorial = n * n-1 till 1)
            return n * factorial(n-1);
        }
    }
    public static void main(String [] args){
        System.out.println(factorial(4));
        //4 * factorial(3)
        //4 * 3 * factorial(2)
        //4 * 3 * 2 * factorial(1)
        //4 * 3 * 2 * 1

    }
}
