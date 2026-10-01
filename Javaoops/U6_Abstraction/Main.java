/* ---------- Defination --------------
Abstraction: The process of hiding the complex background details (the "how it works") and only showing the essential features (the "what it does")
to the user. When you drive a car, you know how to use the steering wheel and pedals (the interface), 
but you don't need to know how the engine combusts fuel (the hidden implementation).
 */ 
package U6_Abstraction;
abstract class Fruit{
    abstract void mango();
    void eatFruit(){
        System.out.println("Eating ... food");
    }
}

class Mango extends  Fruit{
    void mango(){
        System.out.println("Mango is the king of all fruits");
        System.out.printf("Are you eating ");
        super.eatFruit();

    }
}

public class Main {
    public static  void main(String[] args){
        Mango f1=new Mango();
        f1.eatFruit();
        f1.mango();
    }
    
}
