package oops;

public class Employee{
    protected String name;
    protected int age;
    protected  int empId;
    protected double salary;
public Employee(String name,int age,int empId,double salary){
    this.name=name;
    this.empId=empId;
    this.salary=salary;
    this.age=age;
}

// getter method 
public void displayInfo(){
    System.out.println(String.format("Name: %s\nAge: %d\nEmpID: %d\nSalary: %.2f",name,age,empId,salary));
}

}