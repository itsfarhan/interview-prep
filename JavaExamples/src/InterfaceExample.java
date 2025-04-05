interface Printable{
    void print();
}

interface Showable{
    void show();
}

class ExampleInterface implements Printable, Showable{ // Multiple Inheritance
    public void print(){
        System.out.println("-> Abstract print method of interface called by Class using Mulitple Inheritance.");
    }
    public void show(){
        System.out.println("-> Abstract show method of interface called by Class using Mulitple Inheritance.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        ExampleInterface exampleInterface = new ExampleInterface();
        exampleInterface.print();
        exampleInterface.show();
    }
}
