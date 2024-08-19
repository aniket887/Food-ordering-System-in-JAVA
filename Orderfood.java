import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Orderfood extends Shop{
    
    int ch;
    String y, ye;
    void shopfoodorder(){
        System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t  ================== WELCOME TO FOOD ORDERING SYSTEM ==================\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t  ========================= ENTER SHOP NO. ============================\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        //displayShops();
        Scanner scanner = new Scanner(System.in);
       
       //boolean changeDecision = true;

       do {
        displayShops();
           System.out.print("\nSelect your desired shop (one shop at a time): ");
           ch = scanner.nextInt();
           System.out.print("\nDo you want to change your decision (y/n): ");
           ye = scanner.next();

           if (ye.equalsIgnoreCase("n")) {
                if (ch == 1) {
                displayselectitem();
                displayyurish();
                int total = 0;
                   try {
                       FileWriter write = new FileWriter("order.txt");
                       boolean changeOrder1 = true;

                       while (changeOrder1) {
                           System.out.print("\nEnter your order (one order at a time): ");
                           int order = scanner.nextInt();
                           System.out.print("\nDo you want to change your order (y/n): ");
                           ye = scanner.next();

                           if (ye.equalsIgnoreCase("n")) {
                               System.out.print("\nEnter the Quantity: ");
                               int quantity = scanner.nextInt();
                               total += yurishp[order - 1] * quantity;
                               write.write("You ordered " + yurish[order - 1] + " Rs." + yurishp[order - 1] + "\n");
                               write.write("Quantity: " + quantity + "\n");
                               System.out.println("\nYou ordered " + yurish[order - 1]);
                               System.out.println("Your order was successfully saved");

                               if (order > 9 || order < 1) {
                                   System.out.println("Invalid order. Please select a valid order.");
                                   continue;
                               }

                               System.out.print("\nDo you want another order (yes/no): ");
                               ye = scanner.next();

                               if (ye.equalsIgnoreCase("no")) {
                                   changeOrder1 = false;
                                   displaygenbill();
                                   displayrecipt(total);
                                   write.write("\t\t\t\tTOTAL BILL IS: " + total);
                                   write.close();
                               }
                           }
                       }
                   } catch (IOException e) {
                       System.out.println("Error writing to file.");
                   }}
            else if (ch == 2){
                displayselectitem();
                displayemopizza();
                int total = 0; 
                   try {
                       FileWriter write = new FileWriter("order.txt");
                       boolean changeOrder2 = true;

                       while (changeOrder2) {
                           System.out.print("\nEnter your order (one order at a time): ");
                           int order = scanner.nextInt();
                           System.out.print("\nDo you want to change your order (y/n): ");
                           ye = scanner.next();

                           if (ye.equalsIgnoreCase("n")) {
                               System.out.print("\nEnter the Quantity: ");
                               int quantity = scanner.nextInt();
                               total += emopizzap[order - 1] * quantity;
                               write.write("You ordered " + emopizza[order - 1] + " Rs." + emopizzap[order - 1] + "\n");
                               write.write("Quantity: " + quantity + "\n");
                               System.out.println("\nYou ordered " + emopizza[order - 1]);
                               System.out.println("Your order was successfully saved");

                               if (order > 9 || order < 1) {
                                   System.out.println("Invalid order. Please select a valid order.");
                                   continue;
                               }

                               System.out.print("\nDo you want another order (yes/no): ");
                               ye = scanner.next();

                               if (ye.equalsIgnoreCase("no")) {
                                   changeOrder2 = false;
                                   displaygenbill();
                                   displayrecipt(total);
                                   write.write("\t\t\t\tTOTAL BILL IS: " + total);
                                   write.close();
                               }
                           }
                       }
                   } catch (IOException e) {
                       System.out.println("Error writing to file.");
                   }}
            else if (ch == 3){
                displayselectitem();
                displaysubway();
                int total = 0;
                try {
                       FileWriter write = new FileWriter("order.txt");
                       boolean changeOrder3 = true;

                       while (changeOrder3) {
                           System.out.print("\nEnter your order (one order at a time): ");
                           int order = scanner.nextInt();
                           System.out.print("\nDo you want to change your order (y/n): ");
                           ye = scanner.next();

                           if (ye.equalsIgnoreCase("n")) {
                               System.out.print("\nEnter the Quantity: ");
                               int quantity = scanner.nextInt();
                               total += subwayp[order - 1] * quantity;
                               write.write("You ordered " + subwayp[order - 1] + " Rs." + subwayp[order - 1] + "\n");
                               write.write("Quantity: " + quantity + "\n");
                               System.out.println("\nYou ordered " + subway[order - 1]);
                               System.out.println("Your order was successfully saved");

                               if (order > 9 || order < 1) {
                                   System.out.println("Invalid order. Please select a valid order.");
                                   continue;
                               }

                               System.out.print("\nDo you want another order (yes/no): ");
                               ye = scanner.next();

                               if (ye.equalsIgnoreCase("no")) {
                                   changeOrder3 = false;
                                   displaygenbill();
                                   displayrecipt(total);
                                   write.write("\t\t\t\tTOTAL BILL IS: " + total);
                                   write.close();
                               }
                           }
                       }
                   } catch (IOException e) {
                       System.out.println("Error writing to file.");
                   }}
            else if (ch == 4){
                displayselectitem();
                displaybliss();
                int total = 0;
                   try {
                       FileWriter write = new FileWriter("order.txt");
                       boolean changeOrder4 = true;

                       while (changeOrder4) {
                           System.out.print("\nEnter your order (one order at a time): ");
                           int order = scanner.nextInt();
                           System.out.print("\nDo you want to change your order (y/n): ");
                           ye = scanner.next();

                           if (ye.equalsIgnoreCase("n")) {
                               System.out.print("\nEnter the Quantity: ");
                               int quantity = scanner.nextInt();
                               total += blissp[order - 1] * quantity;
                               write.write("You ordered " + bliss[order - 1] + " Rs." + blissp[order - 1] + "\n");
                               write.write("Quantity: " + quantity + "\n");
                               System.out.println("\nYou ordered " + bliss[order - 1]);
                               System.out.println("Your order was successfully saved");

                               if (order > 9 || order < 1) {
                                   System.out.println("Invalid order. Please select a valid order.");
                                   continue;
                               }

                               System.out.print("\nDo you want another order (yes/no): ");
                               ye = scanner.next();

                               if (ye.equalsIgnoreCase("no")) {
                                   changeOrder4 = false;
                                   displaygenbill();
                                   displayrecipt(total);
                                   write.write("\t\t\t\tTOTAL BILL IS: " + total);
                                   write.close();
                               }
                           }
                       }
                   } catch (IOException e) {
                       System.out.println("Error writing to file.");
                   }}
            else if (ch == 5){
                displayselectitem();
                displaycakecastle();
                int total = 0; 
                   try {
                       FileWriter write = new FileWriter("order.txt");
                       boolean changeOrder5 = true;

                       while (changeOrder5) {
                           System.out.print("\nEnter your order (one order at a time): ");
                           int order = scanner.nextInt();
                           System.out.print("\nDo you want to change your order (y/n): ");
                           ye = scanner.next();

                           if (ye.equalsIgnoreCase("n")) {
                               System.out.print("\nEnter the Quantity: ");
                               int quantity = scanner.nextInt();
                               total += cakecastlep[order - 1] * quantity;
                               write.write("You ordered " + cakecastle[order - 1] + " Rs." + cakecastlep[order - 1] + "\n");
                               write.write("Quantity: " + quantity + "\n");
                               System.out.println("\nYou ordered " + cakecastle[order - 1]);
                               System.out.println("Your order was successfully saved");

                               if (order > 9 || order < 1) {
                                   System.out.println("Invalid order. Please select a valid order.");
                                   continue;
                               }

                               System.out.print("\nDo you want another order (yes/no): ");
                               ye = scanner.next();

                               if (ye.equalsIgnoreCase("no")) {
                                   changeOrder5 = false;
                                   displaygenbill();
                                   displayrecipt(total);
                                   write.write("\t\t\t\tTOTAL BILL IS: " + total);
                                   write.close();
                               }
                           }
                       }
                   } catch (IOException e) {
                       System.out.println("Error writing to file.");
                   }}
            else if (ch == 6){
                displayselectitem();
                displaybutty();
                int total = 0; 
                   try {
                       FileWriter write = new FileWriter("order.txt");
                       boolean changeOrder6 = true;

                       while (changeOrder6) {
                           System.out.print("\nEnter your order (one order at a time): ");
                           int order = scanner.nextInt();
                           System.out.print("\nDo you want to change your order (y/n): ");
                           ye = scanner.next();

                           if (ye.equalsIgnoreCase("n")) {
                               System.out.print("\nEnter the Quantity: ");
                               int quantity = scanner.nextInt();
                               total += buttyp[order - 1] * quantity;
                               write.write("You ordered " + butty[order - 1] + " Rs." + buttyp[order - 1] + "\n");
                               write.write("Quantity: " + quantity + "\n");
                               System.out.println("\nYou ordered " + butty[order - 1]);
                               System.out.println("Your order was successfully saved");

                               if (order > 9 || order < 1) {
                                   System.out.println("Invalid order. Please select a valid order.");
                                   continue;
                               }

                               System.out.print("\nDo you want another order (yes/no): ");
                               ye = scanner.next();

                               if (ye.equalsIgnoreCase("no")) {
                                   changeOrder6 = false;
                                   displaygenbill();
                                   displayrecipt(total);
                                   write.write("\t\t\t\tTOTAL BILL IS: " + total);
                                   write.close();
                               }
                           }
                       }
                   } catch (IOException e) {
                       System.out.println("Error writing to file.");
                   }}
            else if (ch == 7){
                displayselectitem();
                displayandhratiffin();
                int total = 0; 
                
                   try {
                       FileWriter write = new FileWriter("order.txt");
                       boolean changeOrder7 = true;

                       while (changeOrder7) {
                           System.out.print("\nEnter your order (one order at a time): ");
                           int order = scanner.nextInt();
                           System.out.print("\nDo you want to change your order (y/n): ");
                           ye = scanner.next();

                           if (ye.equalsIgnoreCase("n")) {
                               System.out.print("\nEnter the Quantity: ");
                               int quantity = scanner.nextInt();
                               total += andhratiffinp[order - 1] * quantity;
                               write.write("You ordered " + andhratiffin[order - 1] + " Rs." + andhratiffinp[order - 1] + "\n");
                               write.write("Quantity: " + quantity + "\n");
                               System.out.println("\nYou ordered " + andhratiffin[order - 1]);
                               System.out.println("Your order was successfully saved");

                               if (order > 9 || order < 1) {
                                   System.out.println("Invalid order. Please select a valid order.");
                                   continue;
                               }

                               System.out.print("\nDo you want another order (yes/no): ");
                               ye = scanner.next();

                               if (ye.equalsIgnoreCase("no")) {
                                   changeOrder7 = false;
                                   displaygenbill();
                                   displayrecipt(total);
                                   write.write("\t\t\t\tTOTAL BILL IS: " + total);
                                   write.close();
                               }
                           }
                       }
                   } catch (IOException e) {
                       System.out.println("Error writing to file.");
                   }}
            else if (ch == 8){
                displayselectitem();
                displayamulparlour();
                int total = 0; 
                
                   try {
                       FileWriter write = new FileWriter("order.txt");
                       boolean changeOrder8 = true;

                       while (changeOrder8) {
                           System.out.print("\nEnter your order (one order at a time): ");
                           int order = scanner.nextInt();
                           System.out.print("\nDo you want to change your order (y/n): ");
                           ye = scanner.next();

                           if (ye.equalsIgnoreCase("n")) {
                               System.out.print("\nEnter the Quantity: ");
                               int quantity = scanner.nextInt();
                               total += amulparlourp[order - 1] * quantity;
                               write.write("You ordered " + amulparlour[order - 1] + " Rs." + amulparlourp[order - 1] + "\n");
                               write.write("Quantity: " + quantity + "\n");
                               System.out.println("\nYou ordered " + amulparlour[order - 1]);
                               System.out.println("Your order was successfully saved");

                               if (order > 9 || order < 1) {
                                   System.out.println("Invalid order. Please select a valid order.");
                                   continue;
                               }

                               System.out.print("\nDo you want another order (yes/no): ");
                               ye = scanner.next();

                               if (ye.equalsIgnoreCase("no")) {
                                   changeOrder8 = false;
                                   displaygenbill();
                                   displayrecipt(total);
                                   write.write("\t\t\t\tTOTAL BILL IS: " + total);
                                   write.close();
                               }
                           }
                       }
                   } catch (IOException e) {
                       System.out.println("Error writing to file.");
                   }}
            else if (ch == 9){
                displayselectitem();
                displaylathasupermarket();
                int total = 0; 
                
                   try {
                       FileWriter write = new FileWriter("order.txt");
                       boolean changeOrder9 = true;

                       while (changeOrder9) {
                           System.out.print("\nEnter your order (one order at a time): ");
                           int order = scanner.nextInt();
                           System.out.print("\nDo you want to change your order (y/n): ");
                           ye = scanner.next();

                           if (ye.equalsIgnoreCase("n")) {
                               System.out.print("\nEnter the Quantity: ");
                               int quantity = scanner.nextInt();
                               total += lathasupermarketp[order - 1] * quantity;
                               write.write("You ordered " + lathasupermarket[order - 1] + " Rs." + lathasupermarketp[order - 1] + "\n");
                               write.write("Quantity: " + quantity + "\n");
                               System.out.println("\nYou ordered " + lathasupermarket[order - 1]);
                               System.out.println("Your order was successfully saved");

                               if (order > 9 || order < 1) {
                                   System.out.println("Invalid order. Please select a valid order.");
                                   continue;
                               }

                               System.out.print("\nDo you want another order (yes/no): ");
                               ye = scanner.next();

                               if (ye.equalsIgnoreCase("no")) {
                                   changeOrder9 = false;
                                   displaygenbill();
                                   displayrecipt(total);
                                   write.write("\t\t\t\tTOTAL BILL IS: " + total);
                                   write.close();
                               }
                           }
                       }
                   } catch (IOException e) {
                       System.out.println("Error writing to file.");
                   }}}
            else{
                System.out.println("\n\n\t\t\t\tYOU ENTERED WRONG KEY !!!");
            }
            System.out.print("\n\t Do You Want to visit Another shop(yes/no): ");
            y = scanner.next();
        }while(y.equalsIgnoreCase("YES"));

                
            
                System.out.println("\n\t\t\t\tTHANK YOU FOR YOUR visiting java ");
                for (int loop = 1; loop < 8; loop++) {
                    System.out.print("...");
                }
                System.out.println("\n\t\t\t\t");
                scanner.close();

        }
       
    };
