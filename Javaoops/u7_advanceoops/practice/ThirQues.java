/*
Question 3: The Computer Build (Strict Composition)

Create a Processor class with a brand (String) and cores (int). Write a constructor for it.

Create a Computer class. Give it a ramSize (int) and an attribute of type Processor (e.g., Processor cpu;).

The Strict Composition constraint: The Computer constructor should take ramSize, brand, and cores as parameters.
Inside the constructor, use those parameters to create the Processor object internally (this.cpu = new Processor(...)). 
Do not pass a pre-built Processor from the outside!

Write a showSpecs() method in Computer that prints the RAM, Processor brand, and cores.

In main, create a Computer object and call showSpecs().
*/

package practice;

public class ThirQues {
    public static void main(String[] args){
        // code here
        Computer obj=new Computer("intel i512400", 8, 16);
        obj.showSpecs();
    }
    
}

class Processor{
    // attributes class's fields
    String brand;
    int cores;

    // constructor
    Processor(String brand,int cores){
        this.brand=brand;
        this.cores=cores;
    }
    @Override 
    public String toString(){
        return ("Brand: "+this.brand+" | "+"Cores: "+this.cores);
    }
}

class Computer{
    int ramSize;
    Processor cpu; // computer has a Processor [composition]
    
    // constructor
    Computer(String brand, int cores,int ramSize ){
        this.cpu=new Processor(brand, cores);
        this.ramSize=ramSize;
    }
 // methods
 public void showSpecs(){
    System.out.println(this.cpu+" | "+" Ram: "+this.ramSize+"GB");
    
 }
}