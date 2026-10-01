package practice;


public class Payment{
    void processPayment(double amount){
        System.out.printf("Processing generic payment of $ %.2f\n",amount);
    }
    void authenticate(){
        System.out.printf("Authenticating as Guest\n");
    }
    void authenticate(String username){
        System.out.println("Authenticating user: "+ username);
    }
}
