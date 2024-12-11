// Time Complexity
// ● Access: O(1)
// ● Search: O(n)
// ● Insert: O(1) (at the back of the ArrayList)
// ● Remove: O(n)

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
    }
}

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student name");
                    String name = sc.nextLine();
                    System.out.println("Enter Student Roll Number");
                    int rollNumber = sc.nextInt();
                    student.add(new Student(name, rollNumber));
                    System.out.println("Student added successfully");
                    break;
                
                case 2:
                    System.out.println("Enter Student Roll Number to remove the student: ");
                    int rollNumberToRemove = sc.nextInt();
                    boolean removed = false;
                    for (Student student1 : student) {
                        if (student1.rollNumber == rollNumberToRemove){
                            student.remove(student1);
                            removed = true;
                            System.out.println("Student removed");
                            break;
                        }
                    }
                    if(!removed){
                        System.out.println("Student not found!");
                    }
                    break;
                
                case 3:
                    System.out.println("List of students: ");
                    if(student.isEmpty()){
                        System.out.println("No records Available regarding students");
                    }
                    for(Student student1 : student){
                        System.out.println(student1);
                    }
                    break;
                
                case 4:
                    System.out.println("Exiting the system!");
                    break;
                
                default:
                    System.out.println("Invalid choice, choose again!");
            }
        } while (choice != 4);
            sc.close();
    }
}