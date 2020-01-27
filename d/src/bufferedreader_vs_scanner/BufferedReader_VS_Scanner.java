
package bufferedreader_vs_scanner;
import java.io.*;
import java.util.*;

public class BufferedReader_VS_Scanner {

    public static void main(String[] args) throws IOException {
        File myFile=new File ("FileEs.txt");
        
        if(myFile.exists()){ // per evitare che si crei in continuazione
        myFile.delete();
    }
        myFile.createNewFile(); // creazione File 
        
        FileWriter MyFileWriter=new FileWriter(myFile); // necessario per scrivere
       
      
        
        
        
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 5; j++) {
                
            
             int a=(int)(Math.random()*255);
             MyFileWriter.write(a+" ");
            }
           MyFileWriter.write(System.getProperty("line.separator"));
            
        }
        
        
        
    }
    
}
