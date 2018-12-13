//shopping project


import java.io.*;
import java.util.*;



class item{
        String itemName;
        int mrp;
        public  void addItem(String a,int b){
            this.itemName = a;
            this.mrp = b;
        }    

}

class customerName{
    //name and id of the customer
    //setName and getName methods
    String name ;
    public void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchasers name: ");
        name = sc.nextLine();
    }
}
class bill extends customerName{
    //bill no & date
    //methods like totalAmt ,printBill,discount
    public static String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
    
        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
    String billNo;
    String date;
    public void getBill(){
        super.setName();
        billNo = getRandomNumberString();
        Date d = new Date();
        date = d.toString();
        System.out.println('\n');
        System.out.println("-------------------------------------------------------");
        System.out.println("|  Bill No: "+billNo+" "+date+'\n');
        System.out.println("|  Customers Name: "+ name+'\n');
    }

}

class cart extends bill{
    //one cart one bill
    List<item> inCart = new ArrayList<item>();
    List<Integer> quant = new ArrayList<Integer>();
    int noOfItems=0;
    public void updateCart(item a,int q ){
        this.inCart.add(a);
        this.quant.add(q);
        noOfItems++;

    }
    int totalAmt=0;
    public void finalizeCart(){
        super.getBill();
        for(int i=0;i<noOfItems;i++){
            System.out.println("|  "+ inCart.get(i).itemName + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
            totalAmt += (inCart.get(i).mrp*quant.get(i));
        }
        System.out.println("total Amount: "+ Integer.toString(totalAmt));
    }

}





public class shop{
 
    static item [] itemAvailable = new item[50];
    // static item[] inCart = new item[20];
    

    public static void main(String args[]){
        for(int i=0;i<50;i++){
            itemAvailable[i] = new item();
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
        cart c1 = new cart();
        take1 = sc.nextInt(); //product name
        while(take1 != -1){
            take2 = sc.nextInt(); //quantity
            c1.updateCart(itemAvailable[take1], take2);
            take1 = sc.nextInt();
            
        }
        sc.nextLine();
        System.out.println("type yes to generate the bill :");
        String s = sc.nextLine();
        if(s.equals("yes")){
        
        c1.finalizeCart();
        System.out.println("-------------------------------------------------");
        // System.out.println("Checkout? Enter your Name:");

        }else{
            System.out.println("Try again!");
        }

    }
}