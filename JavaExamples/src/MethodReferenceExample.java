import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static Employee createEmployee(String csvLine) {
        String[] parts = csvLine.split(",");
        return new Employee(parts[0], parts[1], Double.parseDouble(parts[2]));
    }

    public String getFormattedInfo() {
        return String.format("%s (%s): $%.2f", name, department, salary);
    }

    public boolean isHighEarner() {
        return salary > 70000;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', dept='" + department + "', salary=" + salary + "}";
    }
}

class EmployeeService {
    public void processEmployee(Employee employee) {
        System.out.println("Processing: " + employee.getName());
    }

    public boolean validateEmployee(Employee employee) {
        return employee.getName() != null && !employee.getName().isEmpty();
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        // CSV data simulation
        List<String> csvData = Arrays.asList(
                "Alice,IT,75000",
                "Bob,HR,65000",
                "Charlie,IT,80000",
                "Diana,Finance,70000");

        EmployeeService service = new EmployeeService();

        // 1. Constructor reference - Create employees from CSV
        List<Employee> employees = csvData.stream()
                .map(Employee::createEmployee) // Static method reference
                .collect(Collectors.toList());

        System.out.println("=== All Employees ===");
        employees.forEach(System.out::println); // Method reference to println

        // 2. Instance method reference - Get formatted info
        System.out.println("\n=== Formatted Employee Info ===");
        employees.stream()
                .map(Employee::getFormattedInfo) // Instance method reference
                .forEach(System.out::println);

        // 3. Instance method reference with specific object
        System.out.println("\n=== Processing Employees ===");
        employees.stream()
                .filter(service::validateEmployee) // Method reference to service object
                .forEach(service::processEmployee); // Method reference to service object

        // 4. Method reference for filtering
        System.out.println("\n=== High Earners ===");
        List<Employee> highEarners = employees.stream()
                .filter(Employee::isHighEarner) // Instance method reference
                .collect(Collectors.toList());
        highEarners.forEach(System.out::println);

        // 5. Method reference for sorting
        System.out.println("\n=== Sorted by Name ===");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName)) // Method reference in comparator
                .forEach(System.out::println);

        // 6. Method reference for grouping
        System.out.println("\n=== Grouped by Department ===");
        Map<String, List<Employee>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment)); // Method reference

        byDepartment.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList.size() + " employees");
        });
    }
}