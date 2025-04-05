import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeList implements Comparable<EmployeeList>{
    private int id;
    private String name;
    private int age;
    private double salary;

    public EmployeeList(int id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }

    @Override
    public int compareTo(EmployeeList other){
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + ", age=" + age + "}";
    }
}

public class ComparableVsCompartor {
    public static void main(String[] args) {
        List<EmployeeList> employeeList = Arrays.asList(
            new EmployeeList(1, "John", 25, 5000.0),
            new EmployeeList(3, "Jane", 30, 6000.0),
            new EmployeeList(5, "Bob", 20, 4000.0),
            new EmployeeList(4, "Alice", 35, 7000.0)
        );
        System.out.println("Sorted List: ");
        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);

        System.out.println("Sorted by salary: ");
        employeeList.sort(Comparator.comparingDouble(EmployeeList::getSalary));
        employeeList.forEach(System.out::println);

        System.out.println("Sorted by age:");
        employeeList.sort(Comparator.comparingInt(EmployeeList::getId));
        employeeList.forEach(System.out::println);
    }
}
