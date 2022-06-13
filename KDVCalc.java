/*
In this example, how much the VAT tax, which is a type of tax in Turkey, is calculated according to the product price.
This example is one of the study questions in the Patika tutorials.
https://app.patika.dev/courses/java101/pratik-kdv-hesaplama
 */

public class KDVCalc {
    public static void main(String[] args) {
        KDVCalc.CalcKdv();
        
    }
    
    public static double KDV(double price) {
        double KdvRatio = (price<1000) & (price>0) ? 0.18 : 0.08;
        return (price+(price*KdvRatio)) - price;
    }

    public static void CalcKdv() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Please enter your product price without KDV tax :");

        double Price = Double.parseDouble(kb.nextLine());

        double KdvAmount = KDV(Price);

        System.out.print("Your products tax is " +  KdvAmount);  
    }    
    
}
