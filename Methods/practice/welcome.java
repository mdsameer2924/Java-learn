import java.util.Scanner;
public class welcome{
   static void weclomemessage(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your good name: ");
        String name= sc.nextLine();
        System.out.println(String.format("hi, welcome %s.",name));
    }
    public static void main(String[] args){
       weclomemessage();

    }
}