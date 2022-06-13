/*
 * Basic triangle area calculator
 */

public class Triangle {
    public static void main(String[] args) {
        Triangle.AreaCalc();
        
    }
    
    public static double Area(double a, double b, double c) {
        double u;

        u = (a+b+c)/2;

        return Math.sqrt(u*(u-a)*(u-b)*(u-c));
    }

    public static void AreaCalc() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Please enter sides of triangle :");

        double a = Double.parseDouble(kb.nextLine());
        double b = Double.parseDouble(kb.nextLine());
        double c = Double.parseDouble(kb.nextLine());

        System.out.println("Area of triange is " + Triangle.Area(a, b, c));
    }
}
