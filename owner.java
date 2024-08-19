import java.util.Scanner;
public class owner extends Shop{
    int item, x, ch, price, a, c, d, e, f, g, h, i, j, k, l;
    String y, ye, newi;
    Scanner sc = new Scanner(System.in);

    void shopfoodowner()
    {
    do{ 
        System.out.print("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t =========================== SHOPS IN JAVA ===========================  \t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n");
        displayShops();
        System.out.print("\n\n\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t ============================ 1-VISIT SHOPS ============================  \t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n");
        System.out.print("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t =================== 2-UPDATE EXISTING ITEM FROM SHOPS ==================  \t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n");
        System.out.print("\n\n\t PLEASE ENTER OPERATION NO. WHICH YOU WANNA PERFORM: ");
        x=sc.nextInt();
        if (x == 1){
        String n=null;
           do{ 
            System.out.print("\n\n\t PLEASE ENTER SHOP NO. WHICH YOU WANNA VISIT (one SHOP at a time): ");
            ch=sc.nextInt();
            switch (ch){
            case 1:
                displayiteminshop();
                displayyurish();
                System.out.print("\n\n\t DO YOU WANT TO VISIT ANOTHER SHOP (Y/N): ");
                n = sc.next();
                break;
            case 2:
                displayiteminshop();
                displayemopizza();
                System.out.print("\n\n\t DO YOU WANT TO VISIT ANOTHER SHOP (Y/N): ");
                n = sc.next();
                break;
            case 3:
                displayiteminshop();
                displaysubway();
                System.out.print("\n\n\t DO YOU WANT TO VISIT ANOTHER SHOP (Y/N): ");
                n = sc.next();
                break;
            case 4:
                displayiteminshop();
                displaybliss();
                System.out.print("\n\n\t DO YOU WANT TO VISIT ANOTHER SHOP (Y/N): ");
                n = sc.next();
                break;
            case 5:
                displayiteminshop();
                displaycakecastle();
                System.out.print("\n\n\t DO YOU WANT TO VISIT ANOTHER SHOP (Y/N): ");
                n = sc.next();
                break;
            case 6: 
                displayiteminshop();
                displaybutty();
                System.out.print("\n\n\t DO YOU WANT TO VISIT ANOTHER SHOP (Y/N): ");
                n = sc.next();
                break;
            case 7:
                displayiteminshop();
                displayandhratiffin();
                System.out.print("\n\n\t DO YOU WANT TO VISIT ANOTHER SHOP (Y/N): ");
                n = sc.next();
                break;
            case 8:
                displayiteminshop();
                displayamulparlour();
                System.out.print("\n\n\t DO YOU WANT TO VISIT ANOTHER SHOP (Y/N): ");
                n = sc.next();
                break;
            case 9:
                displayiteminshop();
                displaylathasupermarket();
                System.out.print("\n\n\t DO YOU WANT TO VISIT ANOTHER SHOP (Y/N): ");
                n = sc.next();
                break;
            default:
                System.out.println("\n\n\t\t\t\tYOU ENTERED WRONG KEY !!!");
                System.out.print("\n\n\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t ============================ 1-VISIT SHOPS ============================  \t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n");
                System.out.print("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t =================== 2-UPDATE EXISTING ITEM FROM SHOPS ==================  \t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n");
                System.out.print("\n\n\t PLEASE ENTER OPERATION NO. WHICH YOU WANNA PERFORM: ");
            }}while( n.equalsIgnoreCase("y"));
        }
        else if (x == 2){
            System.out.print("\n\n\t PLEASE ENTER SHOP NO. WHOSE ITEM YOU WANNA UPDATE (one SHOP at a time): ");
            ch=sc.nextInt();
            switch (ch){
            case 1:
                displayiteminshop();
                displayyurish();
                do{
                    System.out.print("\n\n\t WHICH EXISTING ITEM NO. YOU WANNA UPDATE: ");
                    item=sc.nextInt();
                    System.out.print("\n\n\t ENTER NEW ITEM: ");
                    sc.nextLine();
                    newi=sc.nextLine();
                    yurish[item - 1] = newi;
                    System.out.print("\n\n\t ENTER PRICE OF THIS ITEM: ");
                    price=sc.nextInt();
                    yurishp[item - 1] = price;
                    System.out.print("\n\t DO YOU WANT TO UPDATE ANOTHER ITEM(y/n):");
                    sc.nextLine();
                    y=sc.nextLine();
                }while(y.equalsIgnoreCase("y"));
                break;
            case 2:
                displayiteminshop();
                displayemopizza();
                do{
                System.out.print("\n\n\t WHICH EXISTING ITEM NO. YOU WANNA UPDATE: ");
                item=sc.nextInt();
                System.out.print( "\n\n\t ENTER NEW ITEM: ");
                sc.nextLine();
                newi=sc.nextLine();
                emopizza[item - 1] = newi;
                System.out.print("\n\n\t ENTER PRICE OF THIS ITEM: ");
                price=sc.nextInt();
                emopizzap[item - 1] = price;
                System.out.print("\n\t DO YOU WANT TO UPDATE ANOTHER ITEM(y/n):");
                sc.nextLine();
                y=sc.nextLine();
                }while(y.equalsIgnoreCase("y"));
                break;
            case 3:
                displayiteminshop();
                displaysubway();
                do{
                System.out.print("\n\n\t WHICH EXISTING ITEM NO. YOU WANNA UPDATE: ");
                item=sc.nextInt();
                System.out.print("\n\n\t ENTER NEW ITEM: ");
                sc.nextLine();
                newi=sc.nextLine();
                subway[item - 1] = newi;
                System.out.print("\n\n\t ENTER PRICE OF THIS ITEM: ");
                price=sc.nextInt();
                subwayp[item - 1] = price;
                System.out.print("\n\t DO YOU WANT TO UPDATE ANOTHER ITEM(y/n):");
                sc.nextLine();
                y=sc.nextLine();
                }while(y.equalsIgnoreCase("y"));
                break;
            case 4:
                displayiteminshop();
                displaybliss();
                do{
                System.out.print("\n\n\t WHICH EXISTING ITEM NO. YOU WANNA UPDATE: ");
                item=sc.nextInt();
                System.out.print("\n\n\t ENTER NEW ITEM: ");
                sc.nextLine();
                newi=sc.nextLine();
                bliss[item - 1] = newi;
                System.out.print("\n\n\t ENTER PRICE OF THIS ITEM: ");
                price=sc.nextInt();
                blissp[item - 1] = price;
                System.out.print("\n\t DO YOU WANT TO UPDATE ANOTHER ITEM(y/n):");
                sc.nextLine();
                y=sc.nextLine();
                }while(y.equalsIgnoreCase("y"));
                break;
            case 5:
                displayiteminshop();
                displaycakecastle();
                do{
                System.out.print("\n\n\t WHICH EXISTING ITEM NO. YOU WANNA UPDATE: ");
                item=sc.nextInt();
                System.out.print("\n\n\t ENTER NEW ITEM: ");
                sc.nextLine();
                newi=sc.nextLine();
                cakecastle[item - 1] = newi;
                System.out.print("\n\n\t ENTER PRICE OF THIS ITEM: ");
                price=sc.nextInt();
                cakecastlep[item - 1] = price;
                System.out.print("\n\t DO YOU WANT TO UPDATE ANOTHER ITEM(y/n):");
                sc.nextLine();
                y=sc.nextLine();
                }while(y.equalsIgnoreCase("y"));
                break;
            case 6:
                displayiteminshop();
                displaybutty();
                do{
                System.out.print("\n\n\t WHICH EXISTING ITEM NO. YOU WANNA UPDATE: ");
                item=sc.nextInt();
                System.out.print("\n\n\t ENTER NEW ITEM: ");
                sc.nextLine();
                newi=sc.nextLine();
                butty[item - 1] = newi;
                System.out.print("\n\n\t ENTER PRICE OF THIS ITEM: ");
                price=sc.nextInt();
                buttyp[item - 1] = price;
                System.out.print("\n\t DO YOU WANT TO UPDATE ANOTHER ITEM(y/n):");
                sc.nextLine();
                y=sc.nextLine();
                }while(y.equalsIgnoreCase("y"));
                break;
            case 7:
                displayiteminshop();
                displayandhratiffin();
                do{
                System.out.print("\n\n\t WHICH EXISTING ITEM NO. YOU WANNA UPDATE: ");
                item=sc.nextInt();
                System.out.print("\n\n\t ENTER NEW ITEM: ");
                sc.nextLine();
                newi=sc.nextLine();
                andhratiffin[item - 1] = newi;
                System.out.print("\n\n\t ENTER PRICE OF THIS ITEM: ");
                price=sc.nextInt();
                andhratiffinp[item - 1] = price;
                System.out.print("\n\t DO YOU WANT TO UPDATE ANOTHER ITEM(y/n):");
                sc.nextLine();
                y=sc.nextLine();
                }while(y.equalsIgnoreCase("y"));
                break;
            case 8:
                displayiteminshop();
                displayamulparlour();
                do{
                System.out.print("\n\n\t WHICH EXISTING ITEM NO. YOU WANNA UPDATE: ");
                item=sc.nextInt();
                System.out.print( "\n\n\t ENTER NEW ITEM: ");
                sc.nextLine();
                newi=sc.nextLine();
                amulparlour[item - 1] = newi;
                System.out.print( "\n\n\t ENTER PRICE OF THIS ITEM: ");
                price=sc.nextInt();
                amulparlourp[item - 1] = price;
                System.out.print("\n\t DO YOU WANT TO UPDATE ANOTHER ITEM(y/n):");
                sc.nextLine();
                y=sc.nextLine();
                }while(y.equalsIgnoreCase("y"));
                break;
            case 9:
                displayiteminshop();
                displaylathasupermarket();
                do{
                System.out.print("\n\n\t WHICH EXISTING ITEM NO. YOU WANNA UPDATE: ");
                item=sc.nextInt();
                System.out.print("\n\n\t ENTER NEW ITEM: ");
                sc.nextLine();
                newi=sc.nextLine();
                lathasupermarket[item - 1] = newi;
                System.out.print("\n\n\t ENTER PRICE OF THIS ITEM: ");
                price=sc.nextInt();
                lathasupermarketp[item - 1] = price;
                System.out.print("\n\t DO YOU WANT TO UPDATE ANOTHER ITEM(y/n):");
                sc.nextLine();
                y=sc.nextLine();
                }while(y.equalsIgnoreCase("y"));
                break;
            default:
                System.out.print("\n\n\t\t\t\tYOU ENTERED WRONG KEY !!!\n" );
            }
        }
        System.out.print("\n\t DO YOU WANT TO PERFORM ANOTHER OPERATION(yes/no):");
        sc.nextLine();
        ye=sc.nextLine();
        System.out.println("\n\n\n");
    }while(ye.equalsIgnoreCase("yes"));
        System.out.print("\n\t\t\t\tTHANK YOU FOR YOUR VISITING JAVA ");
        for (int loop = 1; loop < 8; loop++){
                System.out.print("...");
        }
        System.out.print("\n\t\t\t\t");
    }
};
