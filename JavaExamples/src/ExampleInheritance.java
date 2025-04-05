class Animal { //parent class
    public void sound(){
        System.out.println("Parent class method");
    }
}

class Dog extends Animal {
    @Override //annotation
    public void sound(){  
        super.sound();  
        System.out.println("child class method");
    }

}

// class Cat extends Dog { //child class
//     public void color() { //method
//         System.out.println("Cat meows");
//     }
// }

public class ExampleInheritance{
    public static void main(String[] args) {
        // Animal myAnimal = new Animal();  // Parent class object
        // myAnimal.sound();  // Calls Animal class method

        Dog myDog = new Dog();  // Child class object
        myDog.sound();  // Calls overridden method in Dog class
    }
}