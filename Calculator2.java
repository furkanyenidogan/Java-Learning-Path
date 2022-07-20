import java.util.*;
public class Calculator2 {
    public static void main(String[] args) {
        
        Calculator.run();

    }
}

class Calculator{

    public static void menu() 
    {
        System.out.println("1.Sum");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divide"); 
        System.out.println("5.Exponent");
        System.out.println("6.Factorial");
        System.out.println("7.Get mode");
        System.out.println("8.Rectuganlar area");
        System.out.println("9.Circle area");
        System.out.println("0.Exit"); 
    }

    public static void sum() 
    {   
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter two numbers to add");
      int a = Integer.parseInt(kb.nextLine());
      int b = Integer.parseInt(kb.nextLine());
      System.out.println(a+b);
    }

    public static void sub() 
    {   
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter two numbers to sub");
      int a = Integer.parseInt(kb.nextLine());
      int b = Integer.parseInt(kb.nextLine());
      System.out.println(a-b);
    }

    public static void mul() 
    {   
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter two numbers to multiple");
      int a = Integer.parseInt(kb.nextLine());
      int b = Integer.parseInt(kb.nextLine());
      System.out.println(a*b);
    }

    public static void div() 
    {   
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter two numbers to multiple");
      double a = Double.parseDouble(kb.nextLine());
      double b = Double.parseDouble(kb.nextLine());
      if ( b == 0){
        System.out.println("Error divider must be greater than 0");
         b = Double.parseDouble(kb.nextLine());
      }else
        System.out.println(a/b);
    }

    public static void exp() 
    {   
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter two numbers to multiple");
      int a = Integer.parseInt(kb.nextLine());
      int b = Integer.parseInt(kb.nextLine());
      System.out.println(Math.pow(a, b));
    }

    public static void factorial() 
    {   
        Scanner kb = new Scanner(System.in);
        System.out.println("Factorial");
        int number = Integer.parseInt(kb.nextLine());
        int result = 1;

        for (int i = 2; i <= number; i++){
            result *= i;
        }

        System.out.println(result);
    }   

    public static void mode() 
    {   
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter two numbers to get mode");
      int a = Integer.parseInt(kb.nextLine());
      int b = Integer.parseInt(kb.nextLine());
      System.out.println(a%b);
    }

    public static void recarea() 
    {   
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter short side");
      int a = Integer.parseInt(kb.nextLine());
      System.out.println("Please enter long side");
      int b = Integer.parseInt(kb.nextLine());
      System.out.println(a*b);
    }

    public static void circleare() 
    {   
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter radius");
      int r = Integer.parseInt(kb.nextLine());
      
      System.out.println(Math.PI*Math.pow(r, 2));
    }

    public static void invalid() 
    {
        System.out.println("Invalid option");   
    }
    
    public static void doOption(int option)
    {
        switch(option){
            case 1:
                sum();
                break;
            case 2:
                sub();
                break;
            case 3:
                mul();
                break;
            case 4:
                div();
                break;
            case 5:
                exp();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mode();
                break;
            case 8:
                recarea();
                break;
            case 9:
                circleare();
                break;
            default:
                invalid();
        }

    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
			menu();
			int option = Integer.parseInt(kb.nextLine());	

            if ( option == 0 ){
                System.out.println("Closed");
                break;
            }
         

			doOption(option);			
		}
    
    }

}
