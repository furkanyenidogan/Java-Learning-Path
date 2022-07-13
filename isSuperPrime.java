public class Main
{
	public static void main(String[] args) {
	    System.out.println(isSuperPrime(5));
	    System.out.println(isSuperPrime(11));
	    System.out.println(isSuperPrime(17));
	
	}
	
	public static boolean isSuperPrime(int n){
	    int count = 1;
	    
	    for (int i = 1; i < n; i++){
	        if (isPrime(i))
	            ++count;
	    }
	    return ( isPrime(n) && isPrime(count));
	    
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
