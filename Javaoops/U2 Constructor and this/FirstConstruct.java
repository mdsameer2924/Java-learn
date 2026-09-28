
class Book{
    // members;
    String title;
    String author;
    double price;
    Book(String title, String author, double cost){   // parameterized constructor
        this.title=title;
        this.author=author;

        // this keyboard used to refer the class memeber's into constructor parameter var name is cost 
        // but class member is price so we used this to refer what we are talkinga about 
        // best practice to use constructor's parameters and class member same name
        this.price=cost;  // still it is valid 
    }
        // methods (behaviour)
        void displayInfo(){
            System.out.printf("| Title: %s | Author: %s | Price: %.2frs. |\n",title,author,price);
        }
    
}
public class FirstConstruct {

    public static void main(String[] args){
        // Code here 

        // Object Creation
        Book b1=new Book("Atomic habit","sameer",299.9);
        Book b2=new Book("think big","abc",499.58);
        
    // Object using method
        b1.displayInfo();
        b2.displayInfo();
    }

    
}
