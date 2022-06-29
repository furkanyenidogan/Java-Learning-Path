public class RecursionPower {
    public static void main(String[] args) {
        System.out.println( power(5, 3));
    }
    
    public static int power(int base, int exp){
        if (exp !=0){
           return (base * power(base, exp-1));
        }else {
           return 1;
        }
    }

}