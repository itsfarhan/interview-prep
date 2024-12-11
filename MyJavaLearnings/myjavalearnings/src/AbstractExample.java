abstract class SoftwareEngineer{
    abstract void doWork(); // abstract method -> PS: you can't create abstract method without abstract class.

    void login(){
        System.out.println("SoftwareEngineer class -> Parent class");
    }
}

class Developer extends SoftwareEngineer{
    @Override
    void doWork(){
        System.out.println("Developer class -> Child class");
    }
}

class Tester extends SoftwareEngineer{
    @Override
    void doWork(){
        System.out.println("Tester class -> Child class");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer1 = new Developer(); // Upcasting
        SoftwareEngineer softwareEngineer2 = new Tester(); // Upcasting
        softwareEngineer1.doWork(); // Developer class -> Child class
        softwareEngineer2.doWork(); // Tester class -> Child class
    }
}
