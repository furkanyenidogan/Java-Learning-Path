public class Pow4and5 {
    public static void main(String[] args) {
        int n;

        double i4,i5;

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("n = ");

        n = kb.nextInt();

        for (int i = 0 ; i <= n ; i ++){
            i4 = Math.pow(4, i);
            i5 = Math.pow(5, i);
            System.out.printf("4 ^ %d = %f and 5 ^ %d = %f %n",i,i4,i,i5);
        }
    }
    
}
