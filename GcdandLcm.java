public class GcdandLcm {
    public static void main(String[] args) {
        System.out.println("GCD = " + gcd(24,18) + " LCM = " + lcm(24, 18));
    }

    public static int gcd( int a, int b ){
        while ( a != b ){
            if (a > b){
                a -= b;
            } else if (b > a) {
                 b -= a; 
            }
        }
        return a > b ? a:b;
    }

    public static int lcm( int a, int b ) {
        return (a*b)/gcd(a, b);
        
    }
}
