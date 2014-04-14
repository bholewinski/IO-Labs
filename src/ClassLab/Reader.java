package ClassLab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Bholewinski
 */
public class Reader {
    public static void main(String[] args) throws IOException {
        
       
        File data = new File("src" + File.separatorChar + "classLab.txt");
        List<Contact> contacts = new ArrayList<Contact>();
        List<String> myList = new ArrayList<String>();
        int counter = 0;
        BufferedReader in = null;
        Contact temp = new Contact();
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            
            while (line != null) {
                
                //myList.add(line);
                //line = in.readLine();
                
                
                if(counter==0){
                    temp = new Contact();
                    temp.setFirstName(line);
                    line = in.readLine();
                    counter++;
                } else if (counter==1) {
                    temp.setLastName(line);
                    line = in.readLine();
                    counter++;
                } else if (counter==2) {
                    temp.setStreetAddress(line);
                    line = in.readLine();
                    counter++;
                } else if (counter==3) {
                    temp.setCity(line);
                    line = in.readLine();
                    counter++;
                } else if (counter==4) {
                    temp.setZipCode(line);
                    line = in.readLine();
                    counter++;
                } else if (counter==5) {
                    temp.setState(line);
                    line = in.readLine();
                    counter++;
                } else if (counter==6) {
                    temp.setEmail(line);
                    line = in.readLine();
                    counter++;
                } else if (counter==7) {
                    temp.setPhone(line);
                    line = in.readLine();
                    //System.out.println(temp.toString());
                    contacts.add(temp);
                    counter = 0;

                }
                        
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.out.println("Could not close stream");
            }
        }
        
        Set <Contact>contactSet = new <Contact>HashSet(contacts);
        contacts = new ArrayList(contactSet);
        
        for(int i=0;i<contacts.size();i++){
            System.out.println(contacts.get(i).toString());
        }
        
        // start of writer
//        
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("What record do you want to see?");
//        int record = keyboard.nextInt();
//        int begin = record*8 - 8;
//        int end = record*8;
//        // 0 - 8 for one
//        //int counter=0;
//        
//        try{
//        for(String str:myList){
//            
//            if(counter>=begin&&counter<end) {
//                
//            }
//            counter++;
//        }
//        } catch (IllegalArgumentException iae){
//            System.out.println("Sorry, there are only " + myList.size()/7 + " entries");
//        }
    }
       
}
