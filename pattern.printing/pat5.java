/*
pattern
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *


*/




public class pat5{
    public static void main(String[] args){
        int n=5;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row; col++){
                // spaces
                System.out.print("  ");
            }

            for(int col=1; col<=2*row-1; col++){
                // stars
                
                System.out.print("* ");
                

            }

            //change row line
            System.out.println();
        }
    
        
    }
}