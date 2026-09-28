import java.util.Scanner;
public class in3{
  static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter your name: ");
  String name=sc.nextLine();
  System.out.print("Enter your age: ");
  int age=sc.nextInt();
  sc.nextLine();
  System.out.println(String.format("my name is %s and i am %d year old. ",name,age));
  
  }
}
