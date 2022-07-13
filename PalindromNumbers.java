public class PalindromNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrom(11));
        System.out.println(isPalindrom(9889));
        System.out.println(isPalindrom(123));
        
    }
    
    public static int reverseNumber(int n)
    {
        int result = 0;

        while ( n != 0 ){

            result = result * 10 + n % 10;
            n /= 10;
        }

        return result;
    }

    public static boolean isPalindrom(int n){
        return n == reverseNumber(n);
    }
}
