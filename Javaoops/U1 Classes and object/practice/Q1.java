// Question 1 (Easy): The Book Entity
// Create a class called Book. Give it three attributes: title (String), author (String), and price (double). 
// Write a method displayDetails() that prints these three attributes. 
// In your main method, create one Book object, assign values to its attributes, and call the display method.

// practice is the folder to use when working for nested folder
package practice;

 class Book{
   String title;
   String author;
   double price;

   void displayDetails(){
      System.out.printf("Book's Title: %s | Author: %s | Price: %.2f.\n",title,author,price);
   }
}







public class Q1 {
   public static void main(String[] args){
    // code here
    Book b1=new Book();
    
    b1.title="Rich dad poor dad";
    b1.author="Robert t kiyusaki";
    b1.price=299.99; 

    b1.displayDetails();

   } 
}
