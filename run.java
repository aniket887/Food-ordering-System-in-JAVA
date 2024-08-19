import java.util.Scanner;

public class run{


    public static void main (String[] args) {
        int x;
        ownerlogin ownob = new ownerlogin();
        customerlogin cusob = new customerlogin();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\t\t----------------------------------------------------------------");
            System.out.println("\t\t----------------------------------------------------------------");
            System.out.println("\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 \t\t ONLINE JAVA  \t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
            System.out.println("\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 \u2510 Press 1 for Owner login \t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
            System.out.println("\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 \u2510 Press 2 for Customer login     \t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
            System.out.println("\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 \u2510 Press 3 for Exit \t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
            System.out.println("\t\t----------------------------------------------------------------");
            System.out.println("\t\t----------------------------------------------------------------");
            System.out.print("\t\t-->");

            x = scanner.nextInt();

            if (x == 1) {
                ownob.ownLogin();
            } else if (x == 2) {
                cusob.cusLogin();
            } else if (x == 3) {
                System.out.println("\t\t\u2553\u2553\u2588\u2588\u2588\u2588\u2588\u2588 \u2510 Thank you for visiting Java Online \t\u2588\u2588\u2588\u2588\u2588\u2588\u2553\u2553");
                System.out.println("\t\t----------------------------------------------------------------");
                System.out.println("\t\t----------------------------------------------------------------\n\n\n\n");
                break;
            } else {
                System.out.println("\t\t\u2553\u2553\u2588\u2588\u2588\u2588\u2588\u2588 \u2510 wrong input \t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2553\u2553\n");
            }

            scanner.nextLine(); 
            System.out.println("Press Enter to continue...");
            //scanner.nextLine();
        }
        scanner.close();
    }
}
    


