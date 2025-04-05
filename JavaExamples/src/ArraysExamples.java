public class ArraysExamples {
    String name;
    int age;

    ArraysExamples(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
    public static void main(String[] args) {

        ArraysExamples[] arr = new ArraysExamples[3];

        arr[0] = new ArraysExamples("Farhan", 100);
        arr[1] = new ArraysExamples("Volverine", 150);
        arr[2] = new ArraysExamples("Spiderman", 120);
        
        for (int index = 0; index < arr.length; index++) {
            arr[index].display();
        }

        //int[] size = new int[10];
        //int[] numbers = {1,2,3,4,5};
        int[] numbers = new int[] {1,2,3,4,5};
        
        System.out.println(numbers.length);

        for(int i=0; i<numbers.length; i++){ // loop through the array
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        for (int i : numbers) { // enhanced for loop
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
