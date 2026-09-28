class User {
    String username;

    User(String username) {
        // WRONG: Both sides refer to the local parameter.
        // The class attribute 'username' remains null.
        username = username; 
    }

    void verifyUser() {
        // ERROR: This throws a NullPointerException because the 
        // class attribute was never initialized and is still null.
        // if (username.equals("admin")) {
            System.out.println("Access Granted"+username);
        // }
    }
}

public class ThisImportance {
    public static void main(String[] args) {
        User u1 = new User("admin");
        u1.verifyUser(); // Program crashes here
    }
}

