import java.util.Scanner;

class customerlogin extends Orderfood {
void cusLogin() {
        Scanner scanner = new Scanner(System.in);
        long userId;

        while (true) {
            System.out.println("\n\n\n\n\t\t---------------------");
            System.out.print("\t\tEnter Login Id = ");
            userId = scanner.nextLong();
            System.out.println("\t\t---------------------");

            if (userId != 67890) {
                System.out.println("\n\t\tDon't try to be smart.....Enter correct id\n");
            } else {
                System.out.println("\n\n\t\tWelcome to Java Green,\n");
                break;
            }
        }

        String pwd = "i";
        String pass = "";
        char c;

        System.out.print("\n\n\t\tPassword = ");

        while (true) {
            c = scanner.next().charAt(0);
            System.out.println("*");

            if (c == '\n') { 
                break; 
            }

            pass = pass + c; 

        if (pass.equals(pwd)) {
            System.out.println("\n\n\t\tAccess Granted. Welcome to our system\n\n\n\t\t");
            scanner.nextLine(); 
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
            shopfoodorder();
        } else {
            System.out.println("\n\t\tWrong Password");
            cusLogin(); 
        }}
        scanner.close();
    }
}

    
