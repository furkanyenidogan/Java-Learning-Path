import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        run();
        
    }
    
    public static void isPerfectNumber(int n) {

        int sum = 0;

        for ( int i = 1 ; i < n; i++ ){
            if ( n % i == 0){
                sum += i;
            } 
        }

        if ( n == sum){
            System.out.println(n + " Perfect number");
        }else{
            System.out.println(n + " Not a perfect number");
        }
        
    }

    public static void run() {
        
        Scanner kb = new Scanner(System.in);

        System.out.println(" Please enter a positive number to start ");

        int n = kb.nextInt();

        while (n > 0){

            System.out.println("Please enter a number to find out perfect or not ");

            int number = kb.nextInt();

            isPerfectNumber(number);

            System.out.println();
            
        }


        
    }
}
