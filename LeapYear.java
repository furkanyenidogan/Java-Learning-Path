public class LeapYear {
    public static void main(String[] args) {
        int year;

        java.util.Scanner kb = new java.util.Scanner(System.in);

        year =Integer.parseInt(kb.nextLine());

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Leap year");
        else
            System.out.println("Not Leap year");
    }
    
}
