package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
        
        boolean append = true;  
	File datar = new File("src" + File.separatorChar + "myFile.txt");

	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(datar, append)));

        int counter=0;
        for(String str:myList){
            System.out.println(str);
            counter++;
        }
    } 
        
}
