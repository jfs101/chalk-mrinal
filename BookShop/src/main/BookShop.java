package main;
import main.Item;
//shopping project

import main.CustomerName;
import main.Cart;
import java.util.*;

public class BookShop{
 
  public static Item [] itemAvailable = new Item[50];
    // static item[] inCart = new item[20];
    

    public static void main(String args[]){
        for(int i=0;i<50;i++){
            itemAvailable[i] = new Item();
        }

        itemAvailable[0].addItem("maggi", 40);
        itemAvailable[1].addItem("apple", 156);
        itemAvailable[2].addItem("orange", 70);
        itemAvailable[3].addItem("onion", 16);
        itemAvailable[4].addItem("potato", 19);
        itemAvailable[5].addItem("eggs", 168);
        itemAvailable[6].addItem("whole wheat", 45);
        itemAvailable[7].addItem("red label", 140);
        itemAvailable[8].addItem("olive oil", 650);
        itemAvailable[9].addItem("Harpic", 77);
        itemAvailable[10].addItem("Sanitry pads", 14);
        itemAvailable[11].addItem("parachute",36);
        itemAvailable[12].addItem("sunflower oil", 87);
        itemAvailable[13].addItem("nuttella", 240);
        itemAvailable[14].addItem("Dove", 143);
        itemAvailable[15].addItem("colgate", 82);
        itemAvailable[16].addItem("surf excel", 84);

        
        System.out.println("S.no" +"    "+"itemName"+"     "+ "MRP");
        for (int i=0;i<=16;i++){
            System.out.println((i+1)+"    "+itemAvailable[i].itemName+ "    "+itemAvailable[i].mrp + '\n') ;
        }
        System.out.println("Select from the above product and write its quantity[-1 to exit]:(ex- 3 18 , this means you want the 3rd product and the quantity should be 6. )");
        
        int take1,take2;
        int j = 0;
        Scanner sc = new Scanner(System.in);
        Cart c1 = new Cart();
        take1 = sc.nextInt(); //product name
        while(take1 != -1){
            take2 = sc.nextInt(); //quantity
            c1.updateCart(itemAvailable[take1], take2);
            take1 = sc.nextInt();
            
        }
        sc.nextLine();
        System.out.println("type your name to generate the bill :");
        String s = sc.nextLine();
        CustomerName cn = new CustomerName();
        cn.setName(s);
        
        c1.finalizeCart(cn.getName());
        System.out.println("-------------------------------------------------");
        // System.out.println("Checkout? Enter your Name:");


    }
}
