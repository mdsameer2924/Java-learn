package oops;
public class Manager extends  Employee{
    protected String name;
    protected int age;
    protected int empID;
    protected double salary;
    public Manager(String name,int age,int empID,double salary,double empBonus){
        super(name, age, empID, salary);
        this.name=name;
        this.age=age;
        this.empID=empID;
        this.salary=salary;
        this.empBonus=empBonus;
    }
    @Override 
    public double displayInfo(){
        double base=this.empBonus;
        base=salary+this.empBonus;
        return base;

    }
}