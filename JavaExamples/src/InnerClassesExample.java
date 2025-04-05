class Outerclass{
    String msg = "-> This is a outerclass that has been called by Member Inner Class";
    static String msg1 = "-> This is a outerclass that has been called by Stated Nested Class";
    private String msg2 = "-> This is a outerclass that has been called by Local inner Class";

    void outerClassMethod(){
        //local inner class
        class LocalInnerClass{
            void localMethod(){
                System.out.println(msg2);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localMethod();
    }

    //member inner class
    class Innerclass{
        void innerMethod(){
            System.out.println(msg);
        }
    }
    
    //static nested class
    static class StaticNestedClass{
        void staticMethod(){
            System.out.println(msg1);
        }
    }
}

public class InnerClassesExample {
    public static void main(String[] args) {
        
        //Member Inner Class
        Outerclass outerclass = new Outerclass();
        Outerclass.Innerclass innerclass = outerclass.new Innerclass();
        innerclass.innerMethod();

        //Static Nested Class
        Outerclass.StaticNestedClass staticNestedClass = new Outerclass.StaticNestedClass();
        staticNestedClass.staticMethod();
        //Outerclass.StaticNestedClass.staticMethod();

        //Local Inner Class
        Outerclass outer = new Outerclass();
        outer.outerClassMethod();
    }
}
