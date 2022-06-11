public class Bodymass{
    public static void main(String[] args) {
        double weight, height, bmo;
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Your weight :");
     
        weight = Double.parseDouble(kb.nextLine());

        System.out.println("Your height :");
        
        height = Double.parseDouble(kb.nextLine());


        bmo = Bmocalc.masscalculator(weight, height);

        System.out.println(bmo);

        
    }
}

class Bmocalc{
    public static double masscalculator(double w, double h){
        return w / (h*h);

    }

}