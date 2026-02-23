import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

class Employee {
    private String name;
    private String department;
    private double salary;
    private int experience;

    public Employee(String name, String department, double salary, int experience) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
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

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', dept='" + department +
                "', salary=" + salary + ", exp=" + experience + "}";
    }
}

public class ParallelStreamRealExample {
    public static void main(String[] args) {
        // Create large employee dataset
        List<Employee> employees = generateEmployees(1_000_000);

        System.out.println("Processing " + employees.size() + " employees...\n");

        // Sequential processing
        long startTime = System.currentTimeMillis();
        Map<String, Double> sequentialAvgSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        long sequentialTime = System.currentTimeMillis() - startTime;
        System.out.println(sequentialAvgSalary);

        // Parallel processing
        startTime = System.currentTimeMillis();
        Map<String, Double> parallelAvgSalary = employees.parallelStream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        long parallelTime = System.currentTimeMillis() - startTime;

        System.out.println("Sequential processing time: " + sequentialTime + "ms");
        System.out.println("Parallel processing time: " + parallelTime + "ms");
        System.out.println("Speedup: " + (double) sequentialTime / parallelTime + "x");

        System.out.println("\nAverage salary by department:");
        parallelAvgSalary.forEach((dept, avg) -> System.out.println(dept + ": $" + String.format("%.2f", avg)));
    }

    private static List<Employee> generateEmployees(int count) {
        Random random = new Random();
        String[] departments = { "IT", "HR", "Finance", "Marketing", "Operations" };
        String[] names = { "Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "Grace", "Henry" };

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String name = names[random.nextInt(names.length)] + i;
            String dept = departments[random.nextInt(departments.length)];
            double salary = 40000 + random.nextDouble() * 60000; // 40k to 100k
            int experience = random.nextInt(20) + 1; // 1 to 20 years

            employees.add(new Employee(name, dept, salary, experience));
        }
        return employees;
    }
}