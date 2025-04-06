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

 - List item

# Data Structures and Algorithms

 - List item

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
### *Code:* [ClassesObjectsExample.java](https://github.com/itsfarhan/interview-prep/blob/main/JavaExamples/src/ClassesObjectsExample.java)

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

### *Code:* [MethodsExample.java](https://github.com/itsfarhan/interview-prep/blob/main/JavaExamples/src/MethodsExample.java)

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

## Array of Objects

## Multi-Dimensional Arrays

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

## ArrayList

## LinkedList

## Vector

## Set

## Map

## Queue

## Comparator vs Comparable

## Stream API

## Map/Filter/Reduce/Sorted

## Parallel Stram

## forEach Method

## Optional Class

## Method Reference

## Constructor Reference

