public class DigitalRoot {
    public static void main(String[] args) {
       
        System.out.println(calculateDigitalRoot(36987));
        
    }
    public static int calculateDigitalRoot( int n ){
        int sum = 0;

        while ( n != 0 || sum > 9 ){
            if ( n == 0){
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
} 