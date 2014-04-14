package lab2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Bholewinski
 */
public class Reader {
    public static void main(String[] args) throws IOException {
        
       
        File data = new File("src" + File.separatorChar + "myFile.txt");
        List<String> myList = new ArrayList<String>();
        
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            
            while (line != null) {
                myList.add(line);
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println("Error. Cannot read specified file. Please try again.");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.out.println("Cannot close stream");
            }
        }
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which record would you like to see?");
        int record = keyboard.nextInt();
        int begin = record*8 - 8;
        int end = record*8;

        int counter=0;
        
        try{
        for(String str:myList){
            
            if(counter>=begin&&counter<end)
            System.out.println(str);
            counter++;
        }
        } catch (IllegalArgumentException iae){
            System.out.println("Sorry, there are " + myList.size()/7 + " entries and you must choose one of those.");
        }
    }
       
}
