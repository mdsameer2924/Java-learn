class Weapon{
    String name;
    double damage;
    Weapon(String name, double damage){
        this.name=name;
        this.damage=damage;

    
    }

    @Override  // object's method override
    public String toString(){ 
        return (this.name+" , "+this.damage);
    }
}

class Player{
    String playerName;
    Weapon equipWeapon;  // aggregation composite 
    Player(String playerName, Weapon equipWeapon){
        this.playerName=playerName;
        this.equipWeapon=equipWeapon;

    }
    @Override  // Object class's method override
    public String toString(){
        return (this.playerName+", "+this.equipWeapon);
    }
}


public class CompositeAggregate{
    public static void main(String[] args){
        // code here
        Weapon assaultRiffle=new Weapon("m416", 46.9); // weapon object

        Player p1=new Player("Victor", assaultRiffle);
        System.out.println(p1);

    }
}