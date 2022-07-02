/*
 * Numbers that are divisible by the sum of their digits are called Harshad (Niven) numbers. This is a java program which controls a number Harshad or not.
 */


public class DecimalHarshad {
    public static void main(String[] args) {
        
        System.out.println(isDecimalHarshad(20));
        System.out.println(isDecimalHarshad(-20));
        System.out.println(isDecimalHarshad(42));
        System.out.println(isDecimalHarshad(55));
    }

    public static int sumRoot( int n ) {
        int sum = 0;

        while ( n != 0 ){
            sum += n % 10;
            n /= 10;
        }

        return sum; 
    }
    
    public static boolean isDecimalHarshad( int n ) {
      
        return (n % sumRoot(n)  == 0) && (n > 0) ? true:false;
        
    }
}
