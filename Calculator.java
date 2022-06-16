/*
 * A simple calculator program that operates with 2 numbers created to work the Switch case application.
 */


public class Calculator {
    public static void main(String[] args) {
        CalculatorApp();
        
    }

    public static double Sum(double a, double b)
    {
        return a + b;
    }
    
    public static double Sub(double a, double b)
    {
        return a - b;
    }

    public static double Mult(double a, double b)
    {
        return a*b;
    }

    public static double Div(double a, double b)
    {
       return a/b;
     
    }

    public static double Mod(double a, double b)
    {
        return a%b;
    }

    public static void CalculatorApp()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Please enter first number for calculator");

        double number1 = Double.parseDouble(kb.nextLine());

        System.out.println("Please select your operation ");

        String operator = kb.nextLine();

        System.out.println("Please enter second number for calculator");

        double number2 = Double.parseDouble(kb.nextLine());

        switch (operator) {
            case "+":
                System.out.printf("%f + %f = %f\n", number1,number2,Calculator.Sum(number1,number2));
                break;
            case "-":
                System.out.printf("%f - %f = %f\n", number1,number2,Calculator.Sub(number1,number2));
                break;
            case "*":
                System.out.printf("%f * %f = %f\n", number1,number2,Calculator.Mult(number1,number2));
                break;
            case "/":
                System.out.printf("%f / %f = %f\n", number1,number2,Calculator.Div(number1,number2));
                break;
            case "%":
                System.out.printf("%f %% %f = %f\n", number1,number2,Calculator.Mod(number1,number2));
                break;
            default:
                System.out.println("You can only choose given operators");
                break;
        }


    }
}
