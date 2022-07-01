public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(countDigits(123));
        System.out.println(myPow(2, 3));
        System.out.println(sumArmstrong(123));
        System.out.println(sumArmstrong(1634));
        System.out.println(isArmstrong(123));
        System.out.println(isArmstrong(1634));

        for ( int i = 0; i < 100000; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static int countDigits(int n) 
    {
        int count = 0;

        while ( n != 0){
            n = n / 10;
            ++count;
        }
        
        return count;
    }

    public static int myPow(int base, int exp) 
    {
        int result = 1;

        for (int i = 1; i <= exp; i++){
            result *= base;
        }

        return result;
 
    }

    public static int sumArmstrong ( int n ) 
    {

        int count = countDigits(n);

        int total = 0;

        while (n != 0) {
			total += myPow(n % 10, count);
			n /= 10;
		}

        return total;
        
    }

    public static boolean isArmstrong( int n ) {
        return  n >= 0 && sumArmstrong(n) == n;
        
    }


}
