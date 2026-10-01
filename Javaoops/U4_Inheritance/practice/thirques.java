/* 
Question 3 (Difficult): The School System
Create a parent class Person with attributes name and age. Write a constructor to initialize them, and a method displayPerson() to print them.
Create a child class Teacher that extends Person. Add a new attribute subject (String).
Write a constructor in Teacher that takes name, age, and subject, using super appropriately.
Write a method displayTeacher() in the child class that first calls the parent's displayPerson() method
(hint: you can just call it directly, or use super.displayPerson()), and then prints the subject.
In main, create a Teacher object and call displayTeacher().
*/ 

package practice;
class Person{
    String name;
    int age;

    // Constructor
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    // method 
    public void displayPerson(){
        System.out.printf("Name: %s | Age: %d\n",this.name,this.age);
    }
}

// Child class inherit Person [parent]
class Teacher extends Person{
    String subject;
    // constructor
    Teacher(String name,int age, String subject){
        super(name,age);
        this.subject=subject;
    }
    public void displayTeacher(){
       super.displayPerson();  // using parent method inside child class
       System.out.printf("Subject: %s\n",this.subject);
    }
}

public class thirques {
    public static void main(String [] args){
        // code here
        Teacher c1=new Teacher("Yashpal", 35, "Software engineering");
        c1.displayTeacher();
    }
    
}
