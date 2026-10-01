// Run time polymorphism

class Shape{
    double length;
    double breadth;
    final double  PI=3.14;
    double radius;
    // methods
    void displayShapeInfo(){
        System.out.printf("There are Multiple types of Shape such as:\nRectangle\nCircle");
    }
}

class Rectangle extends  Shape{
    // constructor
    Rectangle(double length, double breadth){
        super(length,breadth);
    }

    // methods
    @Override;
    double area_(){
        return  this.breadth*this.length;
    }
}

// class 

public class RunTime {
    public static void main(String[] args){
        // code here 
        Rectangle s=new Rectangle(45, 58);
        System.out.println(s.area_());
    }   
}