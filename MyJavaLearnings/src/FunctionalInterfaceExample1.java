import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Employee{name: '" + name + "', department: '" + department + "', salary: $" + salary + "/-}";
    }
}

public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
          new Employee("Farhan", "Dev", 20000),
          new Employee("Ahmed", "Dev", 20000),
          new Employee("Pavan", "QA", 10000),
          new Employee("Alfred", "QA", 15000),
          new Employee("Ravi", "Manager", 30000),
          new Employee("Julian", "Finance", 15000)
        );

        //1. Filter Employees by Department (Predicate)
        // Syntax - Predicate<List ClassName> predicate = (Object) -> condition
        Predicate<Employee> isDev = emp -> "Dev".equals(emp.getDepartment());
        System.out.println("Developers");
        employees.stream()
                .filter(isDev)
                .forEach(System.out::println); // 
        
        // 2. Calculate Bonus for Employees (Function)
        // Syntax - Function<List ClassName> function = (Object) -> expression
        Function<Employee, Double> calculateBonus = emp -> emp.getSalary() * 0.10;
        System.out.println("\nEmployee Bonuses");
        employees.forEach(emp -> System.out.println(emp.getName() +": "+ calculateBonus.apply(emp)));
        System.out.println();

        // 3. Give Increment to All Employees (Consumer)
        // Syntax - 
        Consumer<Employee> giveIncrement = emp -> emp.setSalary(emp.getSalary() + calculateBonus.apply(emp));
        employees.forEach(giveIncrement);
        System.out.println("Employees after increment: ");
        employees.forEach(System.out::println);

        List<Employee> sortedBySalary = employees.stream()
                                                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                                                .collect(Collectors.toList());
                                                System.out.println("\\nEmployees sorted by salary:");
                                                sortedBySalary.forEach(System.out::println);
    }
}
