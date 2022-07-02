public class CollatzSerie {
    public static void main(String[] args) {
        printCollatz(72543);
        
    }

    public static void printCollatz( int n ) {
        System.out.print(n + " ");
        while ( n != 1){
            if ( n % 2 == 0){
                n /= 2;
                System.out.print(n + " ");
            } else{
                n = 3*n + 1;
                System.out.print(n + " ");
            } 
        }
        System.out.print(" " + "1" + " " );
        
    }
}
