public class Digits {
    public static void main(String[] args) {
        System.out.println(SumDigits(1234));
    }
    

    public static int SumDigits(int n) {
        int sum = 0;

        while( n != 0){
            sum += n % 10;
            n = n/10;
        }
        return sum;
    }
}
