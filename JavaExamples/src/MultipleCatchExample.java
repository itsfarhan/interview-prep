public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int [] myArray = {1,2,3};

            int a = 10;
            int b = 0;
            int result = a / b; //"ArthemeticException: cannot be divided by 0.
            System.out.println(result);
            System.out.println(myArray[5]);
        }
        catch(ArithmeticException e){
            System.out.println("ArthemeticException: cannot be divided by 0.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds.");
        }catch(Exception e){
            System.out.println("General Exception: " + e.getMessage());
        }finally{
            System.out.println("This part always run");
        }
    }
}
