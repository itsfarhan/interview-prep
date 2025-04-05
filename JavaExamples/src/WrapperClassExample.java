// | Primitive Type | Wrapper Class |
// | --- | --- |
// | `int` | `Integer` |
// | `char` | `Character` |
// | `boolean` | `Boolean` |
// | `byte` | `Byte` |
// | `short` | `Short` |
// | `long` | `Long` |
// | `float` | `Float` |
// | `double` | `Double` |



public class WrapperClassExample {
    public static void main(String[] args) {
        int num = 5;

        //Autoboxing int to Integer
        Integer wrapperType = num;

        //Unboxing Integer to int
        int primitiveType = wrapperType;

        //Wrapper Class Methods
        String str = wrapperType.toString(); // Conver Integer to String
        int parsedInt = Integer.parseInt("100"); // Convert String to Integer

        System.out.println("Primitive Type: "+num);
        System.out.println("Wrapper Type: "+wrapperType);
        System.out.println("Unboxed: "+primitiveType);
        System.out.println("String Representation: "+str);
        System.out.println("Parsed Integer: "+parsedInt);
    }
}
