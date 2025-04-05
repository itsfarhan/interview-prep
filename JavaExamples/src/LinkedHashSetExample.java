// LinkedHashSet - This combines features of Sets and Linkedlists. (No Duplicates + in Order)
// Basically, it is a set that checks duplicates and save the data in order

import java.util.LinkedHashSet;

class UserLoggingTrack{
    private LinkedHashSet<String> userLogin;
    
    public UserLoggingTrack(){
        userLogin = new LinkedHashSet<>();
    }

    public void addLogin(String user){
        if (userLogin.add(user)){
            System.out.println("User add to log: "+user);
        } else{
            System.out.println("User already logged! Duplicate: "+user);
        }
    }

    public void displayUserLogs(){
        System.out.println("List of users logged (in order): "+userLogin);
    }
}

public class LinkedHashSetExample {
    public static void main(String[] args) {
        UserLoggingTrack userLoggingTrack = new UserLoggingTrack();

        userLoggingTrack.addLogin("Farhan");
        userLoggingTrack.addLogin("Alice");
        userLoggingTrack.addLogin("Tom");
        userLoggingTrack.addLogin("Jerry");

        //Display list
        userLoggingTrack.displayUserLogs();

        //Duplicate user checking
        userLoggingTrack.addLogin("Farhan");
    }
}
