import java.util.*;

public class Main {
    public static void main(String[] args) {
      fib(9);
      
  }
  
   static void fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            System.out.println(a);
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
            
            System.out.println(b);
        }
        
    }

}
