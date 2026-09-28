class Animal{
    // class attributes
     String species;

    // constructor
    Animal(String species){
        this.species=species;
    }

    // method
    void eat(){
        System.out.println("THe animal is eating");
    }

}


// DOg inherit Animal properties
class Dog extends Animal{
    String breed;
    Dog(String species,String breed){
        super(species); // to refer parents attributes we have to use super other wise it's default take as a species separte paramter indivdual for dog class only
        this.breed=breed;
    }
    void bark(){
        System.out.printf("Dog is barking always");
    }
}

public class main {
    public static  void main(String[] args){
        // code here
        
        Dog d1=new Dog("Dog","german sherapd");
        d1.eat(); // inherited  method
        
    }
    
}
