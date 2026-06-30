
/*
    Pattern
* * * * *
* * * * *
* * * * *    

*/


//package pattern.printing;
public class pat2 {
    public static void main(String[] args){
        byte rows=3;
        byte cols=5;

        // outer loop
        for(int i=1; i<=rows; i++){
            // inner loop 
            // for each row -> col=n
            for(int j=1; j<=cols; j++){
                // print starts
                System.out.print(" * ");
            }
            // change line after finsh each rows
            System.out.println("");
        }


    }
}
