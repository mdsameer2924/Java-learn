/* 
Question 2 (Medium): The Vehicle Fleet
Create a parent class Vehicle with an attribute brand (String). Write a constructor in Vehicle to initialize it.
Create a child class Car that extends Vehicle. Give Car an attribute model (String).
Write a constructor in Car that takes both brand and model. Use super(brand) to initialize the parent part.
In main, create a Car object (e.g., "Toyota", "Corolla") and print both attributes.
*/

package practice;

class Vehicle{
    String brand; // attributes

    // constructor
    Vehicle(String brand){
        this.brand=brand;
    }
}

// child class inherit Vehicle property
class Car extends Vehicle{
    // attributes
    String model;
    Car(String brand, String model){
        super(brand); // call parent constructor in child
        this.model=model;

    }
}

public class secques {
    public static void main(String[] args){
        // Code here 
        Car c1=new Car("Toyota","m3O");
        Vehicle c2=new Car("Mauva", "A24");
        System.out.printf("Car: %s | Model: %s\n",c1.brand,c1.model);
        System.out.printf("Car: %s | \n",c2.brand);

    }
    
}
