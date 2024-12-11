//Method Overloading -> Compile-time polymorphism
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }
}

//Method Overriding -> Runtime Polymorphism
class Shape{
    public void draw(){
        System.out.println("This is draw method from shape class");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("This is draw method from circle class");
    }
}

class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("This is draw method from square class");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20)); // Output: 30
        System.out.println(calculator.add(10, 20, 30)); // Output:60
        System.out.println(calculator.add(10.0, 20.0)); // Output:30.0

        Shape shape = new Shape();
        Shape circleObj = new Circle();
        Shape squareObj = new Square();
        shape.draw();
        circleObj.draw();
        squareObj.draw();
    }
}
