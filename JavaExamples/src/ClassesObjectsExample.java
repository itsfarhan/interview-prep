class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

public class ClassesObjectsExample{
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        person1.introduce();
    }
}

