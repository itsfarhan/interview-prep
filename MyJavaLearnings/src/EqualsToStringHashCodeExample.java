class Car{
    int modelNumber;

    Car(int modelNumber){
        this.modelNumber = modelNumber;
    }

    @Override
    public String toString(){
        return "Model Number: " + modelNumber;
    }

    @Override
    public int hashCode(){
        return modelNumber;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        Car car = (Car) obj;
        return modelNumber == car.modelNumber;
    }

}

public class EqualsToStringHashCodeExample {
    public static void main(String[] args) {
        Car car1 = new Car(9999);
        Car car2 = new Car(9999);

        System.out.println(car1.equals(car2));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}
