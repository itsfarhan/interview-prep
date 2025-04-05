public class StaticExample {
    static int counter = 0;

    static{
        counter = 10;
        System.out.println(counter);
    }

    public static void incrementCounter(){
        counter = 10;
        counter++;
        System.out.println(counter);
    }

    public static void main(String[] args) {
        StaticExample.incrementCounter(); //Static method can be called without creating an object. 
        StaticExample.incrementCounter();
        StaticExample.incrementCounter(); //Same class, thats why it's static.
    }
}
