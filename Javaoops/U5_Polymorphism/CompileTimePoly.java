// compile time polymorphism

class Calculator{
    
    // method 1
    int add(int a,int b){
        return a+b;
    }

    // method 2
    int add(int a,int b, int c){
        return a+b+c;
    }

    // method 3
    String add(String a,String b){
        return a+b;
    }

}

public class CompileTimePoly {
    public static void main(String[] args){
        // code here
        Calculator n=new Calculator();
        System.out.println(n.add(4,9)); // call method 1 
        System.out.println(n.add(2,2,9));  // call method 2
        System.out.println(n.add("mohd ","sameer"));
    }    
}
