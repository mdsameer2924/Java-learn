import java.util.Scanner;
public class input1{
    void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine(); // nextline extra use  line  line user another nextline to neturalize previous one 
        System.out.print("enter your hobby: ");
        String hobby=sc.nextLine();
        System.out.print(String.format("hi, how are you\nmy name is %s\ni am %d year old\nmy hobbies are %s etc. ",name,age,hobby));
    }
}