/*Program that terminates the loop when an odd number is entered and returns the sum of multiples of 4 up to the entered number */

public class Multiple4 {
    public static void main(String[] args) {
        int n = 0,sum=0;

        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (n % 2 == 0){
            if ( n % 4 == 0 ){
                sum += n;
            }
            System.out.println("Enter the number");
            n = kb.nextInt();
        } 
        System.out.println("Sum of numbers that are multiples of 4 from the entered numbers " + sum);
    }
}
