import javax.lang.model.util.ElementScanner14;

public class EventPlanner {
    public static void main(String[] args) {
        int heat;

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Degree");

        heat = kb.nextInt();

        if (heat <= 5){
            System.out.println("Ski");
        } else if ((heat>5)&&(heat <= 15)){
            System.out.println("Cinema");
        } else if ((heat > 15)&&(heat <=25)){
            System.out.println("Picnic");
        }else 
            System.out.println("Swimming");



             
    }
    
}
