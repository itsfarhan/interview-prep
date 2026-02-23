class Employees{
    void work(){
        System.out.println("Parent Class method");
    }
}

class Manager extends Employees{
    void manage(){
        System.out.println("Child class method");
    }
}

public class UpDownCastingExample {
    public static void main(String[] args) {
        Employees employees = new Manager(); // Upcasting
        employees.work(); // parent class method

        if (employees instanceof Manager){ // Checking if employee is an instance of Manager
            Manager manager = (Manager) employees; // Downcasting
            manager.manage(); // child class method
        }
    }
}
