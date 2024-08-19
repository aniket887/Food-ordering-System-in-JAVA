public class Shop {
        String[] shopName = {"YURISH        ", "EMO PIZZA     ", "SUBWAY        ", "BLISS         ", "CAKE CASTLE   ", "BUTTY'S       ", "ANDHRA TIFFINS", "AMUL PARLOUR  ", "LATHA SUPER MARKET"};
        String[] yurish = {"Apple juice(Rs.40)     ", "Mango juice(Rs.45)     ", "Lemon juice(Rs.35)     ", "Watermelon juice(Rs.40)", "Mixed Fruits(Rs.50)    ", "Coconut water(Rs.40)   ", "Kitkat Shake(Rs.60)   ", "Chocolate Shake(Rs.60)", "Oreo Shake(Rs.50)       "};
        int[] yurishp = {40, 45, 35, 40, 50, 40, 60, 60, 50};
        String[] emopizza = {"Veggie Supreme(Rs.480)", "Exotica Pizza(Rs.440)   ", "Chicken Sizzler(Rs.580)", "Chrispy Chicken (Rs.520)", "Spaghetti (Rs.350)     ", "Country Feast (Rs.400)", "Tetrazzini (Rs.420)", "Double Cheese (Rs.540)", "Makizushi (Rs.548)     "};
        int[] emopizzap = {480, 440, 580, 520, 350, 400, 450, 540, 550};
        String[] subway = {"Aloo Patty(Rs.160)    ", "Paneer Tikka(Rs.170) ", "Chicken Tikka(Rs.175) ", "Chicken Tandoori(Rs.180)", "Turkey Breast(Rs.195)", "Chicken Tariyaki(Rs.200)", "Veggie Delight(Rs.140)", "Tuna(Rs.210)         ", "Veggie Patty(Rs.148)   "};
        int[] subwayp = {160, 170, 175, 180, 195, 200, 240, 210, 150};
        String[] bliss = {"ChickenDum Biryani(Rs.120)", "Lolipop Biryani(Rs.120)", "Veg Biriyani(Rs.70)", "Paneer Biriyani(Rs.90)", "Chicken noodles(Rs.80)", "Paneer noodles(Rs.80)", "Chicken 65(Rs.90)     ", "Gobi 65 (Rs.80)     ", "paneer 65(Rs.80)     "};
        int[] blissp = {120, 120, 70, 90, 80, 80, 90, 80, 80};
        String[] cakecastle = {"Veg Puff(Rs.15)     ", "Chicken Puff(Rs.25)", "Black Forest PastryRs.55)", "Cup Cake(Rs.55)     ", "Red Velvet Pastry(Rs.75)", "Rainbow Roll Pastry(Rs.50)", "Brownie icecream(Rs.110)", "White Forest Pastry(Rs.60)", "Choco Mousse Cup (Rs.50)"};
        int[] cakecastlep = {15, 25, 55, 55, 75, 50, 110, 60, 50};
        String[] butty = {"Chicken Biriyani(Rs.100)", "Lollipop Biriyani(Rs.130)", "Veg Biriyani (Rs.80)", "Paneer Biriyani(Rs.90)", "Chicken noodles(Rs.90)", "Paneer noodles(Rs.80)", "Chicken Roll (Rs.60)", "Shawarma roll (Rs.90)", "Paneer roll (Rs.60)"};
        int[] buttyp = {100, 130, 80, 90, 90, 80, 60, 90, 60};
        String[] andhratiffin = {"Plain Dosa(Rs.30)   ", "Karam Dosa(Rs.40)     ", "Egg Dosa(Rs.40)    ", "Ghee Dosa(Rs.50)   ", "Chicken Dosa(Rs.60)", "Onion Uttapam(Rs.40)", "Mirchi Bajji(Rs.30)", "Egg Bajji(Rs.30)    ", "Onion Bajji(Rs.30)    "};
        int[] andhratiffinp = {30, 40, 40, 50, 60, 40, 30, 50, 30};
        String[] amulparlour = {"Coffee(Rs.15)       ", "Tea(Rs.15)         ", "Lemon tea(Rs.10)    ", "Boost(Rs.20)        ", "Badam Milk(Rs.20)    ", "Cookies & Icecream(Rs.50)", "Chocochip IceCream(Rs.40)", "Almond IceCream(Rs.60)", "Pudding Cake(Rs.25)"};
        int[] amulparlourp = {15, 15, 10, 20, 20, 50, 40, 60, 25};
        String[] lathasupermarket = {"Pepsi(Rs.20)        ", "Milk Biki's(Rs.10)   ", "Lays (Rs.20)        ", "Britannia cake(Rs.20)", "Max Protein(Rs.150)", "Munch Max (Rs.20)     ", "Diary Milk Silk(Rs.50)", "Oreo ice cream (Rs.70)", "Orbit (Rs.5)        "};
        int[] lathasupermarketp = {20, 10, 20, 20, 150, 20, 50, 70, 5};


    void displayShops() {
        for (int i = 0; i < 9; i++) {
            System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   " + (i + 1) + "-" + shopName[i] + "\t\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        }
    }
    void displayyurish(){
        for (int i = 0; i < 9; i++){

        System.out.println( "\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   " +(i + 1)+ "-" +yurish[i] +"\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588" );
    }}
    void displayemopizza(){
        for (int i = 0; i < 9; i++){
            System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   " +(i +1) + "-" +emopizza[i] +"\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        }
        }
    void displaysubway(){
        for (int i = 0; i < 9; i++){

        System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   " +(i + 1)+ "-"+ subway[i]+ "\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
    }}
    void displaybliss(){
        for (int i = 0; i < 9; i++){

        System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   " +(i + 1)+ "-" + bliss[i]+"\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");        }}
    void displaycakecastle(){
        for (int i = 0; i < 9; i++){

        System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   "+( i + 1)+ "-"+ cakecastle[i]+ "\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588" );
    }}
    void displaybutty(){
        for (int i = 0; i < 9; i++){

        System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   "+ ( i + 1)+ "-"+ butty[i]+ "\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
    }}
    void displayandhratiffin(){
        for (int i = 0; i < 9; i++){
            System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   " +(i + 1)+ "-"+ andhratiffin[i]+"\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        }
    }
    void displayamulparlour(){
        for (int i = 0; i < 9; i++){
            System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   "+( i + 1)+ "-"+ amulparlour[i]+ "\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        }
    }
    void displaylathasupermarket(){
        for (int i = 0; i < 9; i++){
            System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t   " + (i + 1) + "-" + lathasupermarket[i] + "\t\t\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        }
    }
    void displayrecipt(int total){
        
    System.out.println("\n\t\t\t\t ================================================" );
    System.out.println( "\t\t\t\t|               Food Orderig System             |" );
    System.out.println( "\t\t\t\t ===============================================" );
    System.out.println();
    System.out.println();
    System.out.println( "\t\t\t\t  Bill No : CP51           Order : NB1353" );
    System.out.println();
    System.out.println();
    System.out.println( "\t\t\t\t  Cashier :  HABIBI" );
    System.out.println();
    System.out.println("\t\t\t\t   YOUR TOTAL BILL IS Rs" + total );
    System.out.println( "\n\t\t\t\t ==============================================" );
    }
    void displaygenbill(){
    System.out.println( "\t\t\t\tTHANK YOU FOR YOUR ORDER :) GENERATING BILL ");
        for (int loop = 1; loop < 8; loop++){
       System.out.println( "...");
        }
        System.out.println( "\n\t\t\t\t");
        
    }
    void displayiteminshop(){
        System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t =========================== ITEMS IN SHOP ===========================  \t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n");
    }
    void displayselectitem(){
        System.out.println("\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t  =============== please select items no. from the menu ===============\t\t\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n"
);
    }
};
