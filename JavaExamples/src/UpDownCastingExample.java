class Employees{
    void work(){
        System.out.println("Work Method of Employee class");
    }
}

class Manager extends Employees{
    void manage(){
        System.out.println("Manage Method of Manager class");
    }
}

public class UpDownCastingExample {
    public static void main(String[] args) {
        Employees employees = new Manager(); // Upcasting
        employees.work(); // Manager accessing Employee class method using Employee reference

        if (employees instanceof Manager){ // Checking if employee is an instance of Manager
            Manager manager = (Manager) employees; // Downcasting
            manager.manage();
        }
    }
}
