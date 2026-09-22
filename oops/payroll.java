package oops;
public class payroll{
    static void main(String[] args){
        Employee e1=new Employee("sameer", 21, 1, 100000);
        Employee e2=new Employee("Ayan", 20, 2, 80000);
        e1.displayInfo();
        e2.displayInfo();
    }
}