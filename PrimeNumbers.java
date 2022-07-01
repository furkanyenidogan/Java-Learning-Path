public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++){
            if ( isPrime(i) ){
                System.out.println(i);
            }
        }

        
    }
    
    public static boolean isPrime( long n ) 
    {

        if ( n <= 1 ){
            return false;
        }

        if ( n % 2 == 0 ) {
            return n == 2;
        }

        if ( n % 3 == 0 ){
            return n == 3;
        }

        if ( n % 5 == 0 ){
            return n == 5;
        }

        if ( n % 7 == 0){
            return n == 7;
        }

        for ( long i = 11; i*i <= n; i+=2){
            if ( n % i == 0){
                return false;
            }
        }

        return true;
        
    }
}
