/*
 All even numbers greater than 2 can be written as the sum of two prime numbers ( Goldbach's theorem). Java program that takes an even number from the keyboard and prints it as the sum of two prime numbers
 */

public class GoldbachNumbers {
    public static void main(String[] args) {
        Goldbach(16);
        System.out.println("-----------");
        Goldbach(48);
        System.out.println("-----------");
        Goldbach(8);
        
    }

    public static boolean isPrime( int n ) 
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

    public static void Goldbach( int n ) {
        int a = 0;

        for ( int i = 1; i <= n; i++){
            a = n - i;
            if (isPrime(i) && isPrime(a) && (a + i == n )){
                System.out.printf( "%d + %d = %d%n",a,i,n);
               
            }

        }
        
    }
}
