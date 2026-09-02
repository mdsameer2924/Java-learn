public class iseven{
    static void even(int n){
        if(n%2==0){
            System.out.println(String.format("even number: %d",n));
        }

    }
    static void main(String[] args){
        even(5);
        even(8);
    }
}