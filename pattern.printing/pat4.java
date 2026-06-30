/*
    Pattern
        * * * * *
      * * * * * 
    * * * * * 
  * * * * * 
* * * * * 

*/


public class pat4 {
 public static void main(String[] args){

    int n=5;
    for(int row=1; row<=n; row++){
        // for each row -> spaces, stars

        // spaces
        for(int col=1; col<=n-row; col++){  
            System.out.print("   ");
        }

        // starts
        for(int coli=1; coli<=n; coli++){
            System.out.print(" * ");
        }

        // move to next row
        System.out.println();
    }

    

 }    
}
