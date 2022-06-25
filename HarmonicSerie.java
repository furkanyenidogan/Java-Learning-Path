public class HarmonicSerie {
    public static void main(String[] args) {
        System.out.println(SumHarmonic(5));
    }

    public static double SumHarmonic(int n){
        double sum = 0;

        for( double i = 1 ; i <= n ; i++ ){
            sum += 1/i;
        }
        
        return sum;
    }
}
