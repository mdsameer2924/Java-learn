import java.util.Scanner;
public class input2{
    void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your favourite foods: ");
        String food=sc.nextLine();
        System.out.print("enter your favourite language: ");
        String lang=sc.nextLine();
        System.out.print(String.format("my name is %s\n\nmy favourite food is %s\nmy favourite language %s.\n",name,food,lang));
    }
}