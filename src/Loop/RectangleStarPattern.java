package Loop;

public class RectangleStarPattern {
   public static void main(String[] args) {
       // Rectangle Star Pattern

       int n = 4;
       // This is the value of row

       for(int i = 0; i<= n ; i++){
           // print  each row
           for (int j = 0; j <= 6; j++){
               // print  each column
               System.out.print("* ");
           }
           System.out.println();
       }

    }
}
