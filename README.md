
# Interview Preparation

I started my career with Java and right now I’m preparing for interviews by revising both **Java basics** and **advanced topics**, along with learning **Spring Boot**.
Along with that, I’m also focusing on **Data Structures and Algorithms** and **System Design**. I’ve been making notes and writing code examples as I learn, so I can refer back to them anytime.

## Quick Links:

### [Java Basics and Advance](#java-basics-and-advance)
### [Springboot](#springboot)
### [Data Structures and Algorithms](#data-structures-and-algorithms)
### [System Design](#system-design)


# Java Basics and Advance
| Java Basics | Java Advance |
|--|--|
| [Classes and Objects](#classes-and-objects) | [Abstract Keyword](#abstract-keyword) |
| [Methods](#methods) | [Inner Class](#inner-class) |
| [Stack and Heap Memory](#stack-and-heap-memory) | [Interface](#interface) |
| [Array](#array) | [Enums](#enums) |
| [Array of Objects](#array-of-objects) | [Anotations](#anotations) |
| [Multi-Dimensional Arrays](#multi-dimensional-arrays) | [Functional Interface](#functional-interface) |
| [Strings](#strings) | [Lambda Expressions](#lambda-expressions) |
| [Static Block, Method, Variable](#static-block-method-variable) | [Exception Handling](#exception-handling) |
| [Encapsulation](#encapsulation) | [Threads](#threads) |
| [Getters and Setters](#getters-and-setters) | [Collections](#collections) |
| [This Keyword](#this-keyword) | [ArrayList](#arraylist) |
| [Naming Convention](#naming-convention) | [LinkedList](#linkedlist) |
| [Anonymous Object](#anonymous-object) | [Vector](#vector) |
| [Inheritance](#inheritance) | [Set](#set) |
| [Super Keyword](#super-keyword) | [Map](#map) |
| [Method Overriding](#method-overriding) | [Queue](#queue) |
| [Packages](#packages) | [Comparator vs Comparable](#comparator-vs-comparable) |
| [Access Modifiers](#access-modifiers) | [Stream API](#stream-api) |
| [Polymorphism](#polymorphism) | [Map/Filter/Reduce/Sorted](#mapfilterreducesorted) |
| [Dynamic Method Dispatch](#dynamic-method-dispatch) | [Parallel Stram](#parallel-stram) |
| [Final Keyword](#final-keyword) | [forEach Method](#foreach-method) |
| [ObjectClass/equals/toString/Hashcode](#objectclassequalstostringhashcode) | [Optional Class](#optional-class) |
| [Upcasting and Downcasting](#upcasting-and-downcasting) | [Method Reference](#method-reference) |
| [Wrapper Class](#wrapper-class) | [Constructor Reference](#constructor-reference) |


# SpringBoot


# Data Structures and Algorithms
-----------
## Arrays
## Stacks
## LinkedLists
## Queues
## Recursions
## Sortings
## Binary Search
## Trees
## Backtracking
## Heap or Priority Queue
## Hashmap/Hashing
## Graphs
## Dynamic Programming(DP)
## Bit Manipulation


# System Design

 - List item


```txt
		    _   __ ____  ______ ______ _____
 		   / | / // __ \/_  __// ____// ___/
 		  /  |/ // / / / / /  / __/   \__ \ 
 		 / /|  // /_/ / / /  / /___  ___/ / 
		/_/ |_/ \____/ /_/  /_____/ /____/  

```
                                    


# Java Basics

## Classes and Objects

### What is a Class in Java?
Class is the blueprint or template from which objects are created. It defines the properties (fields/attributes) and behaviors (methods) of an object.
### Object:
An instance of a class. It contains actual values for the fields and can execute methods defined in the class.
### Analogy:
Imagine you want to design a car. Class is like the blueprint for a car. It describes all the components and features of a car (like engine, wheels, speed, color, etc.), but it doesn't represent an actual car until you create an object from that blueprint.
#### *Code:* [ClassesObjectsExample.java](https://github.com/itsfarhan/interview-prep/blob/main/JavaExamples/src/ClassesObjectsExample.java)
<br>

## Methods
### What is a Method?
 Method is a block of code that performs a any specific task. When we call a method it performs its task and return result (if return type is given only then!). Methods helps in making code reusable and organized.
### Method Syntax

    accessModifier returnType methodName(parameterList) {
        // method body
    }

**Access Modifier:** This defines from where methods are accessible. (eg: public, private, protected).<br>
**Return Type:** This defines what type of method will return (eg, int, String, void).<br>
**Method Name:** This is defined by us (user-defined).<br>
**Parameters:** This is optional! But if your method requires any input, then params can be given.

### Types of Methods:
**User defined Methods:** We define this methods based on our own requirements.
**Standard Library Methods:** These are pre defined methods that are available in java libraries.

#### *Code:* [MethodsExample.java](https://github.com/itsfarhan/interview-prep/blob/main/JavaExamples/src/MethodsExample.java)
<br>

## Stack and Heap Memory
### **1. Stack Memory:**

**Stack** is a fixed-size memory which stores data for a short amount of time. It’s used to store method calls, local variables, and reference variables.

### **Key Points about Stack Memory:**

-   **LIFO (Last In First Out):** Stack follows this(LIFO) order. The last thing that goes into the stack will be the first thing to come out(LIFO).
-   **Method Execution:** Whenever a method is called, a stack frame is created which stores local variables of that method.
-   **Automatic Memory Management:** As soon as method gets executed stack frame automatically removes from memory so that you don't have clean manually.
-   **Fast Access:** Stack is very fast because of its ability access sequentially. 1→2→3→4…


        public class Main {
	        public static void main(String[] args) {
		        int x = 10;   // Local variable stored in stack
		        int y = 20;   // Local variable stored in stack
		        int result = sum(x, y);  // Method call creates new stack frame
		     }
		     public static int sum(int a, int b) {            
			        return a + b;   // Local variables 'a' and 'b' are stored in stack
			 }
        }        

###  **What Happens in Stack Overflow?**
If too many method calls are made (deep recursion), it leads to a `StackOverflowError` (Stack memory overflow). This happens when stack limit is crossed.

### **Heap Memory:**

**Heap memory** is used to store **objects** and **instance variables**. Unlike stack memory, heap is dynamic and its size changes as per program needs.

### **Key Points about Heap Memory:**

-   **Global Access:** Objects stored in heap memory are globally accessible until they are no longer referenced.
-   **Dynamic Memory Allocation:** When you create object with  `new` keyword use that object allocates in heap memory.
-   **Garbage Collection:** Java automatically manages heap memory via **Garbage Collection**. If an object is no longer referenced by any part of the program, Java automatically cleans it up.
-   **Slower Access:** Heap access is slower in comparison to stack access, because heap memory is scattered and needs more management. 

        public class Main {
	        public static void main(String[] args) {
	            Person p1 = new Person("Farhan", 25);  // Object created in heap
	            Person p2 = new Person("Ahmed", 30);   // Object created in heap
	        }    
        class Person {
		    String name;  // Instance variable stored in heap; global var
		    int age;      // Instance variable stored in heap
		       public Person(String name, int age) { 
			           this.name = name;
			           this.age = age;
		        }
	    }

## Array
### What is an Array?
Array is a collection of **fixed size** elements in which all elements belong to same data type. For example, if you wanna store group of integers you gotta use **int[]**.
#### Key points about Arrays:
- Fixed Size: Once array size has been initialized, it cant be changed.
- Same Data type: Elements in array should belong to same data type.
- Indexing: Index in Array starts with **0**. Which means the index value of **first element** in array is **0** and **2nd element** value is **1** and it goes on.
- Random Access: You can access any element of the Array based on its index value.
#### * Btw, there are lot of ways to initialize array. Lets check that out.*

    int[] numbers;   // Declaration of an integer array
    String[] fruits; // Declaration of a String array
    int[] numbers = new int[5]; // Array of 5 integers
    int[] numbers = {10, 20, 30, 40, 50}; // Array with direct initialization=
    int[] numbers = new int[] {1, 2, 3, 4, 5};

***Code***: [ArraysExamples.java](https://github.com/itsfarhan/interview-prep/blob/main/JavaExamples/src/ArraysExamples.java) and [ArraysExample.java](https://github.com/itsfarhan/interview-prep/blob/main/JavaExamples/src/ArraysExample.java)

## Array of Objects

## Multi-Dimensional Arrays
***Code***: [StringExample.java](https://github.com/itsfarhan/interview-prep/blob/main/JavaExamples/src/StringExample.java) 
## Strings

## Static Block, Method, Variable

## Encapsulation

## Getters and Setters

## This Keyword

## Naming Convention

## Anonymous Object

## Inheritance

## Super Keyword

## Method Overriding

## Packages

## Access Modifiers

## Polymorphism

## Dynamic Method Dispatch

## Final Keyword

## ObjectClass/equals/toString/Hashcode

## Upcasting and Downcasting

## Wrapper Class

## Abstract Keyword

## Inner Class

## Interface

## Enums

## Anotations

## Functional Interface

## Lambda Expressions

## Exception Handling

## Threads

## Collections
Java Collection API is a set of classes and interfaces framework in which you can implement data structures and manipulate data. With this we can use operations like searching, sorting, inserting, deleting) on data storage to efficiently handle.

Through the use of Collection framework you can implement multiple data structures like List, Set, Queue, Map etc.,  Lets understand collection api in a better way.

So, basically collection is a root interface in which it defines almost all data structures in java. Inside this root interface we have sub interfaces like - List, Set and Queue.

#### List Interface: 
List is a **ordered collection** and it allows duplicate elements.
Lets say, when you wanna **store** elements in **indexed** form(maybe like student list), you gotta use Lists. There are few lists like **ArrayList, LinkedList, Vector**.

#### Set Interface
Set is a **unordered collection** and it **doesn't allow duplicate** elements.
Lets say, when you wanna **store unique** values like **email IDs or Product IDs**, you use Set. Few sets are **Hashset, LinkedHashSet, TreeSet**.

#### Queue Interface
Queue is a **ordered collection** and it manages elements in **FIFO(First In, First Out) order**.
Lets say, when you wanna **process tasks sequentially** like ticket booking system or request raise as ticket. Queues examples are **PriorityQueue, LinkedList(as a queue)**.

#### Map Interface
Map interface **stores data as key-value pairs** where **key** is **unique** all the time.
You may use Maps when you want to store data as key-value pairs like userid and name. Where **id cant be duplicated** but **name can have duplicates**. Types of Maps are **HashMap, TreeMap, LinkedHashMap**.


## ArrayList
ArrayList is a class in Java Collection Framework which implements resizable array.
ArrayList is a dynamic array where it uses array internally to store the data but unlike array it is not restricted by size rather it grows its size if array is full. Basically it creates a new array internally larger size than previous full array and then copy elements from previous array to the larger array which has more space.

### Features

 1. **Dynamic Size**: ArrayList size automatically grow and shrink as per requirements
 2. **Index-Based Access**: You can directly access elements of list based on its index.
 3. **Maintain Insertion Order**: ArrayLists elements are stored in added order. Basically, the order which was added is the same order for storing elements. Therefore it maintains insertion order.
 4. **Allowing Dups**: Duplicate elements are allowed in ArrayList. You can store same element multiple times and it will be stored.
 5. **Null Values**: ArrayList allows null values.

### Few important methods of ArrayList:

 1. **add(element)**: To add new element to the list. 
 2. **get(index)**: Element returns based on its index. 
 3. **remove(index)**: Removes element based on index or element.
 4. **size()**: Returns size of list 
 5. **clear()**: Clears/Removes entire elements. contains(element): Verifies if given
    element is available in the list or not.

#### Performance: 
ArrayList access time is constant (O(1)) because elements in ArryaList are accessed based on index. But insertion and removal operation takes (O(n)) when you add or remove any element from ArrayList because next elements has to be shifted.

***Code***: [ArrayListExample.java](https://github.com/itsfarhan/interview-prep/blob/main/JavaExamples/src/ArrayListExample.java)

## LinkedList
LinkedList is a linear data structure where elements are stored sequentially. Every Node(element) with its data consists reference or pointer of next Node. If its a doubly LinkedList then it has reference or pointer of previous Node. In java, LinkedList can be imported from pkg called java.util.LinkedList. This can implement List and Dequeue interfaces. Therefore, doubly ended operations are handled efficiently.

One more thing about LinkedList is unlike array memory locations are not continuous even though sequentially stored. Thats why!!! they use references of prev and next node.

### Features:
1. **Dynamic Size**: Size of LinkedList dynamically grows when elements are inserted and deleted.
2. **Insertion and Deletion**: Operations like insertion and deletion in LinkedList are efficient, especially at the beginning and middle, because you dont have the need to shift elements. In arrays, you do need to shift.
3. **Sequential Access**: Elements in LinkedList are traversed sequentially. You gotta start from first Node and travel sequentially to the next Nodes.
4. **No Index-Based Access**: You cannot access elements directly in LinkedList like Array does. You have to do sequential traversal.
5. **Doubly LinkedList**: Basically in Java's Linkedlist is Doubly LinkedList. You have references of Prev and Next Node.

### How LinkedList looks like?
**Data**: Every Node has data to store.
**Next**: Holds pointer of a Next Node reference.
**Prev(doubly LinkedList)**: Holds pointer of a Prev Node reference.

    Prev <-> Data <-> Next

### Few important methods of LinkedList
1.  **add(element)**: Add element at the end of the list.
2.  **addFirst(element)**: Add element at the start of the list.
3.  **addLast(element)**: Add element at the end of the list. (Alternative for `add(element)`).
4.  **removeFirst()**: Removes the first element of the list.
5.  **removeLast()**: Removes the last element of the list.
6.  **getFirst()**: Returns the first element of the list without removing.
7.  **getLast()**: Returns the last element of the list without removing.

### Performance
**Insertion and Deletion**: Operations like insertion and deletion in LinkedList are efficient, especially at the beginning and middle. Because all you gotta do is update references.
**Access Time**: LinkedList is not efficient for random access. Because you have to sequentially traverse elements. Array have constant time (O(1)) but LinkedList has (O(n)).

## Vector

## Set

## Map
Map is a interface and its part of Java collection framework. Map stores data in Key-Value pairs where key is the unique identifier and value is part of that key.

### Feature
1. **Key-Value Pairs**: Every element is made up of a key and a value. Key is unique and value is associated with it.
2. **Unique Keys**: Duplicate Keys are not allowed but duplicate Values are allowed.
3. **No Specific Order**: In HashMap like implementations elements are not in specific order. But in LinkedHashMap maintains insertion order.
4. **Null Keys and Values**: Depending on implementations Null Keys and Null Values can be allowed (HashMap allows only one Null Key and multiple Null Values.

### Common Map implementations:

 1. HashMap
 2. LinkedHashMap 
 3. TreeMap 
 4. Hashtable

### 1. HashMap:
HashMap is a class and part of Java Collection Framework which implements Map interface. HashMap stores data as key-value pairs where key is unique identifier and corresponding to that key there is a value.

### Features
1. **Key-Value Pairs**
2. **Unique Keys**: HashMap doesnt allow duplicate keys. If you enter a new value with a existing key, it overrides the previous value.
3. **One Null Key** and **Multiple Null Values**.
4. **No Ordering**.
5. Fast Performance: Main advantage of HashMap is Fast Access. You can retrieve any value quickly based on its key. It retrieves in constant time (O(1)).

### How HashMap works Internally!!!
**Hashing**: When you insert a key-value pair HashMap generates Hashcode of the Key. Based on that Hashcode, value are stored in a bucket(memory location).
**Collision Handling**: If hashcode of two different keys are same(btw, its rare) then collision happens!!! HashMap uses a balanced tree (red-black tree, *introduced in Java 8*) to store multiple entries in a single bucket.
**Load Factor**: HashMap load factor default value is 8 *(Java  8)* When HashMap crosses the threshold, internally it rehashes its buckets and doubles the size so that there should not be any performance degrade.

### Advantages

### Disadvantages

### 2. LinkedHashMap
### 3. TreeMap
### 4. Hashtables

## Queue

## Comparator vs Comparable

## Stream API

## Map/Filter/Reduce/Sorted

## Parallel Stram

## forEach Method

## Optional Class

## Method Reference

## Constructor Reference

