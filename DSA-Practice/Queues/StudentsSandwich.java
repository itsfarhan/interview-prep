package Queues;

import java.util.LinkedList;
import java.util.Queue;

// Problem: Number of Students Unable to Eat Lunch

// Problem Statement
// Students are standing in a queue, and there is a stack of lunch sandwiches.

// Each student can only eat a specific type of sandwich:
    // 0 represents a circular sandwich.
    // 1 represents a square sandwich.
// The students are standing in a queue in the order they appear, and sandwiches are placed in a stack.

// If a student at the front of the queue cannot eat the sandwich at the top of the stack, they will move to the end of the queue.
// This process continues until either:
// Everyone is fed, or
// No one in the queue wants the sandwich at the top of the stack.
// Your task is to return the number of students who are unable to eat.

// Example 1

// Input:
// students = [1, 1, 0, 0]  
// sandwiches = [0, 1, 0, 1]

// Output:
// 0

// Explanation:
// The first student cannot eat the sandwich at the top, so they move to the back of the queue.
// Process continues until all students get their preferred sandwich.

// Example 2

// Input:
// students = [1, 1, 0, 0]  
// sandwiches = [0, 0, 1, 1]

// Output:
// 2

// Explanation:
// The first two students (preferring square sandwiches) move to the back of the queue.
// After some rotations, no one wants the circular sandwich at the top.

// Approach

// Use a queue for students since they are processed in FIFO order.
// Use a stack for sandwiches because they are processed in LIFO order.
// Track how many students are unable to eat:
// If all students cycle through the queue without taking the top sandwich, stop the loop.

// Algorithm

// Create a queue from students and use sandwiches as a stack.
// Keep a counter count to track how many consecutive students have been processed without eating.
// While count < size of students:
// Check if the student at the front of the queue can eat the sandwich at the top of the stack:
// Yes: Remove the student and the sandwich. Reset count.
// No: Move the student to the back of the queue and increment count.
// If count == size of students, break the loop (no one can eat).
// Return the size of the remaining queue.


public class StudentsSandwich {
    public int countStudents(int []students, int[] sandwiches){
        Queue<Integer> queue = new LinkedList<>();
        // Add all students to the queue
        for (Integer student : students) {
            queue.add(student);
        }

        int index = 0;
        int count = 0;

        while(!queue.isEmpty() && count < queue.size()){ // If count equals the size of the queue, it means no student can eat the top sandwich
            if(queue.peek() ==  sandwiches[index]){
                queue.poll();
                index++;
                count = 0;
            } else {
                queue.add(queue.poll());
                count++;
            }
        }
        return queue.size();
    }
    
    public static void main(String[] args) {
    StudentsSandwich solution = new StudentsSandwich();

    // Test Case 1
    int[] students1 = {1, 1, 0, 0};
    int[] sandwiches1 = {0, 1, 0, 1};
    System.out.println(solution.countStudents(students1, sandwiches1)); // Output: 0

    // Test Case 2
    int[] students2 = {1, 1, 0, 0};
    int[] sandwiches2 = {0, 0, 1, 1};
    System.out.println(solution.countStudents(students2, sandwiches2)); // Output: 2

    // Test Case 3
    int[] students3 = {1, 0, 1};
    int[] sandwiches3 = {0, 1, 0};
    System.out.println(solution.countStudents(students3, sandwiches3)); // Output: 1
    }    
}

/*
Complexity Analysis
=======================
Time Complexity:
-----------------------
Each student can be processed at most twice (added back to the queue).
Total: O(n), where 𝑛 is the number of students.

Space Complexity:
-----------------------
Queue stores O(n) students.
Total: O(n).

 */