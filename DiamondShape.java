import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 5;
      
      for (int i = 0; i <= n; i++){
        for ( int k = 0; k < (n-i); k++){
          System.out.print(" ");
        }
        for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
      }
      
      for ( int i = n - 1; i >= 0; i-- ){
        for ( int k = (n - i); k >= 1; k-- ){
          System.out.print(" ");
        }
        
        for (int j = (2 * i + 1) ; j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        
      }

      
  }
}
