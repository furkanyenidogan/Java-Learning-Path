import javax.lang.model.util.ElementScanner14;

public class Passwordcheck {
    public static void main(String[] args) {

        String password, checkpassword, newpassword;

        int choice;

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Please define your password");

        password = kb.nextLine();

        System.out.println("Please enter your password");

        checkpassword = kb.nextLine();

        if (password.equals(checkpassword))
            System.out.println("Password Correct");
        else if(!password.equals(checkpassword))
                System.out.println("Password is wrong do yo want set a new password 1/0");
                choice = kb.nextInt();
                if (choice == 1){
                    System.out.println("Define new password");
                    newpassword = kb.next();
                    if (newpassword.equals(password)){
                        System.out.println("Your password must be different from your last password.");
                    } else{
                        System.out.println("Your password is changed");
                        System.out.printf("New password is %s", newpassword);
                    }
                   
                } else {
                    System.out.println("Returning main page...");
                } 
        
  
    }
    
}
