public class overload{
    static void display(int n){
        System.out.println(n);
    }
    static void display(String n){
        System.out.println(n);
    }

    static void main(String[] args){
        display("sameer");
    }
}