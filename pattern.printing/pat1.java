/* 
pattern 1 
* * * *
* * * *
* * * *
* * * *
*/
public class pat1{
    public static void main(String[] args){
        //outer loop
        for(int i=1; i<=4; i++){
            // inner loop
            //for each row -> n colmunsn
            for(int j=1; j<=4; j++){
                // print stars
                System.out.print("* ");
            }
            // moving to next line or row
            System.out.println("");
        }
    }
}