class BankAccount{
    // Use public access modifiers -> public, private ,and protected 
    public String name;
    private int empId;
    private double salary;

    // constructor 
    BankAccount(String name, int empId , double salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }

    // getter 
    void getAccount(){
        System.out.printf("%s %d %.2f\n",this.name,this.empId,this.salary);
    }

    // setter 
    double setAccount(double amount){
        // amount=this.salary;
        this.salary+=amount;
        return  this.salary;
    }
}
public class main {
    public static void main(String [] args){
        // code here
        BankAccount h1=new BankAccount("sameer", 1,400000);
        h1.getAccount();
        System.out.println(h1.setAccount(6743));
        h1.getAccount();
    }
    
}
