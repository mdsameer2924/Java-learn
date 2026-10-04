/*
Create a BankServer class.
Give it a static integer variable activeConnections starting at 0.

Give it a final String variable SERVER_IP.
In the constructor, take an IP string as a parameter to initialize SERVER_IP, and increment activeConnections by 1.

In main, create three BankServer objects. Print the SERVER_IP of one of them, and 
then print activeConnections using the class name (BankServer.activeConnections). It should equal 3.
*/

package practice;

class BankServer{
    public static  int activeConnections=0;
     final String  SERVER_IP;
     BankServer(String SERVER_IP){
        this.SERVER_IP=SERVER_IP; // locked 
        activeConnections=activeConnections+1; // increment connection as new object create
     }
}

public class FirstQues {
    public static void main(String[] args){
        // code here
        BankServer hdfcBankServer=new BankServer("192.168.1.69");
        BankServer rblBankServer=new BankServer("192.168.1.74");
        BankServer sbiBankServer=new BankServer("192.168.1.71");
        System.out.println(hdfcBankServer.SERVER_IP);
        System.out.println("There are "+BankServer.activeConnections+" active connection");
    }
    
}
