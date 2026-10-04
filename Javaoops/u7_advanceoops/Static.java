package u7_advanceoops;

class Vehicle{
    public String model;
    public String color; 
    public String name;
    public  static int totalCar;  // static attributes 
    
    // constructor
    Vehicle(String name,String color, String model){
        this.name=name;
        this.color=color;
        this.model=model;
    }
     
    // static method
    static public  void veInfo(){
        System.out.printf("this is static method we can call it without making object\n");
    }
}

public class Static {
    public static void main(String[] args){
        // code here
        Vehicle.totalCar=45;
        int s=Vehicle.totalCar;
        System.out.println(s);
        Vehicle.veInfo();

        // creating object
        Vehicle v=new Vehicle("Toyota", "pink", "AD8");
        v.totalCar=34;
        System.out.println(v.totalCar); // value manipulated from 45 to 34
        System.out.println(Vehicle.totalCar);  // here we can see
        
    }
}
