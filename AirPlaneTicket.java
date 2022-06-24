public class AirPlaneTicket {
    public static void main(String[] args) {
        AirPlaneTicket.TicketPrice(200, 1, 35);
        AirPlaneTicket.TicketPrice(1500, 2, 20);
        AirPlaneTicket.TicketPrice(-500, 2, 20);
    
    }
    
    public static void TicketPrice(double distance, int oneway, int age) 
    {   
        double finalprice; 

        if (distance<=0 || age <=0 || (oneway != 1 && oneway != 2)) {
            System.out.println("Error");
        } else if ( oneway == 1){
            finalprice = TotalPrice(distance) - AgeDiscount(age,distance);
            System.out.println(finalprice);
        } else if ( oneway == 2 ) {
            finalprice = TotalPrice(distance) - AgeDiscount(age,distance);
            finalprice -= finalprice * OneWayDiscount(oneway);
            finalprice *= 2;
            System.out.println(finalprice);
        }
 
    }
        
    public static double TotalPrice(double distance) 
    {
        double perkm = 0.1;
        double totalprice = distance * perkm;

        return totalprice;
    }

    public static double AgeDiscount(int age,double distance) 
    {
        double agediscount;

        if ( age <= 12 ){
            agediscount = TotalPrice(distance) * 0.5;
        } else if ( ( age > 12 ) && ( age < 24 ) ) {
            agediscount = TotalPrice(distance) * 0.1;
        } else if ( age >= 65 ){
            agediscount = TotalPrice(distance) * 0.3;
        } else {
            agediscount = 0;
        }
        
        return agediscount;
    }
    
    public static double OneWayDiscount(int oneway) {

        double onewaydiscount;

        if ( oneway == 1 ){
            onewaydiscount = 0;
        } else {
            onewaydiscount = 0.2;
        }

        return onewaydiscount; 
        
    }
    
}
