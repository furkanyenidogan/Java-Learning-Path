import javax.lang.model.util.ElementScanner14;

public class PassOrNot {
    public static void main(String[] args) {
        Grade.RunPass();
        
    }
    
    class Grade{
        public static boolean CheckPass(int chemistry, int english, int music, int pyhsics, int biology )
        {
            int sum = 0;

            if ((chemistry > 0) && (chemistry < 100)){
                sum += chemistry;
            }else 
                System.out.println("scores must be between 0 and 100");
            
            if ((english > 0) && (english < 100)){
                sum += english;
            }else 
                System.out.println("scores must be between 0 and 100");

            if ((music > 0) && (music < 100)){
                sum += music;
            }else 
                System.out.println("scores must be between 0 and 100");
        
            if ((pyhsics > 0) && (pyhsics < 100)){
                sum += pyhsics;
            }else 
                System.out.println("scores must be between 0 and 100");

            if ((biology > 0) && (biology < 100)){
                sum += pyhsics;
            }else 
                System.out.println("scores must be between 0 and 100");
            
            return sum >= 55;
        }

        public static void RunPass()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            System.out.println("Please enter your scores ");

            System.out.println("Please enter your chemistry score ");
            int chemistry = kb.nextInt();
            System.out.println("Please enter your english score ");
            int english = kb.nextInt();
            System.out.println("Please enter your music score ");
            int music = kb.nextInt();
            System.out.println("Please enter your pyhsics score ");
            int pyhsics = kb.nextInt();
            System.out.println("Please enter your biology score ");
            int biology = kb.nextInt();

            if (Grade.CheckPass(chemistry, english, music, pyhsics, biology)){
                System.out.println("Passed");
            }else 
                System.out.println("Failed");

        }

    }


}
