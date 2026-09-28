class UserProfile {
    // Hidden data! You cannot access these directly from main.
    private String username;
    private int age;

    // Constructor can still set them initially
    UserProfile(String username, int age) {
        this.username = username;
        setAge(age); // Smart trick: use the setter in the constructor to apply validation rules immediately!
    }

    // Getter for username (Read-only access, notice there is no setter for username!)
    public String getUsername() {
        return username;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age (Write access, but with rules!)
    public void setAge(int age) {
        if (age >= 13) {
            this.age = age;
        } else {
            System.out.println("Error: User must be at least 13 years old.");
        }
    }
}

public class Second {    
    public static void main(String[] args) {
        UserProfile user1 = new UserProfile("CodeNinja", 15);
        
        // System.out.println(user1.age); // ERROR! age is private.
        System.out.println(user1.getUsername() + " is " + user1.getAge()); // CORRECT!
        
        user1.setAge(10); // Output: Error: User must be at least 13 years old.
    }
}