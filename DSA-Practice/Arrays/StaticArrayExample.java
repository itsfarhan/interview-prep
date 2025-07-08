package Arrays;

public class StaticArrayExample{
    public static void main(String[] args) {
        int [] myArr = new int [] {10,20,30,40,50};

        //Access value in array directly
        System.out.println("Element at index '2' is: "+myArr[2]);

        //Array Traversal
        for(int i=0;i<myArr.length;i++) {
            System.out.println("Element at index "+i+" is: "+myArr[i]);
        }

        //Searching in an array
        int target = 30;
        boolean found = false;

        for(int i=0;i<myArr.length;i++){
            if(myArr[i]==target){
                found = true;
                System.out.println("Element found at index: "+i);
                break;
            }
        }
        if (!found){
            System.out.println("Element not found");
        }

        //Maximum in Array
        int max = myArr[0];
        for(int i=0; i<myArr.length;i++){
            if(myArr[i] > max){
                max = myArr[i];
            }
        }
        System.out.println("Max Element: "+max);
    }
}