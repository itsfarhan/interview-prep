import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) {
        //Try with resources
        //Syntax - try(ResourceType obj = new ResourceType(new Resource(filename.txt))){ condition and logic } catch(Exception){sout}
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This block will get executed");
        }
    }
}
