/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kenne
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] records = new String[100];
        
        
        try {
            Scanner reader = new Scanner(new File(args[0]));
            
            int curIndex = 0;
            while(reader.hasNext()){
                String [] line = reader.nextLine().split(",");
                
                String firstname = line[0];
                String lastname = line[1];
                String gender = line[2];
                String age = line[3];
                String phonenumber = line[4];
                String emailadress = line[5];
                
              
                records[curIndex] = String.format("%-8s,%-8s,%-6s,%-3s,%-10s,%-20s",firstname,lastname,gender,age,phonenumber,emailadress);
                System.out.println(records[curIndex]);
              //  records[curIndex] = String.format("");
                curIndex++;
                
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringProcessing.class.getName()).log(Level.SEVERE, null, ex);
            System.err.print("File was not found");
        }
    }
    
}
