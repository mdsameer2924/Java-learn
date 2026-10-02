package testSubject;

class Animal{
    void makeSound(){
        System.out.println("Animal makes sound based on species");
    }
}

// child class
class Dog extends  Animal{
    @Override 
    void makeSound(String sound){
        System.out.println("dog soud: "+ sound);

    }
}

class cat extends  Animal{
    private String sound;
    // setter 
    public void setSound(String sound){
        this.sound=sound;
    }

    // getter 
    public String getSound(){
        return this.sound;
    }
    @Override 
    void makeSound(){
        System.out.println("make sound "+this.getSound()); 
        // return sound;
    }

}

public class MethodOverride {
    public static void main(String[] args){
        // code here
        Animal a1=new Dog();
        Animal a2=new cat();
        a1.makeSound();
        a2.makeSound();
    }   
}
