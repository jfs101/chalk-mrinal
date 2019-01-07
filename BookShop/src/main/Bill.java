package main;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

//import main.CustomerName;

public class Bill extends CustomerName{
    //bill no & date
    //methods like totalAmt ,printBill,discount
    public static String getRandomNumberString() {
        // It wishopTestll generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
    
        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
    String billNo;
    String date;
    public void getBill(String name){
        billNo = getRandomNumberString();
        Date d = new Date();
        date = d.toString();
        System.out.println('\n');
        System.out.println("-------------------------------------------------------");
        System.out.println("|  Bill No: "+billNo+" "+date+'\n');
        System.out.println("|  Customers Name: "+ name+'\n');
    }
}