import java.util.TreeSet;

// Employee class implementing Comparable to define custom sorting
class EmployeeRanking implements Comparable<EmployeeRanking>{
    private String empName;
    private int empRank;

    public EmployeeRanking(String empName, int empRank){
        this.empName = empName;
        this.empRank = empRank;
    }
    
    public String getEmpName() {
        return empName;
    }
    
    public int getEmpRank() {
        return empRank;
    }

    // Overriding toString() to display employee details
    @Override
    public String toString() {
        return "EmployeeRanking {Name = " + getEmpName() + ", Rank = " + getEmpRank() + "}";
    }

    // Implementing compareTo() to sort employees by performanceScore in ascending order
    @Override
    public int compareTo(EmployeeRanking other){
        return this.empRank - other.empRank;
    }
}

public class TreeSetExample{
    public static void main(String[] args) {
        TreeSet<EmployeeRanking> employeeRanking = new TreeSet<>();

        //Added Employee names and their rank.
        employeeRanking.add(new EmployeeRanking("farhan", 1));
        employeeRanking.add(new EmployeeRanking("Alice", 3));
        employeeRanking.add(new EmployeeRanking("Bob", 2));
        employeeRanking.add(new EmployeeRanking("Bill", 4));

        // Duplicate Score (This will not be added to output)
        employeeRanking.add(new EmployeeRanking("Tom", 4));

        // Displaying Employees sorted by their rank
        System.out.println("Display Employee Ranking:");
        for (EmployeeRanking employeeRankings : employeeRanking) {
            System.out.println(employeeRankings);
        }
    }
}