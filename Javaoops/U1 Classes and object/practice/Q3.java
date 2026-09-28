/*
Question 3 (Difficult): The Rectangle Calculator
Create a class called Rectangle with attributes length and width (both integers).
Write two methods:

calculateArea(): returns the area (length * width).

calculatePerimeter(): returns the perimeter (2 * (length + width)).
In your main method, create two different Rectangle objects (e.g., rect1 and rect2) with different lengths and widths. 
Print the area and perimeter of both to the console.
*/

package practice;

class Rectangle{
    // class field/attributes
    float length;
    float width;

    // methods
    void calculateArea(){
       System.out.println("Area: "+(length*width)+"cm");
    }

    void calculatePerimeter(){
        System.out.println("Perimeter: "+2*(length+width)+"cm");
    }

}

public class Q3{
 public   static void main(String[] args){
        // code here

        //object 1
        Rectangle shape1=new Rectangle();
        shape1.length=45.3f;
        shape1.width=34.2f;

        // object 2
        Rectangle shape2=new Rectangle();
        shape2.length=21.45f;
        shape2.width=15.1f;

        // using methods on object
        System.out.println("First Object");
        shape1.calculateArea();
        shape1.calculatePerimeter();
        System.out.println();
        System.out.println("Second Object");
        shape2.calculateArea();
        shape2.calculatePerimeter();

    }
}