import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap to store player scores
        TreeMap<Integer, String> leaderboard = new TreeMap<>();

        // Adding players with their scores
        leaderboard.put(101, "Alice - 1500 points");
        leaderboard.put(105, "Bob - 1700 points");
        leaderboard.put(102, "Charlie - 1600 points");
        leaderboard.put(103, "David - 1450 points");

        // Display the leaderboard sorted by player ID
        System.out.println("Leaderboard (Sorted by Player ID):");
        for (Map.Entry<Integer, String> entry : leaderboard.entrySet()) {
            System.out.println("Player ID: " + entry.getKey() + ", " + entry.getValue());
        }

        // Removing a player from the leaderboard
        leaderboard.remove(103);

        // Display the leaderboard again
        System.out.println("\\nUpdated Leaderboard (After removing Player 103):");
        for (Map.Entry<Integer, String> entry : leaderboard.entrySet()) {
            System.out.println("Player ID: " + entry.getKey() + ", " + entry.getValue());
        }

        // Fetching the player with the highest ID
        System.out.println("\\nPlayer with the highest ID: " + leaderboard.lastEntry());

        // Fetching the player with the lowest ID
        System.out.println("Player with the lowest ID: " + leaderboard.firstEntry());
    }
}
