/*
Program to calculate combination and factorial in Java
*/

public class Factorial {
    public static void main(String[] args) {
       int a = Factorial.combination(5, 2);
       
       System.out.println(a);
        
    }
    
    public static int factorial(int number) {   
            if (number == 0)    
              return 1;    
            else    
              return(number * factorial(number-1));    
           }   
           
    public static int combination( int n , int r){
        int result;

        result = factorial(n) / (factorial(r) * factorial(n-r));
        
        return result;

    }
        
}
