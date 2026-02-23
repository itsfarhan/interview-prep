import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    private LinkedHashMap<String, String> loginHistory;

    public LinkedHashMapExample() {
        // LinkedHashMap to store user login history in insertion order
        loginHistory = new LinkedHashMap<>();
    }

    // Method to add a login
    public void userLoggedIn(String username, String time) {
        loginHistory.put(username, time);
    }

    // Method to display login history
    public void displayLoginHistory() {
        System.out.println("Login History (Insertion Order):");
        for (String user : loginHistory.keySet()) {
            System.out.println("User: " + user + ", Login Time: " + loginHistory.get(user));
        }
    }

    public static void main(String[] args) {
        LinkedHashMapExample tracker = new LinkedHashMapExample();

        // Users logging in
        tracker.userLoggedIn("user1", "10:00 AM");
        tracker.userLoggedIn("user2", "10:05 AM");
        tracker.userLoggedIn("user3", "10:10 AM");

        // Displaying the login history
        tracker.displayLoginHistory();
    }
}