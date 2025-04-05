import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class User{
    private String name;
    private String email;
    private int id;

    public User(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getId(){
        return id;
    }
}

class UserService{
    private Map<String, User> userDatabase = new HashMap<>();

    public UserService(){
        userDatabase.put("1", (new User("Alice", 2, "alice@example.com")));
        userDatabase.put("2", (new User("Bob", 3, "bob@example.com")));
    }
    public Optional<User> findUserByID(String userId) {
        User user = userDatabase.get(userId);
        return Optional.ofNullable(user);
    }
}


public class OptionalExample {
    public static void main(String[] args) {
        UserService userService = new UserService();
        
        String userIdToFind = "3";
        Optional <User> userOptional = userService.findUserByID(userIdToFind);

        userOptional.ifPresent(user ->
        System.out.println("User found: " + user.getName() + ", Email: " + user.getEmail())
        );

        String username = userOptional.map(User::getName).orElse("User Not Found!!");
        System.out.println(username);
    }
}
