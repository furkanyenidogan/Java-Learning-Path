class Grocery {
    public static void main(String[] args) {
        
        double apple,banana, pear, tomato, eggplant,applekg,bananakg, pearkg, tomatokg, eggplantkg,total;
        
        apple = 3.67;
        banana = 0.95;
        pear = 2.14;
        tomato = 1.11;
        eggplant = 5.0;
        
        java.util.Scanner kb = new java.util.Scanner(System.in);


        System.out.println("how many kg Apple:");
        applekg = Double.parseDouble(kb.nextLine());

        System.out.println("how many kg banana:");
        bananakg = Double.parseDouble(kb.nextLine());
        
        System.out.println("how many kg pear:");
        pearkg = Double.parseDouble(kb.nextLine());

        System.out.println("how many kg tomato:");
        tomatokg = Double.parseDouble(kb.nextLine());

        System.out.println("how many kg banana:");
        eggplantkg = Double.parseDouble(kb.nextLine());

        total = (apple*applekg) + (banana*bananakg) + (pear*pearkg) +(tomato*tomatokg)+ (eggplant*eggplantkg);

        System.out.println("Total of your purchase is " + total);
        
    }
}




