package practice;

/*
The Child Classes (CreditCardPayment and UPIPayment):

Make both classes inherit from Payment.

Override the processPayment(double amount) method in CreditCardPayment. 
It should add a 2% processing fee to the amount, and print "Processing Credit Card payment of $" + finalAmount.

Override the processPayment(double amount) method in UPIPayment. UPI has no fee, so just print "Processing UPI payment of $" + amount + " instantly."
*/

public class CreditCardPayment extends Payment{
    
    @Override 
    void processPayment(double amount){
        double rate=(amount*2)/100;
        double  finalAmount=amount+rate;
        System.out.println("Processing Credit Card payment of $"+ finalAmount);
    }
}