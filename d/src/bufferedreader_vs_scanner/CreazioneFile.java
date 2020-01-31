/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader_vs_scanner;

import java.io.*;
import java.util.*;

/**
 *
 * @author zacchello.riccardo
 */
public class CreazioneFile {
    
    public void CreazioneFile()throws IOException {
       File myFile=new File ("FileEs.txt");
        
        if(myFile.exists()){ // per evitare che si crei in continuazione
        myFile.delete();
    }
        myFile.createNewFile(); // creazione File 
        
        FileWriter MyFileWriter=new FileWriter(myFile); // necessario per scrivere
       
      
        
        
        
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 5; j++) {
                
            
             int a=(int)(Math.random()*254);
             MyFileWriter.write(a+" ");
            }
           MyFileWriter.write(System.getProperty("line.separator"));
        }
        }
        
        
        
}
