public class maxn{
    static void getmax(int a, int b){
        if(a>b){
            System.out.println(String.format("a: %d",a));
        }else if(a<b){
            System.out.println(String.format("b: %d",b));
        }else{
            System.out.println("equal draw");
        }
    }
    static void main(String[] args){
        getmax(5,5);
    }
}