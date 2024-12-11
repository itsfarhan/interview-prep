//Final Variable
class SuperCar {
    // Declaring a final variable
    final int MAX_SPEED = 200;

    void run() {
        // MAX_SPEED = 220;  // Error: cannot assign a value to final variable
        System.out.println("Max speed is " + MAX_SPEED);
    }
}

// Final Method
class Vehicle {
    public final void start() {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle {
    // This will give a compilation error because final method can't be overridden
    // public void start() {
    //     System.out.println("Car is starting");
    // }
}

// Final class
final class MotorBike {
    void run() {
        System.out.println("Cycle is running");
    }
}

// This will give an error because final class can't be extended
// class SportsBike extends MotorBike {
//     // class body
// }


public class FinalExample {
    public static void main(String[] args) {
        SuperCar superCar = new SuperCar();
        superCar.run();

        Vehicle vehicle = new Vehicle();
        vehicle.start();

        MotorBike motorBike = new MotorBike();
        motorBike.run();

    }
}
