/*
 Write a "Recursive" method in Java language without using a loop that follows the following rule according to the value n received from the user.

Expected result : Subtract 5 digits from the entered number until the entered number is 0 or negative. Print the last value on the screen during each subtraction. After the number becomes negative or 0, add 5 again. Again, print the last value of the number on the screen during each addition operation.

 */

import java.util.*;

public class RecursiveModel {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the number");
        Recursive.design(kb.nextInt());
    }
}

class Recursive{

    public static int sub(int i) {
        int r = 5;
        System.out.printf("%d ",i);
        return (i > 0) ? sub(i-r) : i + r;
    }

    public static int add(int i, int b) {
        int r = 5;
        System.out.printf("%d ",i);
        return (i < b) ? add(i + r,b) : i;
    }

    public static void design(int n) {
        add(sub(n), n);
        
    }

}

