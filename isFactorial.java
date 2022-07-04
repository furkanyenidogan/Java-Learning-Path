/*
 * A number whose sum of the factorials of its digits is equal to itself is called factorian.
 */

public class isFactorial {
    public static void main(String[] args) {
        isFactorianApp(100000);
        System.out.println();
        System.out.println(factorial(5) + factorial(8) + factorial(5)+factorial(0)+factorial(4));
       
        //System.out.println( isFactorian(16));
        //System.out.println(factorial(16));
      

        
        
    }

    public static boolean isFactorian( int n ) {
        int sum = 0;
        int checknumber = n;

        if ( n < 10 ){
            sum = factorial(n);
            return sum == n;
        }

        while ( n != 0 ){
            sum = sum + factorial(n%10);
            n = n/10;
        }
        //System.out.printf("%d --> %d%n",checknumber,sum);
     
        return sum == checknumber;
    }

    public static int factorial(int number) {   
        if (number == 0)    
          return 1;    
        else    
          return(number * factorial(number-1));    
       }   
    
       public static void isFactorianApp( int n ) {
            for ( int i = 0 ; i < n ; ++i){
                if (isFactorian(i)){
                    System.out.print(i + " ");

                }
            }
        
       }

}
