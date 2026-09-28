/*
Create a BankVault class with private attributes accountNumber (String) and balance (double).

Write a constructor to initialize BOTH attributes.

Provide standard getters for both (getAccountNumber() and getBalance()).

DO NOT provide setters. Instead, write two public methods to handle money: deposit(double amount) and withdraw(double amount).

Validation rules for these methods:

deposit: amount must be greater than 0. If not, print an error.

withdraw: amount must be greater than 0 AND amount cannot be greater than the current balance. 
(Print "Insufficient funds" or "Invalid amount" if they fail this).

In main, test your validations: Try to deposit a negative number, 
try withdrawing more than you have, and then do a valid transaction. Print the final balance using the getter.
*/
package practice;

class BankVault {
    private String accountNumber;
    private double balance;

    // constructor
    BankVault(String accoutNumber, double balance) {
        this.accountNumber = accoutNumber;
        this.balance = balance;
    }

    // getter
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    // methods
    public void deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
        } else {
            System.out.println("Error! you can't deposit null and negative value");
        }
    }

    public void withdraw(double amt){
        if (amt<this.balance && amt>0){
            this.balance-=amt;
        }
       else{
        System.out.println("Insufficient funds");
    }

}
}

public class thirques {
    public static void main(String[] args) {
        // code here
        BankVault h = new BankVault("XUIV", 400);
        h.deposit(34);
        System.out.println(h.getBalance());
        h.withdraw(59);
        System.out.println(h.getBalance());
    }
}


