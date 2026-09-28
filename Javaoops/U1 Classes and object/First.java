class Dog {
    // 1. ATTRIBUTES (State / Fields)
    // These represent the characteristics or data that every Dog will have. 
    // Think of this as the "blueprint" of what makes a dog.
    String name;
    int age;

    // 2. METHODS (Behavior)
    // These represent the actions the object can perform. 
    // They usually use or modify the attributes defined above.
    void display() {
        System.out.printf("My dog's name is %s, he is %d years old.\n", name, age);
    }
}

public class First { // Note: In Java, class names conventionally start with a Capital letter (e.g., First)
    
    // The main method must be 'public static void' so Java can launch the program.
    public static void main(String[] args) {
        
        // 3. INSTANTIATION (Creating an Object)
        // 'new Dog()' physically allocates memory for a brand new Dog.
        // 'Dog obj' is the reference variable (the remote control) pointing to that specific Dog in memory.
        Dog obj = new Dog();
        
        // 4. INITIALIZING STATE (Accessing Attributes)
        // We use the dot (.) operator to access the variables of our specific object ('obj') 
        // and give this unique instance its own identity.
        obj.name = "sheru";
        obj.age = 5;
        
        // 5. METHOD INVOCATION (Triggering Behavior)
        // We tell our specific Dog instance ('obj') to execute its display action.
        obj.display();
    }
}