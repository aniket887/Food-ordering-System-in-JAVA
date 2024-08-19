import java.util.Scanner;
class ownerlogin extends owner {

    void ownLogin() {
        Scanner scanner = new Scanner(System.in);
        long userId; 

        while (true) {
            System.out.println("\n\n\n\n\t\t---------------------");
            System.out.print("\t\tEnter Login Id = ");
            userId = scanner.nextLong();
            System.out.println("\t\t---------------------");
            
            if (userId != 12345) {
                System.out.println("\n\t\tDon't try to be smart.....Enter correct id\n");
            } else {
                System.out.println("\n\n\t\tWelcome to Java Green,\n");
                break; 
            }
        }

        String pwd = "h"; 
        String pass = "";    
        char c;
        
        System.out.print("\n\n\t\tPassword = ");
        
        while (true) {
            c = scanner.next().charAt(0);
            System.out.print("*"); 
            
            if (c == '\n') { 
                break; 
            }
            
            pass = pass + c; 
        
        
        if (pass.equals(pwd)) {
            System.out.println("\n\n\t\tAccess Granted. Welcome to our system\n\n\n\t\t");
            scanner.nextLine(); 
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
            shopfoodowner();
        } else {
            System.out.println("\n\t\tWrong Password");
            ownLogin(); 
        }}
        scanner.close();
    }
}
