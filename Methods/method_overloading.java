public class method_overloading {

    void sum(int p, int q){
        int add=p+q;
        System.out.println(add);
    }
    
    // method overloading
    void sum(int p, int q, int d){
        int add=p*q;
        System.out.println(add);
        System.out.println(d);
    }
    void main(String[] agrs){
        System.out.println("Hello");
        sum(5,8);
        sum(3,2,1);

    }
}
