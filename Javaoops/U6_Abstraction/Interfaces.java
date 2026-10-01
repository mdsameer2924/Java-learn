
package U6_Abstraction;

// interface

interface Human{
    void detailsInfo(); // abstracted method
    void dailyRoutine(); 
}

class Girl implements Human{
    String name;
    String chores;
    Girl(String name,String chores){
        this.name=name;
        this.chores=chores;
    }
    @Override
    public void detailsInfo(){
        System.out.printf("Human has name, age, gender type things: "+this.name+" one of the example\n");
    }
    @Override
    public void dailyRoutine(){
        System.out.println("Human spend their life doing daily chores like: "+this.chores+" activites to timepass");

    }

}

public class Interfaces{
    public static void main(String[] args){
        // code here
        Girl c=new Girl("Saniya","Wasing clothes");
        c.detailsInfo();
        c.dailyRoutine();
        
    }
}