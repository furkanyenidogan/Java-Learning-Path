import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Scanner kb = new Scanner(System.in);
     
      
      int c = 1;
      
      while (c != 0){
        System.out.println("please enter c");
        c = kb.nextInt();
        Solution.displayDuration(c);
      }
   
  }
}

class Solution{
  
  public static void displayDuration( int n)
  {
    
    int sec = n % 60;
    int min = n / 60 % 60;
    int hour = n / 3600;
    
    System.out.println("   "+hour+":"+min+":"+sec);
    
    if ((n>= 3600)&& (n%60!=0)){
      System.out.printf("%d hours %d minutes %d seconds%n",hour,min,sec);
      }else if ( (n>= 3600)&&(n % 60 == 0)){
          if (n % 3600 != 0){
               System.out.printf("%d hours %d minutes%n",hour,min);
          } else {
              System.out.printf("%d hours %n",hour);
          }
      } else if ((n < 3600) && (n%60==0)){
        System.out.printf("%d minutes%n",min);
      } else if ((n < 3600) && (n%60 !=0)){
          if (n > 60){
            System.out.printf("%d minutes %d sec%n",min,sec);  
          } else {
            System.out.printf("%d sec%n",sec); 
          }
        
      }
      

  }
}
