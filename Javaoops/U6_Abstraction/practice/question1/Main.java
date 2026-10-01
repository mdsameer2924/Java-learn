/*
Question 1 (Easy): The Abstract Appliance

Create an abstract class Appliance.

Give it a regular method plugIn() that prints "Appliance connected to power."

Give it an abstract method turnOn().

Create a child class Fan that extends Appliance. Override the turnOn() method to print "Fan is spinning."

In main, create a Fan object and call both methods.
*/

package U6_Abstraction.practice.question1;

public class Main {
    public static void main(String[] args){
        //code here
        Fan n=new Fan();
        n.plugIn();  // normal method
        n.turnOn(); // abstract method is calling
    }  
}
