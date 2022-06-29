import java.util.*;

/*
 * A Java program that finds the largest and smallest numbers from N counting numbers entered from the keyboard and writes these numbers to the screen.
 */

public class MaxandMin {
    public static void main(String[] args) {
        findMaxAndMin();
        
    }

    public static void findMaxAndMin()
    {
        Scanner kb = new Scanner(System.in);

        int i = 1, min = 0 , max = 0;
    
        System.out.println(" How many number would you like to enter ?");

        int count = kb.nextInt();

        while (i <= count){

            System.out.println("Please enter the " + i + ". number");

            int input = kb.nextInt();

            if (i == 1){
                max = min = input;
            } else{
                if ( input > max ){
                    max = input;
                } else if ( input < min ){
                    min = input;
                }
            }
          
            i++;
        }

        System.out.println("max number in " + count + " number is " + max );
        System.out.println("min number in " + count + " number is " + min );
    }
    
}
