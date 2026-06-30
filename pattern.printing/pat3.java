/*
Pattern -> right angle triangle
* 
* *
* * *
* * * *
* * * * *
*/



// Mine approach



// public class pat3 {
//     public static void main(String [] args){
//         int n=5;
//         // outer loop 
//         // total rows=5
//         for(int i=1; i<=n; i++){
//             // inner loops 
//             // for each rows = 1->5  meand i
//             for(int j=n-1; j>=n-i; j--){
//                 // print star
//                 System.out.print(" * ");
//             }
//             // change line after each row 
//             System.out.println("");
//         }
//     }    
// }


// sir approach
public class pat3{
    public static void main(String [] args){
        int n=5;

        // outer loop  row(1->n)
        for(int row=1; row<=n; row++){
            
            // inner loop 
            // for each row col(1->row)
            for(int col=1; col<=row; col++){
                System.out.print(" * ");
            }
            // change lines after each row
            System.out.println("");
        }
    }
}






















        