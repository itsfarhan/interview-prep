package Arrays;

public class StaticArrayExample{
    public static void main(String[] args) {
        int [] myArr = new int [] {10,20,30,40,50};
        // int [] arr = new int [5]; //declaration and instantiation
        // arr[0] = 5; //initialization
        // arr[1] = 15;
        // arr[2] = 25;
        // arr[3] = 35;
        // arr[4] = 45;
        
        // int [] anotherArr = {100,200,300,400,500}; //declaration, instantiation and initialization
        
        //Access value in array directly
        System.out.println("Element at index '2' of array is: "+myArr[2]);

        //Array Traversal
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("Element at index "+i+" of array is: "+myArr[i]);
        }

        //Searching in an array
        int target = 30;
        boolean found = false;

        for(int i=0;i<myArr.length;i++){
            if(myArr[i]==target){
                found = true;
                System.out.println("Element "+target+" found at index: "+i);
                break;
            }
        }
        if (!found){
            System.out.println("Element "+target+" not found");
        }

        //Maximum in Array
        int max = myArr[0];
        for (int i=0; i<myArr.length; i++){
            if (myArr[i]>max){
                max = myArr[i];
            }
        }
        System.out.println("Max element in the array is : "+max);
    }
}