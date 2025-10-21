package Recursions;

public class Fibanocci {
    public static int fibanocci(int n){
        // Base case
        if (n <= 0) return 0;
        if (n <= 1) return 1;

        // Recursive case
        return fibanocci(n-1)+fibanocci(n-2);
    }
    public static void main(String[] args) {
        int n=6;
        int result = fibanocci(n);
        System.out.println("Fibanocci of "+n+" is: "+result);
    }
    //explain how 8 is derived from fib(6)
    //fib(6) = fib(5) + fib(4)
    //fib(5) = fib(4) + fib(3)
    //fib(4) = fib(3) + fib(2)
    //fib(3) = fib(2) + fib(1)
    //fib(2) = fib(1) + fib(0)
    //fib(1) = 1
    //fib(0) = 0
    //So,
    //fib(2) = 1 + 0 = 1
    //fib(3) = 1 + 1 = 2 
    //fib(4) = 2 + 1 = 3
    //fib(5) = 3 + 2 = 5
    //fib(6) = 5 + 3 = 8

}