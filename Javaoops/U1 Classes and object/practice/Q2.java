/* 
Question 2 (Medium): The Basic Bank Account
Create a class called BankAccount. Give it an attribute balance (double) initialized to 0.
Create two methods:

deposit(double amount): adds the amount to the balance and prints the new balance.

withdraw(double amount): subtracts the amount from the balance and prints the new balance.
In your main method, create an account object, deposit $500, and withdraw $150.
*/


package practice;

class BankAccount{
    
    // attributes 
    double balance=0;

    // methods
    double deposit(double amount){
       balance+=amount;
       return  balance;
    }

    double withDraw(double amount){
        balance-=amount;
        return balance;
    }
}

public class Q2 {
 static void main(String[] args){
    // code here

    // create new object
    BankAccount b1=new BankAccount();

    //check balance
    System.out.println(b1.balance);

    // add money into bank
    b1.deposit(599);
    System.out.println(b1.balance+"rs"); //check balance
    
    // deducted that amount from bank account
    b1.withDraw(49);
    System.out.println(b1.balance+"rs");

    // add more money
    b1.deposit(50);
    System.out.println(b1.balance+"rs");

    // withdraw money again -500 from bank
    b1.withDraw(500);
    System.out.println(b1.balance+"rs");
 }
    
}
