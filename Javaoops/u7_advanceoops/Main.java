// 1. Composition: We build small, focused classes first.
class Engine {
    int horsepower;
    Engine(int hp) { this.horsepower = hp; }
}

class Car {
    // 2. The 'final' keyword: This value cannot be modified after initialization.
    final String VIN_NUMBER;
    
    // 3. The 'static' keyword: A shared counter for the entire factory.
    static int totalCarsBuilt = 0;

    // 4. Composition: Car "has an" Engine object inside it.
    Engine carEngine; 

    // Constructor
    Car(String vin, Engine engine) {
        this.VIN_NUMBER = vin;
        this.carEngine = engine; // Plugging in the Engine object
        totalCarsBuilt++;        // Modifying the shared static variable
    }

    // 5. Overriding the cosmic Object class method for clean printing
    @Override
    public String toString() {
        return "Car VIN: " + VIN_NUMBER + " | Engine HP: " + carEngine.horsepower;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating the component first
        Engine v8 = new Engine(500); 
        
        // Passing the component into the Car
        Car myCar = new Car("1ABC234", v8);
        Car mySecondCar = new Car("9XYZ876", new Engine(300)); // Creating inline
        Car hisCar=new Car("1IMEOSM", v8);

        // When you print an object, Java automatically calls your custom toString()
        System.out.println(myCar); 
        
        // Accessing a static variable uses the Class name (Car.totalCarsBuilt), not the object name
        System.out.println("Total cars built: " + Car.totalCarsBuilt); 
    }
}