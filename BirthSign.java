/*
 * An if else exercise to find out which zodiac sign you are
 */

public class BirthSign {
    public static void main(String[] args) {
        Signs.FindYourSign();
        
    }
    
    class Signs{
    
    public static void Sign(int day, int month)

    {
        if ( ( day < 1 ) || ( day > 31) || ( month < 1 ) || ( month > 12) )
        {
            System.out.println("You entered an incorrect value.");
        } else if (( month == 1 ) && ( day >= 1 ) && (day <= 31)){
            if ( day <= 21 ) {
                System.out.println("Capricorn");
            } else {
                System.out.println("Aquarius");
            }
        } else if (( month == 2 ) && ( day >= 1 ) && (day <= 29)){
            if ( day <= 19 ){
                System.out.println("Aquarius");
            }else{
                System.out.println("Pisces");
            }
        } else if (( month == 3 ) && ( day >= 1 ) && (day <= 31)){
            if ( day <= 20 ){
                System.out.println("Pisces");
            }else{
                System.out.println("Aries");
            }
        } else if (( month == 4 ) && ( day >= 1 ) && (day <= 30)){
            if ( day <= 20 ){
                System.out.println("Aries");
            }else{
                System.out.println("Taurus");
            }
        } else if (( month == 5 ) && ( day >= 1 ) && (day <= 30)){
            if ( day <= 21 ){
                System.out.println("Taurus");
            }else{
                System.out.println("Gemini");
            }
        } else if (( month == 6 ) && ( day >= 1 ) && (day <= 30)){
            if ( day <= 22 ){
                System.out.println("Gemini");
            }else{
                System.out.println("Cancer");
            }
        } else if (( month == 7 ) && ( day >= 1 ) && (day <= 31)){
            if ( day <= 22 ){
                System.out.println("Cancer");
            }else{
                System.out.println("Leo");
            }
        } else if (( month == 8 ) && ( day >= 1 ) && (day <= 31)){
            if ( day <= 22 ){
                System.out.println("Leo");
            }else{
                System.out.println("Virgo");
            }
        } else if (( month == 9 ) && ( day >= 1 ) && (day <= 30)){
            if ( day <= 22){
                System.out.println("Virgo");
            }else{
                System.out.println("Libra");
            }   
        } else if (( month == 10 ) && ( day >= 1 ) && (day <= 31)){
            if ( day <= 22 ){
                System.out.println("Libra");
            }else{
                System.out.println("Scorpion");
            }
        } else if (( month == 11 ) && ( day >= 1 ) && (day <= 30)){
            if ( day <= 21 ){
                System.out.println("Scorpion");
            }else{
                System.out.println("Sagittarius");
            }
        } else if (( month == 12 ) && ( day >= 1 ) && (day <= 30)){
            if ( day <= 21 ){
                System.out.println("Sagittarius");
            }else{
                System.out.println("Capricorn");
            }
        }

    
            
        }
    
    public static void FindYourSign()
    {
        boolean check = true;

        String yes = "yes" , no = "no";

        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (check){
            System.out.println("Please enter your birthday");

            int day = kb.nextInt();

            System.out.println("Please enter your the month number you born");

            int month = kb.nextInt();

            Signs.Sign(day, month);

            System.out.println("Do you like to continue ? Please type yes/no");

           String control = kb.next();

           if (control.equals(yes)){
            check = true;

           }else{
            check = false;
           }

        System.out.println("Bye!!");


    }

}

    }

}
