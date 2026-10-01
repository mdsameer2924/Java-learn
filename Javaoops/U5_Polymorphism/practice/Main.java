
/*
The Main Class:

Create objects of CreditCardPayment and UPIPayment.

Call both versions of authenticate() to prove overloading works.

Call processPayment(100.0) on both child objects to prove overriding works.
*/

package practice;


public class Main {
    public static void main(String[] args){
        // code here
        Payment c=new UPIPayment();  // Upcasting
        c.authenticate();  // login as guest 
        c.authenticate("Mohd Sameer");
        c.processPayment(4000);

        // Credit card UPCASTING Object
        Payment d=new CreditCardPayment();
        d.authenticate("Arman");
        d.processPayment(2000);
    }
    
}
