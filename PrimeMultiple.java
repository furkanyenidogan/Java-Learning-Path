import java.util.*;

public class PrimeMultiple {
    public static void main(String[] args) {
        int n;
        int k = 2;

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the number");
        n = kb.nextInt();

        while( n != 1){
            if ( n % k == 0){
                System.out.print(k + " ");
                n = n / k;
            }else{
                ++k;
            }
        }
    
      
        
    }

}
