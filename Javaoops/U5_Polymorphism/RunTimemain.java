// run time polymorphism (overriding)

class  Animal{
    void makeSound(){
        System.out.println("Animal makes a generic sound.");
    }
}

class Dog extends Animal{
    @Override 
    void makeSound(){
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends  Animal{
    @Override 
    void makeSound(){
        System.out.println("Cat meows: Meow!");
    }
}


public class RunTimemain {
public  static void main(String[] args){
    // code here
    /* 
    Cat moize=new Cat();
    moize.makeSound();
    Dog sh=new Dog();
    sh.makeSound();
    */

    // new Testing overriding
    Animal a1=new Cat();
    Animal a2= new Dog();
    Animal a3=new Animal();
    a1.makeSound();
    a2.makeSound();
    a3.makeSound();
}
    
}
