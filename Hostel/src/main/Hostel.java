package main;

import java.io.*;
import java.util.*;

public class Hostel{
       public static void allotHostel()throws IOException{
           BufferedWriter out = null;
           try{
            out = new BufferedWriter(new FileWriter("allotedhostel.txt"));
               try{
                BufferedReader br = new BufferedReader(new FileReader("hostel.txt"));
                String line = null;
                int r = 101;
                while ((line = br.readLine()) != null) {
                    String[] splited = line.split("\\s+");
                    
                    out.write(splited[0] +" "+ splited[1]+" "+ Integer.toString(r++));
                    out.newLine();
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
           }catch(Exception e){
               //print
               System.out.println(e);
               
           }finally{
               out.close();
           }
       }

       public static boolean verifyStudent(int regNo){
         try{
             BufferedReader br = new BufferedReader(new FileReader("hostel.txt"));
               String line = null;
            while ((line = br.readLine()) != null) {
                String[] splited = line.split("\\s+");
//                System.out.println(splited[1]);
//                System.out.println(regNo);
                String reg = Integer.toString(regNo);
                    if(splited[1].equals(reg) ){
                        return false;
                    }
                }
            }catch(Exception e){
                System.out.println(e);
            }
            return true;
        }
           
       public static boolean verifyName(String name)throws IOException{
        try{
             BufferedReader br = new BufferedReader(new FileReader("hostel.txt"));
               String line = null;
            while ((line = br.readLine()) != null) {
                String[] splited = line.split("\\s+");
//                System.out.println(splited[0]);
//                System.out.println(name);
                    if(splited[0].equals(name)){
                        return false;
                    }
                }
            }catch(Exception e){
                System.out.println(e);
            }
            return true;
        }
        
        static String typeName(){
            Scanner sc = new Scanner(System.in);
            String name;
            System.out.println("Enter the student name:(Type exit to exit) ");
            name = sc.nextLine();
            return name;
        }


    public static void main(String args[])throws IOException {



        BufferedWriter out = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hostel Management \n Enter the record of students! \n Type exit to end!");
        String name  = typeName();
        
        while(!name.equals("exit")){

            
            System.out.println("Enter the Reg No of the student");
            int regNo = sc.nextInt();
            sc.nextLine();
            //verify Register number using a function verifyStudent
            boolean checkStu = verifyStudent(regNo);
            boolean checkName = verifyName(name);
//            mrin
            if(!(checkStu && checkName)){
                System.out.println("User already alloted Hostel!!");
                name = typeName();
                continue;
            }
            String rNo = Integer.toString(regNo);
            try {
                out = new BufferedWriter(new FileWriter("hostel.txt", true));
                if(name !=""){
                    out.write(name + " " + rNo);
                    out.newLine();
                }
            }finally{
                if(out!=null){
                    out.close();
                }
            }
             name = typeName();
        }
       allotHostel();
    }
}