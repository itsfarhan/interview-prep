public class MethodsExample {
    
    //Method overloading
    public int multiply(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
        return 0;
    }
    public int multiply(double a, double b){
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
        return 0;
    }

    //Static methods
    public static void staticMethod(){
        System.out.println("This is a static method");

        //class.staticMethod();
    }

    //Recursive methods
    public int factorial(int n){
        if(n == 0) return 1;
        else return n * factorial(n-1);
    }

    //Pass-by-value
    public static void changeValue(int n) {
        n = 10;

        //a = 5;
        //sout -> changeValue(x);
        //output = 5
    }
}
