class Heart{
    int heartRate;
    Heart(){
        this.heartRate=72; // default heart rate
    }

    // method
    void bloomPumping(){
        System.out.println("Blood is pumping at "+this.heartRate+" bpm");
    }
}

class Human{
    String name;
    Heart myHeart;  // composition Human has heart (Has a relation)
    
    // constructor 
    Human(String name){
        this.name=name;
        this.myHeart=new Heart(); // now create object inside Human class's constructor no need to create seprate Heart object
    }

    public void aLive(){
        System.out.println(this.name+" is alive");
        myHeart.bloomPumping(); // call the method using myheart object
    }

}



public class StrictComposite {
    public static void main(String[] args){
        // code here
        Human h1=new Human("sameer");
        h1.aLive();
    }
}
