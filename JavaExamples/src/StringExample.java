public class StringExample {
    public static void main(String[] args) {
        String s1 = "Farhan";
        String s2 = new String("Ahmed");
        System.out.println("->"+s1+" "+s2);
        //concat
        s1.concat(s2);

        //String builder
        StringBuilder logBuilder = new StringBuilder();

        logBuilder.append("INFO: Application started.\n");
        logBuilder.append("DEBUG: User logged in with ID: ").append(12345).append("\n");
        logBuilder.append("ERROR: NullPointerException at line 42.\n");
        logBuilder.append("INFO: Application terminated.\n");

        System.out.println("-> Application logs: \n"+ logBuilder.toString());
    }
}
