/*
Question 1 (Easy): The Student Setup
Create a class Student with attributes name (String) and grade (char).
Write a parameterized constructor that uses the this keyword to initialize these attributes.
Create one Student object in your public static void main method, passing the values directly into the constructor,
and print the student's name and grade.
*/


package practice;

class Student{
    
    // class member/attributes
    String name;
    char grade;

    // Constructor never use return type it's might look like method but it's different from method
    Student(String name,char grade){
        // name=name;
        this.grade=grade;
    }

    // Methods 
    void displayStudentInfo(){
        name="mausam";
        System.out.printf("Name: %s | Grade: %c\n",name,this.grade);
    }
}

public class Q1 {

    public static void main(String[] args){
        // code here 
        Student s1=new Student("Sonu", 'A');
        s1.displayStudentInfo();

    }
    
}



