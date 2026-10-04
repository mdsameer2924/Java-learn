package u7_advanceoops;
class DevilFruit{
    String name;
    String type;
    String model;
    public static int totalDevilFruitEater;
    DevilFruit(String name,String type, String model){
        this.name=name;
        this.type=type;
        this.model=model;
        totalDevilFruitEater++; // modify the total devil fruit eater 
    }
}
public class Objectsec {
    public static void main(String[] args){
        // code here
        DevilFruit luffy=new DevilFruit("Human Human", "Zoan", "Nika");
        DevilFruit chopper=new DevilFruit("Human Human", "Zoan", "Base");
        System.out.println("Total Devil fruit User: "+DevilFruit.totalDevilFruitEater);
    }
}
