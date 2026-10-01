/*
Question 1 (Easy): The Gadget Setup
Create a parent class Device with a method powerOn() that prints "Device is starting...".
Create a child class Laptop that extends Device and has its own method compileCode() that prints "Code is compiling."
In main, create a Laptop object and call both methods. (No constructors needed for this one).
*/

package practice;

class Device{
    // method 
    void powerOn(){
        System.out.println("Device is Starting");
    }
}

class Laptop extends Device{
    void compileCode(){
        System.out.println("Code is compiling");
    }
}

public class firques {
    public static void main(String[] args){
        // code here

        // object creation
        Laptop l1=new Laptop();
        l1.powerOn();
        l1.compileCode();

    }
    
}
