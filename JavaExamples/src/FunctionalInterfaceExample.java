@FunctionalInterface
interface Myinterface{
    void abstractMethod(String message);

    default void defaultMethod(String message){
        System.out.println("-> Default method called with message: " + message);
    }

    static void staticMethod(String message){
        System.out.println("-> Static method called with message: " + message);
    }
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Myinterface myinterface = (message) -> System.out.println(message);

        myinterface.abstractMethod("-> Lambda called using Abstract method of Functional Interface");
        
        myinterface.defaultMethod("This method is default");

        Myinterface.staticMethod("This method is static");

    }
}
