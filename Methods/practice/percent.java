import java.util.Scanner;
public class percent{
    static void per(Float obtained, Float total){
        float div=(obtained/total)*100;
        System.out.println(String.format("Percentage: %.2f%%",div));
    }
    static void main(String[] args){
        System.out.println("===Marks percenate calculator.===");
        System.out.println();
        System.out.print("Enter your math marks: ");
        Scanner sc=new Scanner(System.in);
        float maths=sc.nextFloat();
        System.out.print("Enter your English marks: ");
        float eng=sc.nextFloat();
        System.out.print("Enter your java marks: ");
        float java=sc.nextFloat();
        System.out.print("Enter your Operating system marks: ");
        float os=sc.nextFloat();
        System.out.print("Enter your Science marks: ");
        float science=sc.nextFloat();
        float obtained=maths+eng+java+os+science;
        per(obtained,500f);
    }
}
