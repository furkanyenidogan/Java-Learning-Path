public class AvgDivide3and4 {
    public static void main(String[] args) {
        AvgDivide3and4.Divide3and4(20);
        AvgDivide3and4.Divide3and4(50);
        
    }

    public static void Divide3and4(int limit) {
        int count, sum;
        double avg;
        
        sum = 0;
        count = 0;

        for (int i = 1 ; i < limit ; i++){
            if ( i % 12 == 0 ){
                count += 1;
                sum += i;
            }
        }

        avg = sum / count;

        System.out.printf( "Average of common multiples of 3 and 4 until %d is %f %n",limit, avg );
        
    }
    
}
