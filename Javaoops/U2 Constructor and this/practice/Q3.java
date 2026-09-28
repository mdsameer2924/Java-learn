/* 
Question 3 (Difficult): The Employee Salary Setup
Create an Employee class with attributes empId (int), name (String), and monthlySalary (double).

Write a constructor to initialize all three using this.

Write a method getYearlySalary() that returns (does not print) the monthlySalary multiplied by 12.

In main, create an Employee object. Print their name and their calculated yearly salary directly to the console.
*/

package practice;
// userdefined class here
class Employee{
    
    // fields
    int empId;
    String name;
    double monthlySalary;

    // constructor
    Employee(int empId,String name,double monthlySalary){
        this.empId=empId;
        this.name=name;
        this.monthlySalary=monthlySalary;
    }

    // methods [behaviour]
    double getYearlySalary(){
        double yearlySalary=this.monthlySalary*12;
        return yearlySalary;

    }

    // method display detials
    void employeeInfo(){
        System.out.printf("Employee ID: %d | Name: %s | LPA: %.2f\n",empId,name,getYearlySalary());
    }

}
public class Q3 {
    public static void main(String[] args){
        // code here
        Employee e1=new Employee(1,"Ravi",30000);
        e1.employeeInfo();
    }
    
}
