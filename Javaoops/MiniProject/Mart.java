
// The TerminalMart E-Commerce Backend.

package Javaoops.MiniProject;
import  java.util.Scanner;

public class Mart {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("My name is "+name);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("I am "+age+" Year old.");

        System.out.print("Enter your favourite food: ");
        String food=sc.nextLine();

        System.out.println("i like to eat "+food);
    
    
    }

    
}

class Product{
    private String name;
    private double price;
    private int stockQuantity;
    
    // getter 
    public String getName(){
        return  this.name;
    }

    public double getPrice(){
        return  this.price;
    }

    public  int getStockQuantity(){
        return this.stockQuantity;
    }

    // setter 
    public void setName(String name){
        this.name=name;
    }
}