/*
Question 2 (Medium): The Smart Thermostat

Create a class Thermostat with a private attribute temperature (double).

Write a getter getTemperature() that returns the temperature.

Write a setter setTemperature(double temperature) that includes an if/else rule:
if the requested temperature is below 0 or above 100, print "Error: Invalid temperature." Otherwise, update this.temperature.
In main, create an object. Try setting the temperature to 150, then set it to 72. Finally, print the temperature in main using the getter.
*/

package practice;
class Thermostat{

    // attributes
    private double temperature;

    // getter 
    public double getTemperature(){
        return this.temperature;
    }

    // setter 
    public void setTemperature(double temp){
        if (!(temp>100 || temp<0)){
            this.temperature=temp;
         } 
        else{
            System.out.println("Error: Invalid temperature");
        }
        
    }
}

public class SecQues {
    public static  void main(String[] args){
        //code here
        Thermostat n=new Thermostat();
        n.setTemperature(72);
        System.out.println(n.getTemperature());
    }
    
}
