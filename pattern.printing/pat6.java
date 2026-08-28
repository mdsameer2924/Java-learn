public class pat6{
    public static void main(String[] args){
        int n=4;
        for(int r=1; r<=n; r++){
            //spaces
            for(int col=1; col<=r-1; col++){
                // for each row -> spaces (0->3)
                System.out.print("  ");
            }
            //stars
            for(int col=1; col<=2*n-r-(r-1); col++){
                // for each row -> stars (7->1) odd
                System.out.print("* ");
            }
            // change row line 
            System.out.println();
        }
    }
}