public class StaticExample {
    static int counter = 0;

    static{
        counter = 10;
        System.out.println(counter);
    }

    public static void incrementCounter(){
        counter++;
        System.out.println(counter);
    }

    public static void main(String[] args) {
        StaticExample.incrementCounter(); //Same class, thats why it's static.
    }
}
