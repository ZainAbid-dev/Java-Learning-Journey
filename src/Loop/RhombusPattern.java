package Loop;

public class RhombusPattern {
   public static void main(String[] args) {
       // Printing the Solid Rhombus Pattern

       int n = 5; //  This is for number of rows

       for(int i = 1; i <= n; i++){
           // This will print the rows

           for(int j = 1; j <=(n- i); j++){
               // This will print the spaces
               System.out.print(" ");
           }
           for(int col = 1; col <= n; col ++){
               // This will print the stars
               System.out.print("* ");
           }
           System.out.println();
       }

    }
}
