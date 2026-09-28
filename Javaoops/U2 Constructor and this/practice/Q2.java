/*
Question 2 (Medium): The Smartphone
Create a class Smartphone with attributes brand, model, and storageCapacity (int).
Write a parameterized constructor using this to initialize all three.
Write a method printSpecs() that prints the phone's details.
In main, create two different Smartphone objects in just two lines of code using the constructor, and call printSpecs() on both.
*/

package practice;


class SmartPhone{
    // attributes/field
    String brand;
    String model;
    int storageCapacity;

    // constructor
    SmartPhone(String brand, String model, int storageCapacity){
        this.brand=brand;
        this.model=model;
        this.storageCapacity=storageCapacity;
    }

    // methods
    void printSpecs(){
        System.out.printf("Brand: %s | Model: %s | Storage: %d\n",this.brand,this.model,this.storageCapacity);
    }


}

public class Q2 {
    public static void main(String[] args){
        // code here
        
        //Object
        SmartPhone s1=new SmartPhone("Samsung","J7",16);
        SmartPhone s2=new SmartPhone("Honor","9l lite",64);

        // object call methods
        s1.printSpecs();
        s2.printSpecs();
    }
}
