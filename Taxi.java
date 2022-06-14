/*
 * In this study, a taxi fare calculation program with an 
 * opening fee of 10 Turkish liras, 
 * a minimum fee of 20 Turkish liras 
 * and 2.2 Turkish liras per kilometer has been developed.
 */

public class Taxi {
    public static void main(String[] args) {
        Taxi.TaxiPriceCalc();
        
    }
    
    public static double TaxiPrice(double Km) {
        double openingFee = 10;
        double minPrice = 20;
        double perKm = 2.2;
        double totalPrice = 10 + Km*perKm;

        return totalPrice > 20 ? totalPrice : minPrice;
    }

    public static void TaxiPriceCalc() {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Please enter how many kilometers you want to travel ");

        double Km = Double.parseDouble(kb.nextLine());

        System.out.println("Your taxi fee is " + TaxiPrice(Km));
    } 
 
        
    
}
