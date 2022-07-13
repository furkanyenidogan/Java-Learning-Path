import java.util.*;

public class BasicATM {
        public static void main(String[] args) {
       int userBalance = 1500;
       int passwordRights = 3;
       int option ;
       String userName = "Furkan";
       String userPassword = "123Furkan";

       Scanner kb = new Scanner(System.in);

       while(passwordRights > 0){
        
        System.out.println("Please enter your name ");
        String name = kb.nextLine();

        System.out.println("Please enter your password");
        String password = kb.nextLine();

        if ( name.equals(userName) && password.equals(userPassword) ){
            System.out.println("Welcome the Java Bank");
            do {
                System.out.println("Please select the action you want to take");
                System.out.println("1.Deposit money");
                System.out.println("2.Withdraw money");
                System.out.println("3.Check money");
                System.out.println("4.Exit");

                option = kb.nextInt();

                switch(option){
                    case 1:
                        System.out.println("Please enter the deposit amount");
                        int depositMoney = kb.nextInt();
                        userBalance = userBalance + depositMoney;
                        System.out.println("============================");
                        System.out.println("Your balance is " + userBalance);
                        System.out.println("============================");
                        break;

                    case 2:
                        System.out.println("Please enter the withdraw amount");
                        int withdrawMoney = kb.nextInt();
                        userBalance = userBalance - withdrawMoney;
                        System.out.println("============================");
                        System.out.println("Your balance is " + userBalance);
                        System.out.println("============================");
                        break;

                    case 3:
                        System.out.println("============================");
                        System.out.println("Your balance is " + userBalance);
                        System.out.println("============================");
                        break;
    
                }

            } while (option != 4 );
            System.out.println("Have a nice day");
            break;
           
        }else{
            --passwordRights;
            if (passwordRights > 0){
                System.out.println("Your remaining rights" + passwordRights);
                System.out.println("Please try again");
            }else{
                System.out.println("Your account is blocked, please contact with customer service for your safety!");
            }
        }

       }




    }
    
}

