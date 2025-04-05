package Arrays;

import java.util.ArrayList;

public class DynamicArrayExample {
    public static void main(String[] args) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        System.out.println("Array after adding elements: "+dynamicArray);

        dynamicArray.remove(1);
        System.out.println("Array after removing example: "+dynamicArray);

        System.out.println("Element at index '0' is :"+dynamicArray.get(0));

        dynamicArray.set(0,100);
        System.out.println("After array modification: "+dynamicArray);

        System.out.println("Size of the array is: "+dynamicArray.size());
    }
}
