public class update{
    static void updateValue(int x){
        x+=10;
        System.out.println("updated value: "+x);
    }
    static void main(String[] args){
        int x=5; 
        updateValue(x);
        System.out.println(x);
    }
}