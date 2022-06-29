public class ReverseNumber {
    public static void main(String[] args) {
       NumberUtil.run();
    }
    
}

class NumberUtil{

    public static int reverseNumber(int n)
    {
        int result = 0;

        while ( n != 0 ){

            result = result * 10 + n % 10;
            n /= 10;
        }

        return result;
    }

    public static void run() {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        int a = 1;

        while ( a != 0 ){

            System.out.println("please enter the number");
            int number = kb.nextInt();

            System.out.print(reverseNumber(number));

            System.out.println("\nContinue 1/0");

            a = kb.nextInt();
        }
        
    }


}
