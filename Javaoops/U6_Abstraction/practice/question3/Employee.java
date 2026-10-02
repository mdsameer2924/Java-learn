/*
Create an abstract class Employee with an attribute name and a constructor to set it. Add an abstract method calculateSalary().

Create an interface Taxable with a method void payTax().

Create a class Manager that extends Employee AND implements Taxable. (Syntax hint: class Manager extends Employee implements Taxable).

In Manager:

Write a constructor that calls super(name).

Override calculateSalary() to return 80000.0.

Override payTax() to print "Manager pays 20% tax on salary."

In main, create a Manager, print their salary, and call payTax().
*/

package U6_Abstraction.practice.question3;

abstract public class Employee {
    
    // class's attributes
    String name;

    // Constructor
    Employee(String name){
        this.name=name;
    }

    abstract double calculateSalary(double amt); // abstract class
    
}
